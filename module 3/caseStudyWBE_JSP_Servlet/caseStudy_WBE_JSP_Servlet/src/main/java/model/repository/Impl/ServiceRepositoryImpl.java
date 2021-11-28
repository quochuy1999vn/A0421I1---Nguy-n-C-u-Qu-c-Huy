package model.repository.Impl;

import model.bean.Service;
import model.repository.ServiceRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryImpl implements ServiceRepository {
    String URL = "jdbc:mysql://localhost:3306/casestudy_jsp_and_servlet?useSSL=false";
    String USER = "root";
    String PASSWORD = "123456";

    private static final String INSERT_SERVICE = "INSERT INTO service (service_name, service_area,"
            + " service_cost, service_max_people, standard_room, description_other_convenience, pool_area, number_of_floors) VALUES "
            + " (?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_SERVICE_BY_ID = "select service_id,service_name, service_area," +
            "service_cost, service_max_people, standard_room, description_other_convenience, pool_area, number_of_floors from service where service_id =?";
    private static final String SELECT_SERVICE_BY_NAME = "select service_id,service_name, service_area,\" +\n" +
            "            \"service_cost, service_max_people, standard_room, description_other_convenience, pool_area, number_of_floors from service where service_name like ?";
    private static final String SELECT_ALL_SERVICE = "select * from service";
    private static final String DELETE_SERVICE_SQL = "delete from service where service_id = ?;";
    private static final String UPDATE_SERVICE_SQL = "update service set service_name = ?, service_area = ?," +
            " service_cost = ?, service_max_people = ?, standard_room = ?, description_other_convenience = ?, pool_area = ?, number_of_floors = ?, where service_id = ?;";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public boolean insertService(Service service) {
        Connection connection = null;
        connection = getConnection();
        boolean check = false;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SERVICE);
            preparedStatement.setString(1, service.getService_name());
            preparedStatement.setInt(2, service.getService_area());
            preparedStatement.setDouble(3, service.getService_cost());
            preparedStatement.setInt(4, service.getService_max_people());
            preparedStatement.setString(5, service.getStandard_room());
            preparedStatement.setString(6, service.getDescription_other_convenience());
            preparedStatement.setDouble(7, service.getPool_area());
            preparedStatement.setInt(8, service.getNumber_of_floors());
            check = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    @Override
    public Service selectService(int id) {
        Service service = null;
        Connection connection = null;
        connection = getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SERVICE_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int area = resultSet.getInt("area");
                double cost = resultSet.getDouble("cost");
                int maxPeople = resultSet.getInt("maxPeople");
                String standardRoom = resultSet.getString("standardRoom");
                String description = resultSet.getString("description");
                Double foolArea = resultSet.getDouble("foolArea");
                int floors = resultSet.getInt("floors");
                service = new Service(id, name, area, cost, maxPeople, standardRoom, description, foolArea, floors);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return service;
    }

    @Override
    public Service searchService(String name) {
        Service service = null;
        Connection connection = null;
        connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SERVICE_BY_NAME);
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int area = resultSet.getInt("area");
                double cost = resultSet.getDouble("cost");
                int maxPeople = resultSet.getInt("maxPeople");
                String standardRoom = resultSet.getString("standardRoom");
                String description = resultSet.getString("description");
                Double foolArea = resultSet.getDouble("foolArea");
                int floors = resultSet.getInt("floors");
                service = new Service(id, name, area, cost, maxPeople, standardRoom, description, foolArea, floors);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return service;
    }

    @Override
    public boolean deleteService(int id) {
        Connection connection = null;
        connection = getConnection();
        boolean check = false;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_SERVICE_SQL);
            preparedStatement.setString(1, String.valueOf(id));
            check = preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    @Override
    public boolean updateService(Service service) {
        Connection connection = null;
        connection = getConnection();
        boolean check = false;

        try {
            CallableStatement callableStatement = connection.prepareCall(UPDATE_SERVICE_SQL);
            callableStatement.setString(1, service.getService_name());
            callableStatement.setInt(2, service.getService_area());
            callableStatement.setDouble(3, service.getService_cost());
            callableStatement.setInt(4, service.getService_max_people());
            callableStatement.setString(5, service.getStandard_room());
            callableStatement.setString(6, service.getDescription_other_convenience());
            callableStatement.setDouble(7, service.getPool_area());
            callableStatement.setInt(8, service.getNumber_of_floors());
            check = callableStatement.executeUpdate()>0;
            callableStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    @Override
    public List<Service> selectAll() {
        List<Service> serviceList = new ArrayList<>();
        Connection connection = null;
        connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SERVICE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int area = resultSet.getInt("area");
                double cost = resultSet.getDouble("cost");
                int maxPeople = resultSet.getInt("maxPeople");
                String standardRoom = resultSet.getString("standardRoom");
                String description = resultSet.getString("description");
                Double foolArea = resultSet.getDouble("foolArea");
                int floors = resultSet.getInt("floors");
                serviceList.add(new Service(id, name, area, cost, maxPeople, standardRoom, description, foolArea, floors));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceList;
    }
}
