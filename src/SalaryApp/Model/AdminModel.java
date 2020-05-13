package SalaryApp.Model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminModel {
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost/responsi";
    final static String USER = "root";
    final static String PASS = "";

    Connection connection;
    Statement statement;

    public AdminModel() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection Good to go!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e);
        }
    }

    public boolean getAdmin(String username, String password) {
        try {
            int jmlData = 0;
            String query = "SELECT * FROM `data_admin` WHERE `username`='" + username + "' AND `password`='" + password + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                jmlData++;
            }
            if (jmlData != 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Admin not found");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Admin not found");
            return false;
        }
    }
}

