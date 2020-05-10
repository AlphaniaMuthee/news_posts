package models.dao;

import models.User;
import org.sql2o.*;
import models.User;

import java.util.List;

public class Sql2oUserDao implements UserDao {
    private final Sql2o sql2o;

    public Sql2oUserDao (Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(User user) {
        String sql= "INSERT INTO users(name,email,role,sectionid) VALUES (:name,:email,:role,:sectionId)";
        try(Connection con = sql2o.open()) {
            int id = (int)
                    con.createQuery(sql, true)
                            .bind(user)
                            .executeUpdate()
                            .getKey();
            user.setId(id);
        }
    }

    @Override
    public List<User> all() {
        String sql = "SELECT * FROM users";
        try(Connection con = sql2o.open()){
            return con.createQuery(sql)
                    .executeAndFetch(User.class);
        }
    }

    @Override
    public User findById(int id) {
        String sql = "SELECT * FROM users WHERE id = :id";
        try( Connection con = sql2o.open()){
            return con.createQuery(sql)
                    .addParameter("id",id)
                    .executeAndFetchFirst(User.class);
        }
    }

    @Override
    public void update(int id, String newName, String newEmail, String newRole, int newSectionId) {
        String sql = "UPDATE users SET (name, email, role, sectionid) =(:name,:email,:role,:sectionid)WHERE id=:id";
        try (Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("name",newName)
                    .addParameter("email",newEmail)
                    .addParameter("role",newRole)
                    .addParameter("sectionId",newSectionId)
                    .addParameter("id",id)
                    .executeUpdate();
        }

    }

    @Override
    public void deleteByUser(int id) {
        String sql = "DELETE FROM users WHERE id = :id";
        try( Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("id",id)
                    .executeUpdate();
        }
    }

    @Override
    public void clearAll() {
        String sql = "DELETE FROM users";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .executeUpdate();
        }
    }
}
