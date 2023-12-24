/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities.Network;

import entities.AdminModel;
import static entities.global.Global.adminModel;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kamal
 */
public class MySQLConnection {

    public static java.sql.Connection con;

    public boolean InitMySQLConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "uecnc123");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

    public boolean isLoginFun() {
        try {
            PreparedStatement s = con.prepareStatement("select * from login_cache");
            ResultSet res = s.executeQuery();
            res.next();
            if (res.getInt(2) == 0) {
                return false;
            }
            System.out.println("login successfully...");
            return getUserData(res.getInt(1));
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateLoginCache(int id) {
        try {
            PreparedStatement select = con.prepareStatement("SELECT * FROM gms.login_cache");
            ResultSet selectRes = select.executeQuery();
            selectRes.next();
            int sId = selectRes.getInt(1);
            PreparedStatement update = con.prepareStatement("UPDATE login_cache SET id = ?, is_login = 1 WHERE id = ?");
            update.setInt(1, id);
            update.setInt(2, sId);
            if (update.executeUpdate() == 0) {
                return false;
            }
            return getUserData(id);
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    static public boolean getUserData(int id) {
        try {
            PreparedStatement user = con.prepareStatement("SELECT * FROM admin WHERE id = ?");
            user.setInt(1, id);
            ResultSet userRes = user.executeQuery();
            userRes.next();
            String name = userRes.getString(2);
            String phone = userRes.getString(3);
            String address = userRes.getString(4);
            String password = userRes.getString(5);
            adminModel = new AdminModel(name, id, phone, password, address);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateLogoutCache(int id) {
        try {
            PreparedStatement select = con.prepareStatement("SELECT * FROM gms.login_cache");
            ResultSet selectRes = select.executeQuery();
            selectRes.next();
            int sId = selectRes.getInt(1);
            PreparedStatement update = con.prepareStatement("UPDATE login_cache SET id = ?, is_login = 0 WHERE id = ?");
            update.setInt(1, id);
            update.setInt(2, sId);
            System.out.println("logout successfully...");
            return update.executeUpdate() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
