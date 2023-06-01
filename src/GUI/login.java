package GUI;

import java.awt.Color;
import javax.swing.JOptionPane;

import Data.Student;
import Data.Major;
import Data.Subject;
import com.initial.main;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class login extends javax.swing.JFrame {

    public static Student currentStudent;
    public static ArrayList<Subject> scheduleTest = new ArrayList<>();
    public static Stack<Subject> doneSubjectsTest = new Stack<>();
    public static Stack<Subject> remainingSubjectsTest = new Stack<>();
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();
        loginButton = new javax.swing.JPanel();
        loginText = new javax.swing.JLabel();
        registerButton = new javax.swing.JPanel();
        registerText = new javax.swing.JLabel();
        userLabel1 = new javax.swing.JLabel();
        ocupationField = new javax.swing.JComboBox<>();
        userField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(350, 450));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("SISTEMA DE INFORMACION ACADEMICA");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 350, -1));

        userLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("Tipo de Usuario");
        background.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 30));

        passwordLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("CONTRASEÑA");
        background.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 20));

        passwordField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordField.setPreferredSize(new java.awt.Dimension(200, 25));
        background.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/escudo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginButton.setToolTipText("");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setPreferredSize(new java.awt.Dimension(75, 25));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });

        loginText.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        loginText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginText.setText("Ingresar");
        loginText.setPreferredSize(new java.awt.Dimension(75, 25));

        javax.swing.GroupLayout loginButtonLayout = new javax.swing.GroupLayout(loginButton);
        loginButton.setLayout(loginButtonLayout);
        loginButtonLayout.setHorizontalGroup(
            loginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginText, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );
        loginButtonLayout.setVerticalGroup(
            loginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        background.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 30));

        registerButton.setBackground(new java.awt.Color(255, 255, 255));
        registerButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.setPreferredSize(new java.awt.Dimension(75, 25));
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });

        registerText.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        registerText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerText.setText("Registro");
        registerText.setPreferredSize(new java.awt.Dimension(75, 25));

        javax.swing.GroupLayout registerButtonLayout = new javax.swing.GroupLayout(registerButton);
        registerButton.setLayout(registerButtonLayout);
        registerButtonLayout.setHorizontalGroup(
            registerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerText, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        registerButtonLayout.setVerticalGroup(
            registerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        background.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 70, 30));

        userLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel1.setText("USUARIO");
        background.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 30));

        ocupationField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Docente", "Administrador" }));
        ocupationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupationFieldActionPerformed(evt);
            }
        });
        background.add(ocupationField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, -1));

        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });
        background.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        loginButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        loginButton.setBackground(Color.white);
    }//GEN-LAST:event_loginButtonMouseExited

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        registerButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        registerButton.setBackground(Color.white);
    }//GEN-LAST:event_registerButtonMouseExited

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        register newWindow = new register();
        newWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerButtonMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked

        String user = userField.getText();
        String pass = new String(passwordField.getPassword());

        if (ocupationField.getSelectedItem().equals("Estudiante")) {
            try {
                if (main.subjectsInUniversity.searchStudentByUser(user).getUser().equals(user)) {
                    currentStudent = main.subjectsInUniversity.searchStudentByUser(user);
                    studentMenu newWindow = new studentMenu();
                    newWindow.setVisible(true);
                    this.dispose();
                } else if (ocupationField.getSelectedItem().equals("Docente")) {
                    if ("654321".equals(pass)) {
                        teacherMenu newWindow = new teacherMenu();
                        newWindow.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
                    }
                } else if (ocupationField.getSelectedItem().equals("Administrador")) {
                    if ("654321".equals(pass)) {
                        teacherMenu newWindow = new teacherMenu();
                        newWindow.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario incorrecto");
                }
            } catch (java.lang.NullPointerException e) {
                JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrecta");
            }
        }
        //testeo
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            scheduleTest.add(currentStudent.getMajorCurrent().readAllByName().get(random.nextInt(20)));
            doneSubjectsTest.push(currentStudent.getMajorCurrent().readAllByName().get(random.nextInt(20)));
            remainingSubjectsTest.push(currentStudent.getMajorCurrent().readAllByName().get(random.nextInt(20)));
        }

        login.currentStudent.setSchedule(scheduleTest);
        System.out.println("añadido Horario");
        System.out.println(login.currentStudent.getSchedule());
        login.currentStudent.setDoneSubjects(doneSubjectsTest);
        login.currentStudent.setRemainingSubjects(remainingSubjectsTest);
        //
    }//GEN-LAST:event_loginButtonMouseClicked

    private void ocupationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ocupationFieldActionPerformed

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel loginButton;
    private javax.swing.JLabel loginText;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> ocupationField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel registerButton;
    private javax.swing.JLabel registerText;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    // End of variables declaration//GEN-END:variables
}
