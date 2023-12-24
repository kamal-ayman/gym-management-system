/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities.global;

import entities.AdminModel;
import utilities.Network.MySQLConnection;

/**
 *
 * @author kamal
 */
public class Global {

    static public MySQLConnection mySQLConnection = new MySQLConnection();
    static public AdminModel adminModel;
}
