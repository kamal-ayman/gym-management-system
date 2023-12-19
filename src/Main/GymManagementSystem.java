/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Machines.AddMachines;
import java.sql.*;
/**
 *
 * @author kamal
 */
public class GymManagementSystem {
    
    public static Connection con;
    public static void main(String[] args) {
        // TODO code application logic here
          try  {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","uecnc123");
//             System.out.println(con.isClosed());
//             PreparedStatement stmt = con.prepareStatement("insert into users(fname, lname, phone, gender, experience, age, work_time, email) values (?, ?, ?, ?, ?, ?, ?, ?");
//             
//             stmt.setString(1, );
//             while(res.next())  {
//                 System.out.println(res.getInt(1)+"  "+res.getString(2)+"  "+res.getString(3));  
//             }
             

        new AddMachines().setVisible(true);

        } catch (SQLException ex) {
            
        }
    }
    
}
