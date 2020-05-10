package models;

import java.util.Objects;

public class Departments {
    private String name;
    private String details;
    private int totalEmployees;
    private int id;

    public Departments(String name, String details, int totalEmployees) {
        this.name = name;
        this.details = details;
        this.totalEmployees = totalEmployees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departments)) return false;
        Departments that = (Departments) o;
        return totalEmployees == that.totalEmployees &&
                id == that.id &&
                name.equals(that.name) &&
                details.equals(that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, details, totalEmployees, id);
    }

}
