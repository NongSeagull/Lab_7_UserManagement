/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.usermanagement;

/**
 *
 * @author tsuna
 */
public class UserJFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserJFrame
     */
    public UserJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupGender = new javax.swing.ButtonGroup();
        panelOfInfo = new javax.swing.JPanel();
        lbl_ID = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        editUsername = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        editName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        editPassword = new javax.swing.JPasswordField();
        lblGender = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        lblRole = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        panelOfTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        panelOfInteraction = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Management");
        setBackground(new java.awt.Color(22, 49, 114));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(900, 670));

        panelOfInfo.setBackground(new java.awt.Color(22, 49, 114));

        lbl_ID.setFont(new java.awt.Font("SF Thonburi", 1, 18)); // NOI18N
        lbl_ID.setForeground(new java.awt.Color(246, 246, 246));
        lbl_ID.setText("ID : ");

        lblLogin.setFont(new java.awt.Font("SF Thonburi", 1, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(246, 246, 246));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLogin.setText("Username : ");

        editUsername.setBackground(new java.awt.Color(246, 246, 246));
        editUsername.setFont(new java.awt.Font("SF Thonburi", 0, 18)); // NOI18N
        editUsername.setForeground(new java.awt.Color(30, 86, 160));
        editUsername.setBorder(null);
        editUsername.setCaretColor(new java.awt.Color(30, 86, 160));

        lblName.setFont(new java.awt.Font("SF Thonburi", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(246, 246, 246));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name : ");

        editName.setBackground(new java.awt.Color(246, 246, 246));
        editName.setFont(new java.awt.Font("SF Thonburi", 0, 18)); // NOI18N
        editName.setForeground(new java.awt.Color(30, 86, 160));
        editName.setBorder(null);
        editName.setCaretColor(new java.awt.Color(30, 86, 160));

        lblPassword.setFont(new java.awt.Font("SF Thonburi", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(246, 246, 246));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password : ");

        editPassword.setBackground(new java.awt.Color(246, 246, 246));
        editPassword.setFont(new java.awt.Font("SF Thonburi", 0, 18)); // NOI18N
        editPassword.setForeground(new java.awt.Color(30, 86, 160));
        editPassword.setBorder(null);
        editPassword.setCaretColor(new java.awt.Color(30, 86, 160));

        lblGender.setFont(new java.awt.Font("SF Thonburi", 1, 18)); // NOI18N
        lblGender.setForeground(new java.awt.Color(246, 246, 246));
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender : ");

        radioMale.setBackground(new java.awt.Color(22, 49, 114));
        groupGender.add(radioMale);
        radioMale.setFont(new java.awt.Font("SF Thonburi", 1, 14)); // NOI18N
        radioMale.setForeground(new java.awt.Color(214, 228, 240));
        radioMale.setSelected(true);
        radioMale.setText("Male");
        radioMale.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        radioFemale.setBackground(new java.awt.Color(22, 49, 114));
        groupGender.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("SF Thonburi", 1, 14)); // NOI18N
        radioFemale.setForeground(new java.awt.Color(214, 228, 240));
        radioFemale.setText("Female");
        radioFemale.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblRole.setFont(new java.awt.Font("SF Thonburi", 1, 18)); // NOI18N
        lblRole.setForeground(new java.awt.Color(246, 246, 246));
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRole.setText("Role : ");

        comboRole.setFont(new java.awt.Font("SF Thonburi", 0, 18)); // NOI18N
        comboRole.setForeground(new java.awt.Color(30, 86, 160));
        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        comboRole.setSelectedIndex(1);

        btnSave.setBackground(new java.awt.Color(246, 246, 246));
        btnSave.setFont(new java.awt.Font("SF Thonburi", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(30, 86, 160));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(246, 246, 246));
        btnClear.setFont(new java.awt.Font("SF Thonburi", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(30, 86, 160));
        btnClear.setText("Clear");

        javax.swing.GroupLayout panelOfInfoLayout = new javax.swing.GroupLayout(panelOfInfo);
        panelOfInfo.setLayout(panelOfInfoLayout);
        panelOfInfoLayout.setHorizontalGroup(
            panelOfInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOfInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOfInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelOfInfoLayout.createSequentialGroup()
                        .addComponent(lbl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelOfInfoLayout.createSequentialGroup()
                        .addGroup(panelOfInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOfInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelOfInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOfInfoLayout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelOfInfoLayout.createSequentialGroup()
                        .addGroup(panelOfInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelOfInfoLayout.createSequentialGroup()
                                .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOfInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioFemale)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        panelOfInfoLayout.setVerticalGroup(
            panelOfInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOfInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOfInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin)
                    .addComponent(editUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(editName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOfInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(editPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender)
                    .addComponent(radioFemale)
                    .addComponent(radioMale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOfInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOfInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnClear))
                .addContainerGap())
        );

        panelOfTable.setBackground(new java.awt.Color(30, 86, 160));

        tblUser.setBackground(new java.awt.Color(214, 228, 240));
        tblUser.setForeground(new java.awt.Color(22, 49, 114));
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblUser);

        javax.swing.GroupLayout panelOfTableLayout = new javax.swing.GroupLayout(panelOfTable);
        panelOfTable.setLayout(panelOfTableLayout);
        panelOfTableLayout.setHorizontalGroup(
            panelOfTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOfTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelOfTableLayout.setVerticalGroup(
            panelOfTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOfTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelOfInteraction.setBackground(new java.awt.Color(214, 228, 240));

        btnAdd.setBackground(new java.awt.Color(246, 246, 246));
        btnAdd.setFont(new java.awt.Font("SF Thonburi", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(30, 86, 160));
        btnAdd.setText("Add");

        btnEdit.setBackground(new java.awt.Color(246, 246, 246));
        btnEdit.setFont(new java.awt.Font("SF Thonburi", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(30, 86, 160));
        btnEdit.setText("Edit");

        btnDelete.setBackground(new java.awt.Color(246, 246, 246));
        btnDelete.setFont(new java.awt.Font("SF Thonburi", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(30, 86, 160));
        btnDelete.setText("Delete");

        javax.swing.GroupLayout panelOfInteractionLayout = new javax.swing.GroupLayout(panelOfInteraction);
        panelOfInteraction.setLayout(panelOfInteractionLayout);
        panelOfInteractionLayout.setHorizontalGroup(
            panelOfInteractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOfInteractionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOfInteractionLayout.setVerticalGroup(
            panelOfInteractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOfInteractionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOfInteractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOfTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOfInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOfInteraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelOfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOfTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOfInteraction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String username = editUsername.getText();
        String name = editName.getText();
        String password = new String(editPassword.getPassword());
        String gender = null;
        if (radioMale.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        char subGender = gender.charAt(0);

        String role = (String) comboRole.getSelectedItem();
        char subRole = role.charAt(0);

        User user = new User(-1, username, name, password, subGender, subRole);
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JTextField editName;
    private javax.swing.JPasswordField editPassword;
    private javax.swing.JTextField editUsername;
    private javax.swing.ButtonGroup groupGender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JPanel panelOfInfo;
    private javax.swing.JPanel panelOfInteraction;
    private javax.swing.JPanel panelOfTable;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTable tblUser;
    // End of variables declaration//GEN-END:variables
}
