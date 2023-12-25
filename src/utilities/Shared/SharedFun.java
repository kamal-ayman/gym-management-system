/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities.Shared;

import Machines.AddMachines;
import entities.MemberModel;
import entities.TrainerModel;
import entities.global.Global;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import utilities.Constance;
import static utilities.Constance.memberPrice;
import static utilities.Constance.workTime;
import static utilities.Network.MySQLConnection.con;

/**
 *
 * @author kamal
 */
public class SharedFun {

    static public void navigateTo(Window source, JFrame Screen) {
        source.dispose();
        Screen.setVisible(true);
    }

    static public void checkMember(String id) throws SQLException {
        PreparedStatement s = con.prepareStatement("select id from member where id = " + "'" + id + "'");
        ResultSet res = s.executeQuery();
        System.out.println("value is ");
        res.next();
        System.out.println(res.getInt(1));

    }

    static public void resetTableMember(JTable table) {
        try {
            Global.memberModel.clear();
            PreparedStatement s = con.prepareStatement("SELECT member.*, trainers.fname, trainers.lname FROM member JOIN trainers");
            ResultSet res = s.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            while (res.next()) {
                int id = res.getInt(1);
                String name = res.getString(2);
                int isMale = res.getInt(3);
                int age = res.getInt(4);
                String phone = res.getString(5);
                String email = res.getString(6);
                int isPublic = res.getInt(7);
                int price = res.getInt(8);
                Date from, to;
                from = res.getDate(9);
                to = res.getDate(10);
                Integer t_id = res.getInt(11);
                String fname = res.getString(12);
                String lname = res.getString(13);
                MemberModel m = new MemberModel(name, String.valueOf(id), isMale == 1, String.valueOf(age), phone, email, isPublic == 1, price, from, to, t_id, fname + " " + lname);
                Global.memberModel.add(m);
            }
            Global.memberModel.forEach(ele -> {
                model.addRow(new Object[]{ele.id, ele.name, ele.trainer_id != 0 ? ele.trainerName : "Public coach", ele.isMale ? "male" : "female", ele.age, ele.phoneNumber, ele.email, ele.isPublic ? "Public coach" : "Private coach", memberPrice[ele.price], ele.from, ele.to});
            });

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    static public void resetTableTrainers(JTable table) {
        try {
            PreparedStatement s = con.prepareStatement("select * from trainers");
            ResultSet res = s.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            while (res.next()) {
                int id = res.getInt(1);
                String fname = res.getString(2);
                String lname = res.getString(3);
                String phone = res.getString(4);
                boolean isMale = res.getInt(5) == 1;
                int exp = res.getInt(6);
                int age = res.getInt(7);
                int wt = res.getInt(8);
                String email = res.getString(9);
                model.addRow(new Object[]{id, fname + " " + lname, phone, isMale ? "male" : "female", Constance.experiance[exp], age, workTime[wt], email});
            }

        } catch (SQLException ex) {
            Logger.getLogger(AddMachines.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static public boolean checkSearchText(JTextField text){
        if (text.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "please enter search text!");
            return false;
        }
        return true;
    }
}
