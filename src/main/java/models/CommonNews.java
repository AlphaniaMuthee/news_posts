package models;

import java.util.Objects;

public class CommonNews {
    private String news;
    private String writer;
    private int id;

    public CommonNews(String news, String writer) {
        this.news = news;
        this.writer = writer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommonNews)) return false;
        CommonNews that = (CommonNews) o;
        return id == that.id &&
                news.equals(that.news) &&
                writer.equals(that.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(news, writer, id);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
