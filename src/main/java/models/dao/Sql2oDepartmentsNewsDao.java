package models.dao;

import models.DepartmentsNews;
import org.sql2o.*;

import java.util.List;

public class Sql2oDepartmentsNewsDao implements DepartmentsNewsDao{
    private final Sql2o sql2o;

    public Sql2oDepartmentsNewsDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(DepartmentsNews departmentsNews) {
        String sql = "INSERT INTO department_news( news,writer,sectionid) VALUES (:news,:writer,:sectionId)";
        try(Connection con = sql2o.open()){
            int id =(int)
                    con.createQuery(sql,true)
                            .bind(departmentsNews)
                            .executeUpdate()
                            .getKey();
            departmentsNews.setId(id);
        }
    }

    @Override
    public List<DepartmentsNews> all() {
        String sql = "SELECT * FROM  department_news ";
        try(Connection con = sql2o.open()){
            return con.createQuery(sql)
                    .executeAndFetch(DepartmentsNews.class);
        }
    }

    @Override
    public DepartmentsNews findById(int id) {
        String sql = "SELECT * FROM department_news WHERE id = :id ";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(DepartmentsNews.class);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM  department_news WHERE id = :id";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("id",id)
                    .executeUpdate();
        }

    }

    @Override
    public void clearAll() {
        String sql = "DELETE FROM  department_news";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .executeUpdate();
        }
    }
}
