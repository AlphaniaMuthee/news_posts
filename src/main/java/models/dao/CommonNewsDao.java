package models.dao;

import models.CommonNews;
import org.sql2o.Connection;

import java.util.List;

public interface CommonNewsDao {
    //add news
    void add (CommonNews commonNews);

    //List news
    List<CommonNews>all();
    CommonNews findById(int id);

    //delete news
    void deleteById(int id);
    void clearAll();

}
