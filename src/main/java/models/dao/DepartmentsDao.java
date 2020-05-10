package models.dao;

import models.Departments;
import models.DepartmentsNews;
import models.User;

import java.util.List;

public interface DepartmentsDao {
    //add
    void add (Departments departments);

    //list depts
    List<Departments>all();
    Departments findById(int id);
    List<DepartmentsNews>allNewsById(int id);
    List<User>allUserById(int id);

    //deleting
    void deleteById(int id);
    void clearAll();
}
