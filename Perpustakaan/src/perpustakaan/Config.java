/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author akbar_t6fy92r
 */
public class Config {
    private static Connection MySQLConfig;
    
    
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/perpustakaan";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver((new com.mysql.cj.jdbc.Driver()));
            MySQLConfig = DriverManager.getConnection(url, user, pass);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Database tidak terkoneksi");
            System.out.println("Koneksi database gagal" + e.getMessage());
        }
        
        return MySQLConfig;
    }
}
