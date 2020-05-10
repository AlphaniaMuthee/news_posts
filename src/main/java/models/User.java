package models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return sectionId == user.sectionId &&
                id == user.id &&
                name.equals(user.name) &&
                email.equals(user.email) &&
                role.equals(user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, role, sectionId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
