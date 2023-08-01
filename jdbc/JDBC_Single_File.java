package com.jdbc;

import java.sql.*;

public class JDBC_Single_File {
    public static void main(String[] args) {
        //System.out.println(insertRecord(4,"Zubair","123456789","Nawabshah"));
        //System.out.println(deleteRecord(4));
        //System.out.println(updateRecord(3,"Asif","987654321","Sakrand"));
        printRecords();
    }


    // this method will make connection
    public static Connection getCon() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employ_db","root","khaskheli");
        }catch(Exception e) {
            e.printStackTrace();
        }
        return connection;
    }


    // this method will insert record in database
    public static String insertRecord(int id, String name, String number, String city) {
        try {

            Connection connection = getCon();
            String query = "insert into student(ID,Name,Number,City) values(?,?,?,?)";

            PreparedStatement p = connection.prepareStatement(query);
            p.setInt(1,id);
            p.setString(2,name);
            p.setString(3,number);
            p.setString(4,city);

            p.executeUpdate();
            return "Record Inserted Successfully";

        }catch(Exception e) {
            e.printStackTrace();
        }
        return "Operation Failed";
    }


    // this method will delete record
    public static String deleteRecord(int id) {
        try {
            Connection connection = getCon();
            String query = "delete from student where ID = ?";

            PreparedStatement p = connection.prepareStatement(query);
            p.setInt(1,id);

            p.executeUpdate();
            return "Record Deleted Successfully";
        }catch(Exception e) {
            e.printStackTrace();
        }
        return "Operation Failed";
    }


    // this method will update record
    public static String updateRecord(int id, String name, String number, String city) {
        try {
            Connection connection = getCon();
            String query = "update student set Name = ?, Number = ?, City = ? where ID = ?";

            PreparedStatement p = connection.prepareStatement(query);
            p.setString(1,name);
            p.setString(2,number);
            p.setString(3,city);
            p.setInt(4,id);

            p.executeUpdate();
            return "Record Updated Successfully";
        }catch(Exception e) {
            e.printStackTrace();
        }
        return "Operation Failed";
    }


    // this method will print records from database
    public static void printRecords() {
        try {
            Connection connection = getCon();
            String query = "select * from student";

            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery(query);

            System.out.println("_____________________________");
            while(set.next()) {
                System.out.println("ID:     "+set.getInt(1));
                System.out.println("Name:   "+set.getString(2));
                System.out.println("Number: "+set.getString(3));
                System.out.println("City:   "+set.getString(4));
                System.out.println("_____________________________");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }


}
