package model.entities;

import java.io.Serializable;

public class Department implements Serializable {
    private Integer Id;
    private String name;

    public Department() {
    }

    public Department(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department)o;

        return Id.equals(that.Id);
    }

    @Override
    public int hashCode() {
        return Id.hashCode();
    }
}
