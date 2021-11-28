package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    public boolean insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectUserByCountry(String country);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id);

    public boolean updateUser(User user);

    public User userGetById(int id);

    void insertUserStore(User user) throws SQLException;

    public void insertUpdateWithoutTransaction();
}
