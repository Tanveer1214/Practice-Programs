package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    static Connection connection;
    public static Connection createCon() {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employ_db","root","khaskheli");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
