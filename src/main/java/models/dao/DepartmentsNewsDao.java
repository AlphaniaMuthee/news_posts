package models.dao;

import models.DepartmentsNews;

import java.util.List;

public interface DepartmentsNewsDao {
    //add
    void add(DepartmentsNews departmentsNews);

    //list
    List<DepartmentsNews>all();
    DepartmentsNews findById(int id);

    //delete
    void deleteById(int id);
    void clearAll();
}
