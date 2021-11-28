package service.Impl;

import dao.Impl.IUserDAO;
import dao.UserDAO;
import model.User;
import service.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    IUserDAO userDAO = new UserDAO();

    @Override
    public boolean insertUser(User user) throws SQLException {
        return userDAO.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userDAO.selectUser(id);
    }

    @Override
    public List<User> selectUserByCountry(String country) {
        return userDAO.selectUserByCountry(country);
    }

    @Override
    public List<User> selectAllUsers() {
        return userDAO.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) {
        try {
            return userDAO.deleteUser(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        try {
            return userDAO.updateUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User userGetById(int id) {
        return userDAO.userGetById(id);
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        userDAO.insertUserStore(user);
    }

    @Override
    public void insertUpdateWithoutTransaction() {
        userDAO.insertUpdateWithoutTransaction();
    }
}
