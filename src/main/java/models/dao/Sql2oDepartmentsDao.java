package models.dao;

import models.DepartmentsNews;
import models.User;
import org.sql2o.Connection;
import org.sql2o.*;
import models.Departments;


import java.util.List;

public class Sql2oDepartmentsDao implements DepartmentsDao {
    private final Sql2o sql2o;

    public Sql2oDepartmentsDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Departments departments) {
        String sql = "INSERT INTO departments ( name , details , totalemployees) VALUES ( :name , :details, :totalemployees)";
        try(Connection con = sql2o.open()){
            int id = (int)
                    con.createQuery(sql,true)
                            .bind(departments)
                            .executeUpdate()
                            .getKey();
            departments.setId(id);
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public List<Departments> all() {
        try (Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM departments")
                    .executeAndFetch(Departments.class);
        }
    }

    @Override
    public Departments findById(int id) {
        try( Connection con = sql2o.open()){
            return  con.createQuery("SELECT * FROM  departments WHERE id = :id ")
                    .addParameter("id",id)
                    .executeAndFetchFirst(Departments.class);
        }
    }

    @Override
    public List<DepartmentsNews> allNewsById(int id) {
        return null;
    }

    @Override
    public List<User> allUserById(int id) {
        String sql = "SELECT * FROM users WHERE sectionid = :id";
        try(Connection con = sql2o.open()){
            return con.createQuery(sql)
                    .addParameter("id",id)
                    .executeAndFetch(User.class);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM departments WHERE id = :id";
        try(Connection con  = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("id",id)
                    .executeUpdate();
        }
    }

    @Override
    public void clearAll() {
        try(Connection con = sql2o.open()){
            con.createQuery("DELETE FROM departments")
                    .executeUpdate();
        }
    }
}
