package models.dao;

import models.User;
import java.util.List;

public interface UserDao {
    //add user
    void add(User user);

    //list users
    List<User>all();
    User findById(int id);

    //update
    void update(int id, String newName, String newEmail, String newRole, int newSectionId);

    //delete
    void deleteByUser(int id);
    void clearAll();
}
