package com.accio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    static Connection connection=null;

    public static Connection getConnection(){
        if(connection!=null){
            return connection;
        }
        String user="root";
        String password="Prabas999*";
        String url="jdbc:mysql://localhost:3306/searchenginejava";
        return getConnection(user,password,url);
    }
    private static Connection getConnection(String user,String password,String url){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}