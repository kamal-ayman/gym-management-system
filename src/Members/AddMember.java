package Members;

import Home.HomeScreen;
import entities.MemberModel;
import entities.TrainerModel;
import static entities.global.Global.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static utilities.Network.MySQLConnection.con;
import utilities.Shared.SharedFun;
import static utilities.Shared.SharedFun.checkMember;

public class AddMember extends javax.swing.JFrame {

    public AddMember() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        getTrainers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_phone = new javax.swing.JLabel();
        lbl_title = new javax.swing.JLabel();
        name_lbl = new javax.swing.JLabel();
        id_id = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_sub_type = new javax.swing.JLabel();
        lbl_sub_price = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        phone_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        rbtn_private = new javax.swing.JRadioButton();
        price = new javax.swing.JComboBox<>();
        gender = new javax.swing.JLabel();
        rbtn_male = new javax.swing.JRadioButton();
        rbtn_female = new javax.swing.JRadioButton();
        rbtn_public = new javax.swing.JRadioButton();
        add_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        add_btn1 = new javax.swing.JButton();
        lbl_gender1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        lbl_date1 = new javax.swing.JLabel();
        t_name = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add A Member");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_phone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_phone.setText("Phone Number : ");

        lbl_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Add A Member");

        name_lbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name_lbl.setText("Name : ");

        id_id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        id_id.setText("Member ID :");

        lbl_email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_email.setText("Email :");

        lbl_sub_type.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_sub_type.setText("Subscribtion type :");

        lbl_sub_price.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_sub_price.setText("Subscribtion's Price :");

        lbl_date.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_date.setText("Registraition :");

        name.setToolTipText("");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbtn_private);
        rbtn_private.setText("Private coach");
        rbtn_private.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_privateActionPerformed(evt);
            }
        });

        price.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "120", "150", "170", "200" }));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gender.setText("Member gender :");

        buttonGroup1.add(rbtn_male);
        rbtn_male.setSelected(true);
        rbtn_male.setText("Male");

        buttonGroup1.add(rbtn_female);
        rbtn_female.setText("Female");

        buttonGroup2.add(rbtn_public);
        rbtn_public.setSelected(true);
        rbtn_public.setText("Public coach");
        rbtn_public.setToolTipText("");
        rbtn_public.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_publicActionPerformed(evt);
            }
        });

        add_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_btn.setForeground(new java.awt.Color(0, 0, 204));
        add_btn.setText("Members");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Members_btn(evt);
            }
        });

        back_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back_btn.setForeground(new java.awt.Color(0, 0, 204));
        back_btn.setText("back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/dumbell.jpeg"))); // NOI18N
        jLabel11.setText("jLabel11");

        add_btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_btn1.setForeground(new java.awt.Color(0, 0, 204));
        add_btn1.setText("Add");
        add_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionButton(evt);
            }
        });

        lbl_gender1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_gender1.setText("Age :");

        jLabel1.setText("from");

        jLabel2.setText("to");

        jSpinner1.setValue(18);

        lbl_date1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_date1.setText("Trainer Name");

        t_name.setEnabled(false);
        t_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_sub_type, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(rbtn_male, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(50, 50, 50)
                                                    .addComponent(rbtn_female, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(rbtn_private)
                                                    .addGap(50, 50, 50)
                                                    .addComponent(rbtn_public))
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(48, 48, 48))
                                        .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_date)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_sub_price, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_date1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn_male, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbtn_female, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sub_type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_private)
                    .addComponent(rbtn_public))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_date1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13)
                        .addComponent(lbl_sub_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(t_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(add_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionButton
        // TODO add your handling code here:
        String name = this.name.getText();
        String id = this.id.getText();
        boolean isMale = rbtn_male.isSelected();
        String age = jSpinner1.getValue() + "";
        String phoneNumber = this.phone_txt.getText();
        String email = email_txt.getText();
        Date from = jDateChooser2.getDate();
        Date to = jDateChooser1.getDate();
        boolean isPublic = rbtn_public.isSelected();
        int price = this.price.getSelectedIndex();
        int t_id = Integer.parseInt(trainersModel.get(t_name.getSelectedIndex()).id);
        String fname, lname;
        fname = trainersModel.get(t_name.getSelectedIndex()).firstName;
        lname = trainersModel.get(t_name.getSelectedIndex()).lastName;

        MemberModel t = new MemberModel(name, id, isMale, age, phoneNumber, email, isPublic, price, from, to, t_name.isEnabled() ? t_id : null, fname + lname);
        if (!isValid(t)) {
            return;
        }

        boolean isFound = false;

        try {
            checkMember(t.id);
            isFound = true;
            JOptionPane.showMessageDialog(null, "this Serial Number currently used!");
        } catch (SQLException ex) {
        }
        if (!isFound) {
            try {
                addMember(t);
                clearData();
            } catch (SQLException ex1) {
                System.out.println("error add");
                Logger.getLogger(AddMember.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_addActionButton

    boolean isValid(MemberModel t) {
        if (t.id.isEmpty() || t.email.isEmpty() || t.name.isEmpty() || t.phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "please complete your data...!");
            return false;
        }
        return true;
    }

    void clearData() {
        name.setText("");
        id.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        jSpinner1.setValue(18);
        phone_txt.setText("");
        email_txt.setText("");
        price.setSelectedIndex(0);
//        jDateChooser2.setDate(Date);        
    }

    private void getTrainers() {
        trainersModel.clear();
        t_name.removeAllItems();
        try {

            PreparedStatement s = con.prepareStatement("select * from trainers where id != -1");
            ResultSet res = s.executeQuery();
            while (res.next()) {
                TrainerModel t = new TrainerModel(res.getString(2), res.getString(3), res.getInt(5) == 1, res.getString(4), res.getInt(6), res.getString(7), res.getInt(8), res.getString(9), res.getString(1));
                trainersModel.add(t);
                System.out.println(t.firstName + " " + t.lastName);
                t_name.addItem(t.firstName + " " + t.lastName);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addMember(MemberModel t) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("insert into member(id, name, gender, age, phone, email, sub_type, sub_price, reg_st, reg_ed, trainer_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, Integer.parseInt(t.id));
        stmt.setString(2, t.name);
        stmt.setInt(3, t.isMale ? 1 : 0);
        stmt.setInt(4, Integer.parseInt(t.age));
        stmt.setString(5, t.phoneNumber);
        stmt.setString(6, t.email);
        stmt.setInt(7, t.isPublic ? 1 : 0);
        stmt.setInt(8, t.price);
        java.sql.Date from, to;
        from = new java.sql.Date(t.from.getTime());
        stmt.setDate(9, from);
        to = new java.sql.Date(t.to.getTime());
        stmt.setDate(10, to);
        if (t.trainer_id == null) {
            stmt.setInt(11, -1);
        } else {
            stmt.setInt(11, t.trainer_id);
        }

        stmt.executeUpdate();
        System.out.println("added successfully");
    }
    private void Members_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Members_btn
        SharedFun.navigateTo(this, new Members());
    }//GEN-LAST:event_Members_btn

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void rbtn_publicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_publicActionPerformed
        // TODO add your handling code here:
        t_name.enable(false);
    }//GEN-LAST:event_rbtn_publicActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        SharedFun.navigateTo(this, new HomeScreen());
    }//GEN-LAST:event_back_btnActionPerformed

    private void t_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nameActionPerformed

    private void rbtn_privateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_privateActionPerformed
        // TODO add your handling code here:

        t_name.enable();
    }//GEN-LAST:event_rbtn_privateActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton add_btn1;
    private javax.swing.JButton back_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField email_txt;
    private javax.swing.JLabel gender;
    private javax.swing.JTextField id;
    private javax.swing.JLabel id_id;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_date1;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_gender1;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_sub_price;
    private javax.swing.JLabel lbl_sub_type;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JComboBox<String> price;
    private javax.swing.JRadioButton rbtn_female;
    private javax.swing.JRadioButton rbtn_male;
    private javax.swing.JRadioButton rbtn_private;
    private javax.swing.JRadioButton rbtn_public;
    private javax.swing.JComboBox<String> t_name;
    // End of variables declaration//GEN-END:variables
}
