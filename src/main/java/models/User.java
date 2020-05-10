package models;

public class User {
    public String name;
    public String email;
    public String role;
    public int sectionId;
    public int id;

    public User(String name, String email, String role, int sectionId) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.sectionId = sectionId;
    }

}
