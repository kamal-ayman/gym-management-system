/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities.Network;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kamal
 */
public class MySQLConnection {
    public static java.sql.Connection con;

    public MySQLConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "uecnc123");
        } catch (SQLException ex) {}
    }
    
}
