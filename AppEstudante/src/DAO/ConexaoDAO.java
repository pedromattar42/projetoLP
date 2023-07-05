package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gussa
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoDAO {
    public Connection contectarDB() {
       Connection conn = null;
       
        try {
            String url = "jdbc:mysql://localhost:3306/app_estudante?user=root&password=Admin@123";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("Error (conectarDB):" + e);
        }
        
        return conn;
    }
}
