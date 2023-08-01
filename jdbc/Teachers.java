package com.jdbc;

public class Teachers {
    private int Id;
    private String City;
    private String Name;

    public Teachers(int id, String city, String name) {
        Id = id;
        City = city;
        Name = name;
    }

    public Teachers() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "Id=" + Id +
                ", City='" + City + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
