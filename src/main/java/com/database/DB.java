package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class DB {
    public static Connection con = null;
    public static void loadConnection() throws SQLException
    {
       
        String url ="jdbc:mysql://localhost:3306/demo_app";
        String root ="root";
        String pass ="admin";
        
        try {
           
            con =DriverManager.getConnection(url,root,pass);
            
            if(con!=null)
            {
                JOptionPane.showMessageDialog(null, "Database connected");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage());
        }
        
        
    }
}
