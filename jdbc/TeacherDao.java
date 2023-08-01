package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TeacherDao {

    public static void insertTeacher(Teachers teachers) {
        try {
            Connection connection = CP.createCon();
            String query = "insert into teachers(id,city,name) values(?,?,?)";

            PreparedStatement p = connection.prepareStatement(query);
            p.setInt(1,teachers.getId());
            p.setString(2,teachers.getName());
            p.setString(3,teachers.getCity());

            p.executeUpdate();

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteTeacher(int id) {
        try {
            Connection connection = CP.createCon();
            String query = "DELETE FROM teachers where id = ?";
            PreparedStatement p = connection.prepareStatement(query);
            p.setInt(1,id);
            p.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayRecords() {
        try {
            Connection connection = CP.createCon();
            String query = "select * from teachers";
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery(query);
            System.out.println("__________________________________________");
            while(set.next()) {
                System.out.println("ID: "+set.getInt(1));
                System.out.println("City: "+set.getString(2));
                System.out.println("Name: "+set.getString(3));
                System.out.println("__________________________________________");
            }

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static String updateTeacher(Teachers teachers) {
        try {
            Connection connection = CP.createCon();
            String query = "update teachers set city = ?, name = ? where id = ?";
            PreparedStatement p = connection.prepareStatement(query);
            p.setString(1,teachers.getCity());
            p.setString(2,teachers.getName());
            p.setInt(3,teachers.getId());
            p.executeUpdate();
            return "Operation Successfully Performed";
        }catch(Exception e) {
            e.printStackTrace();
        }
        return "Operation Failed";
    }

}
