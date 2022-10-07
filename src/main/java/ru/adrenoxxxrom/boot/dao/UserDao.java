package ru.adrenoxxxrom.boot.dao;

import ru.adrenoxxxrom.boot.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    void updateUser(User user);

    User getUserById(long id);

    void truncateTable();
}
