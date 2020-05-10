package models;

public class DepartmentsNews extends CommonNews {
    private int sectionId;

    public DepartmentsNews(String news, String writer,int sectionId) {
        this.news = news;
        this.writer = writer;
        this.sectionId = sectionId;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }
}
