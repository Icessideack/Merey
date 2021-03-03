package com.company.data;

import com.company.data.interfaces.IDB;

import java.sql.*;
public class PostgresDB implements IDB{

    public Connection getConnection() throws SQLException, ClassNotFoundException{
        String connectionURL = "jdbs:postgresql://localhost:5432/assignment4";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection merey = DriverManager.getConnection(connectionURL, "postgres", "123");
            return merey;
        } catch (Exception c) {
        System.out.println(c);
        return null;
        }
    }

}
