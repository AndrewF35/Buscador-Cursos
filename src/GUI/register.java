package GUI;

import Data.Admin;
import Data.Major;
import Data.Subject;
import Data.Teacher;
import com.initial.main;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import Data.Student;
import static com.initial.main.DataInUniversity;
import javax.swing.JOptionPane;

public class register extends javax.swing.JFrame {

    public register() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(620, 372); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        ocupationLabel = new javax.swing.JLabel();
        ocupationField = new javax.swing.JComboBox<>();
        logo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        userLabel1 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        passwordLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 470));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("REGISTRO");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 350, -1));

        userLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("USUARIO");
        background.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 350, -1));

        userField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        userField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        userField.setPreferredSize(new java.awt.Dimension(200, 25));
        background.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("CONTRASEÑA");
        background.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 350, -1));

        ocupationLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        ocupationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ocupationLabel.setText("OCUPACION");
        background.add(ocupationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 350, -1));

        ocupationField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ocupationField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Docente", "Administrador" }));
        ocupationField.setPreferredSize(new java.awt.Dimension(200, 25));
        ocupationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupationFieldActionPerformed(evt);
            }
        });
        background.add(ocupationField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/escudo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 350, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        background.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        userLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel1.setText("NOMBRE");
        background.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 350, 20));

        ageField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ageField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ageField.setPreferredSize(new java.awt.Dimension(200, 25));
        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });
        background.add(ageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        passwordLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        passwordLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel1.setText("EDAD");
        background.add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 350, -1));

        nameField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameField.setPreferredSize(new java.awt.Dimension(200, 25));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        background.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        passwordField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordField.setPreferredSize(new java.awt.Dimension(200, 25));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        background.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 646, 417);
    }// </editor-fold>//GEN-END:initComponents

    private void ocupationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ocupationFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (ocupationField.getSelectedItem().equals("Estudiante")) {
                Student newStudent = new Student(ageField.getText(), Integer.parseInt(ageField.getText()), passwordField.getText(), userField.getText());
                DataInUniversity.AddStudentsToMajor(newStudent);

            } else if (ocupationField.getSelectedItem().equals("Docente")) {
                Teacher newTeacher = new Teacher(ageField.getText(), Integer.parseInt(ageField.getText()), passwordField.getText(), userField.getText());
                DataInUniversity.AddTeachersToMajor(newTeacher);
            } else if (ocupationField.getSelectedItem().equals("Administrador")) {
                Admin newAdmin = new Admin(ageField.getText(), Integer.parseInt(ageField.getText()), passwordField.getText(), userField.getText());
                DataInUniversity.createAdmin(newAdmin);
            }
            JOptionPane.showMessageDialog(this, """
                                                Usuario a\u00f1adido exitosamente con esta informacion 
                                                Nombre: """ + ageField.getText() + " Edad: " + ageField.getText() + " Usuario: " + userField.getText());

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Error Añadiendo Informacion \n no olvides añadir todos los campos ");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        login.currentAdmin = null;
        login newWindow4 = new login();
        newWindow4.setVisible(true);
        
        this.dispose();    }//GEN-LAST:event_jButton2ActionPerformed

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JPanel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> ocupationField;
    private javax.swing.JLabel ocupationLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    // End of variables declaration//GEN-END:variables
}
