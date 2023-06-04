package GUI;

import Data.Admin;
import Data.DataGenerator;
import Data.Major;
import Data.Subject;
import Data.Teacher;
import com.initial.main;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import Data.Student;
import static com.initial.main.DataInUniversity;
import static com.initial.main.majorsInUniversity;
import javax.swing.JOptionPane;

public class SetData extends javax.swing.JFrame {

    public SetData() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        ocupationLabel = new javax.swing.JLabel();
        majorSelector = new javax.swing.JComboBox<>();
        logo = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        userLabel1 = new javax.swing.JLabel();
        cursosAñadirU = new javax.swing.JTextField();
        passwordLabel1 = new javax.swing.JLabel();
        añadirCarrera = new javax.swing.JButton();
        userLabel2 = new javax.swing.JLabel();
        userLabel3 = new javax.swing.JLabel();
        añadirCursosCarrera = new javax.swing.JButton();
        añadirEstudiantes = new javax.swing.JButton();
        añadirCarrera4 = new javax.swing.JButton();
        TextousuarioE = new javax.swing.JTextField();
        TextopassE = new javax.swing.JTextField();
        TextopassP = new javax.swing.JTextField();
        TextousuarioP = new javax.swing.JTextField();
        userLabel4 = new javax.swing.JLabel();
        userLabel5 = new javax.swing.JLabel();
        passwordLabel2 = new javax.swing.JLabel();
        passwordLabel3 = new javax.swing.JLabel();
        passwordLabel4 = new javax.swing.JLabel();
        passwordLabel5 = new javax.swing.JLabel();
        userLabel6 = new javax.swing.JLabel();
        userLabel7 = new javax.swing.JLabel();
        userLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        añadirProfesor = new javax.swing.JButton();
        nameCarrerField = new javax.swing.JTextField();
        curseMajorField = new javax.swing.JTextField();
        estudiantesField = new javax.swing.JTextField();
        profesoresField = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Bienvenido al Proyecto Gestor de Cursos");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 390, 50));

        userLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("cursos a la carrera");
        background.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 110, -1));

        passwordLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Clave Estudiante");
        background.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 120, -1));

        ocupationLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        ocupationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ocupationLabel.setText("En esta ventana podras definir los datos de prueba para la ejecucion del programa :D");
        background.add(ocupationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 540, -1));

        for(int i=0;i<main.majorsInUniversity.size();i++){
            majorSelector.addItem(main.majorsInUniversity.get(i).getNameMajor());
        }
        majorSelector.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        majorSelector.setPreferredSize(new java.awt.Dimension(200, 25));
        majorSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                majorSelectorActionPerformed(evt);
            }
        });
        background.add(majorSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 130, 20));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/escudo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 160, 150));

        login.setText("Ejecutar Aplicacion");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        background.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        userLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel1.setText("Contraseña: 1234");
        background.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 170, 40));

        cursosAñadirU.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cursosAñadirU.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cursosAñadirU.setPreferredSize(new java.awt.Dimension(200, 25));
        cursosAñadirU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursosAñadirUActionPerformed(evt);
            }
        });
        background.add(cursosAñadirU, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        passwordLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        passwordLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel1.setText("Desea añadir");
        background.add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, -1));

        añadirCarrera.setText("Añadir");
        añadirCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirCarreraActionPerformed(evt);
            }
        });
        background.add(añadirCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        userLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel2.setText("Cuantos cursos desea generar en la universidad:");
        background.add(userLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 280, 20));

        userLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel3.setText("Cuantos Estudiantes desea generar:");
        background.add(userLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 280, 20));

        añadirCursosCarrera.setText("Añadir");
        añadirCursosCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirCursosCarreraActionPerformed(evt);
            }
        });
        background.add(añadirCursosCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        añadirEstudiantes.setText("Añadir");
        añadirEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirEstudiantesActionPerformed(evt);
            }
        });
        background.add(añadirEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        añadirCarrera4.setText("Añadir");
        añadirCarrera4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirCarrera4ActionPerformed(evt);
            }
        });
        background.add(añadirCarrera4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        TextousuarioE.setEditable(false);
        TextousuarioE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextousuarioEActionPerformed(evt);
            }
        });
        background.add(TextousuarioE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 150, -1));

        TextopassE.setEditable(false);
        background.add(TextopassE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 150, -1));

        TextopassP.setEditable(false);
        TextopassP.setToolTipText("");
        TextopassP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextopassPActionPerformed(evt);
            }
        });
        background.add(TextopassP, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 120, -1));

        TextousuarioP.setEditable(false);
        TextousuarioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextousuarioPActionPerformed(evt);
            }
        });
        background.add(TextousuarioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 120, -1));

        userLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel4.setText("Cuantos Profesores desea generar:");
        background.add(userLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, 20));

        userLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel5.setText("A continuacion aparecen Datos de ingreso generados aleatoriamente para poder acceder");
        background.add(userLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 520, 50));

        passwordLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        passwordLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel2.setText("Añadir Carrera (inserte el nombre)");
        background.add(passwordLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 260, -1));

        passwordLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        passwordLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel3.setText("Usuario Profesor");
        background.add(passwordLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 120, -1));

        passwordLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        passwordLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel4.setText("Clave Profesor");
        background.add(passwordLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 120, -1));

        passwordLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        passwordLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel5.setText("Usuario Estudiante");
        background.add(passwordLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 120, -1));

        userLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel6.setText("de igual forma puede registrarse como un usuario nuevo.");
        background.add(userLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 480, 30));

        userLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel7.setText("Datos de ingreso admin");
        background.add(userLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 170, 30));

        userLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel8.setText("Usuario: user");
        background.add(userLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 170, 50));

        jButton2.setText("Graficos de Datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        background.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        añadirProfesor.setText("Añadir");
        añadirProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirProfesorActionPerformed(evt);
            }
        });
        background.add(añadirProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        nameCarrerField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nameCarrerField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameCarrerField.setPreferredSize(new java.awt.Dimension(200, 25));
        nameCarrerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameCarrerFieldActionPerformed(evt);
            }
        });
        background.add(nameCarrerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        curseMajorField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        curseMajorField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        curseMajorField.setPreferredSize(new java.awt.Dimension(200, 25));
        curseMajorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curseMajorFieldActionPerformed(evt);
            }
        });
        background.add(curseMajorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 140, -1));

        estudiantesField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        estudiantesField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        estudiantesField.setPreferredSize(new java.awt.Dimension(200, 25));
        estudiantesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudiantesFieldActionPerformed(evt);
            }
        });
        background.add(estudiantesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 140, -1));

        profesoresField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        profesoresField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        profesoresField.setPreferredSize(new java.awt.Dimension(200, 25));
        profesoresField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesoresFieldActionPerformed(evt);
            }
        });
        background.add(profesoresField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void majorSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_majorSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_majorSelectorActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        login newWindow4 = new login();
        newWindow4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void cursosAñadirUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursosAñadirUActionPerformed
        //aca no va nada gg
    }//GEN-LAST:event_cursosAñadirUActionPerformed

    private void añadirCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirCarreraActionPerformed
        Major major = new Major();
        major.setNameMajor(nameCarrerField.getText());
        majorsInUniversity.add(major);
        //algoritmo de no repeticion
        for(int i=0;i<main.majorsInUniversity.size();i++){
            majorSelector.addItem(main.majorsInUniversity.get(i).getNameMajor());
        }
    }//GEN-LAST:event_añadirCarreraActionPerformed

    private void añadirCursosCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirCursosCarreraActionPerformed

        try {
            for (int i = 0; i < main.majorsInUniversity.size(); i++) {
                if (main.majorsInUniversity.get(i).getNameMajor().equals(majorSelector.getSelectedItem())) {
                    for (int j = 0;
                            j < 30;
                            j++) {

                        main.majorsInUniversity.get(i).addSubjectToMajor(DataGenerator.generateRandomCourses(j));
                    }
                }
            }
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error Añadiendo Data");
        }
    }//GEN-LAST:event_añadirCursosCarreraActionPerformed

    private void añadirEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirEstudiantesActionPerformed
        if (Integer.parseInt(estudiantesField.getText()) < 100001) {
            for (int i = 0;
                    i < Integer.parseInt(estudiantesField.getText());
                    i++) {
                DataInUniversity.AddStudentsToMajor(DataGenerator.generateRandomStudent(i));
            }
            TextousuarioE.setText(DataInUniversity.getStudentsFromMajorInArray().get(1).getUser());
            TextopassE.setText(DataInUniversity.getStudentsFromMajorInArray().get(1).getPassword());
        } else {
            JOptionPane.showMessageDialog(this, "No es posible añadir mas de 100000 Estudiantes por el bien de tu sistema :c");
        }

    }//GEN-LAST:event_añadirEstudiantesActionPerformed

    private void añadirCarrera4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirCarrera4ActionPerformed

        if (Integer.parseInt(cursosAñadirU.getText()) < 100001) {
            for (int i = 0;
                    i < Integer.parseInt(cursosAñadirU.getText());
                    i++) {

                DataInUniversity.addSubjectToMajor(DataGenerator.generateRandomCourses(i));
            }
        } else {
            JOptionPane.showMessageDialog(this, "No es posible añadir mas de 100000 cursos por el bien de tu sistema :c");
        }

    }//GEN-LAST:event_añadirCarrera4ActionPerformed

    private void TextousuarioEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextousuarioEActionPerformed
        // Tnada aca
    }//GEN-LAST:event_TextousuarioEActionPerformed

    private void TextousuarioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextousuarioPActionPerformed
        // Tnada aca
    }//GEN-LAST:event_TextousuarioPActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*
    *
    * aca iria la ventana de plot y medicion
         */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TextopassPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextopassPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextopassPActionPerformed

    private void añadirProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirProfesorActionPerformed
        if (Integer.parseInt(profesoresField.getText()) < 100001) {
            for (int i = 0;
                    i < Integer.parseInt(profesoresField.getText());
                    i++) {
                DataInUniversity.AddTeachersToMajor(DataGenerator.generateRandomTeacher(i));
            }
            TextopassP.setText(DataInUniversity.getTeacherFromMajorInArray().get(1).getPassword());
            TextousuarioP.setText(DataInUniversity.getTeacherFromMajorInArray().get(1).getUser());
        } else {
            JOptionPane.showMessageDialog(this, "No es posible añadir mas de 100000 cursos por el bien de tu sistema :c");
        }
    }//GEN-LAST:event_añadirProfesorActionPerformed

    private void nameCarrerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameCarrerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameCarrerFieldActionPerformed

    private void curseMajorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curseMajorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curseMajorFieldActionPerformed

    private void estudiantesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudiantesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estudiantesFieldActionPerformed

    private void profesoresFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesoresFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profesoresFieldActionPerformed

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
            java.util.logging.Logger.getLogger(SetData.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetData.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetData.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetData.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextopassE;
    private javax.swing.JTextField TextopassP;
    private javax.swing.JTextField TextousuarioE;
    private javax.swing.JTextField TextousuarioP;
    private javax.swing.JButton añadirCarrera;
    private javax.swing.JButton añadirCarrera4;
    private javax.swing.JButton añadirCursosCarrera;
    private javax.swing.JButton añadirEstudiantes;
    private javax.swing.JButton añadirProfesor;
    private javax.swing.JPanel background;
    private javax.swing.JTextField curseMajorField;
    private javax.swing.JTextField cursosAñadirU;
    private javax.swing.JTextField estudiantesField;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton login;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> majorSelector;
    private javax.swing.JTextField nameCarrerField;
    private javax.swing.JLabel ocupationLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JLabel passwordLabel3;
    private javax.swing.JLabel passwordLabel4;
    private javax.swing.JLabel passwordLabel5;
    private javax.swing.JTextField profesoresField;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JLabel userLabel2;
    private javax.swing.JLabel userLabel3;
    private javax.swing.JLabel userLabel4;
    private javax.swing.JLabel userLabel5;
    private javax.swing.JLabel userLabel6;
    private javax.swing.JLabel userLabel7;
    private javax.swing.JLabel userLabel8;
    // End of variables declaration//GEN-END:variables
}
