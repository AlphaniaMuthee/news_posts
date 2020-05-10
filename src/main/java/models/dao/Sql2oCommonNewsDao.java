package models.dao;

import models.CommonNews;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oCommonNewsDao implements CommonNewsDao {
    private final Sql2o sql2o;
    public Sql2oCommonNewsDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void add(CommonNews commonNews) {
        String sql = "INSERT INTO common_news (news, writer) VALUES(:news, :writer)";
        try (Connection con = sql2o.open()){
            int id = (int)
                con.createQuery(sql, true)
                    .bind(commonNews)
                    .executeUpdate()
                    .getKey();
            commonNews.setId(id);
        }
    }

    @Override
    public List<CommonNews> all() {
        String sql = "SELECT * FROM common_news";
        try(Connection con = sql2o.open()){
            return con.createQuery(sql)
                    .throwOnMappingFailure(false)
                    .executeAndFetch(CommonNews.class);
        }
    }

    @Override
    public CommonNews findById(int id) {
        String sql = "SELECT * FROM common_news WHERE id = :id";
        try(Connection con = sql2o.open()){
            return con.createQuery(sql)
                    .addParameter("id",id)
                    .executeAndFetchFirst(CommonNews.class);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM  common_news WHERE id = :id";
        try( Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("id",id)
                    .executeUpdate();
        }
    }

    @Override
    public void clearAll() {
        String sql = "DELETE FROM  common_news";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .executeUpdate();
        }
    }
}
