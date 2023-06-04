package GUI;

import Data.Major;
import Data.Subject;
import com.initial.main;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminMenu extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Major majorSelected;
    
    /*
    *falta añadir funcionalidad de datos de estudiante y profesor, ademas de una ventana de edicion
    *ademas falta añadir medicion y ploting
    *falta hacer video
    *falta hacer que no se repitan
    *y la gui de datos de prueba
    *poner bonito el github 
    */
    
    
    private void AñadirTablaEstudiantes(Major subjects) {
        
        //añade columnas de la tabla
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Usuario");
        modelo.addColumn("Carrrera");
        //actualiza la infromacion de la tabla
        refrescarTabla(subjects);
    }
    private void AñadirTabla(Major subjects) {
        //añade columnas de la tabla
        modelo.addColumn("Asignatura");
        modelo.addColumn("Codigo");
        modelo.addColumn("Creditos");
        modelo.addColumn("cupos");
        //actualiza la infromacion de la tabla
        refrescarTabla(subjects);
    }

    private void refrescarTabla(Major subjects, String parameter, int filterby) {
        /*        try {
*           Major major = DataInUniversity;
*          Subject subjectToModify = major.getStudentsFromMajorByName(nameField.getText()); 
*         subjectToModify.modifySubect(subjectToModify, nameField.getText(), Integer.parseInt(codeField.getText()), Integer.parseInt(creditField.getText()), 8);
*        JOptionPane.showMessageDialog(this, "Se edito exitosamente el Grupo");
*
 *       } catch (HeadlessException | NumberFormatException e) {
 *          JOptionPane.showMessageDialog(this, "Error editando informacion, curso no encontrado");
 *     }
         */
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        ArrayList<Subject> filteredInArray;
        switch (filterby) {
            case 1 ->
                filteredInArray = subjects.filterByCode(Integer.parseInt(parameter));
            case 2 ->
                filteredInArray = subjects.filterByCredits(Integer.parseInt(parameter));
            case 3 ->
                filteredInArray = subjects.filterByName(parameter);
            default -> {
                filteredInArray = main.DataInUniversity.readAllByName();
            }
        }

        for (Subject subject : filteredInArray) {
            Object a[] = new Object[4];
            a[0] = subject.getNameSubject();
            a[1] = subject.getCodeSubject();
            a[2] = subject.getCreditsSubject();
            a[3] = subject.getRoomSubject();
            modelo.addRow(a);
        }
        TablaCursos.setModel(modelo);
    }

    private void refrescarTabla(Major subjects) {

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        ArrayList<Subject> SubjectsInArray = subjects.readAllByName();
        for (Subject subject : SubjectsInArray) {
            Object a[] = new Object[4];
            a[0] = subject.getNameSubject();
            a[1] = subject.getCodeSubject();
            a[2] = subject.getCreditsSubject();
            a[3] = subject.getRoomSubject();
            modelo.addRow(a);
        }
        TablaCursos.setModel(modelo);
    }

    public AdminMenu() {
        initComponents();
        majorSelected = main.DataInUniversity;
        AñadirTabla(main.DataInUniversity);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        leftBar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        scrollPanel = new javax.swing.JScrollPane();
        TablaCursos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        parameterField = new javax.swing.JTextField();
        parameterBox = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        leftBar.setBackground(new java.awt.Color(70, 107, 63));
        leftBar.setPreferredSize(new java.awt.Dimension(233, 650));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/escudoBlanco.png"))); // NOI18N
        logo.setPreferredSize(new java.awt.Dimension(233, 650));

        javax.swing.GroupLayout leftBarLayout = new javax.swing.GroupLayout(leftBar);
        leftBar.setLayout(leftBarLayout);
        leftBarLayout.setHorizontalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftBarLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        leftBarLayout.setVerticalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        title.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("BIENVENIDO ADMINISTRADOR");

        separator.setBackground(new java.awt.Color(0, 0, 0));

        TablaCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "name", "nome", "acuerdo", "de las otras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPanel.setViewportView(TablaCursos);

        jLabel1.setText("¿Que desea modificar?");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Datos Estudiantes", "Datos Profesores", "Datos Cursos" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar sesion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Crear Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Mostrar");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        parameterField.setText("Ingrese el parametro a buscar");
        parameterField.setToolTipText("");
        parameterField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parameterFieldMouseClicked(evt);
            }
        });
        parameterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parameterFieldActionPerformed(evt);
            }
        });

        parameterBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Creditos", "Nombre", " " }));
        parameterBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parameterBoxMouseClicked(evt);
            }
        });
        parameterBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parameterBoxActionPerformed(evt);
            }
        });

        jButton5.setText("Filtrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(leftBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(234, 234, 234))
                            .addComponent(scrollPanel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(parameterBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)
                                        .addComponent(parameterField, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jButton5))
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jButton3)))
                                .addGap(0, 140, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator)
                        .addContainerGap())))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(leftBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parameterBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parameterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(27, 27, 27))
        );

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

    private void parameterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parameterFieldActionPerformed

    }//GEN-LAST:event_parameterFieldActionPerformed

    private void parameterFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parameterFieldMouseClicked
        parameterField.setText("");
    }//GEN-LAST:event_parameterFieldMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        create newWindow4 = new create();
        newWindow4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        login.currentAdmin = null;
        login newWindow4 = new login();
        newWindow4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            if ("Datos Estudiantes".equals(jComboBox1.getSelectedItem())) {
                refrescarTabla(majorSelected, parameterField.getText(), 1);
            }
            if ("Datos Profesores".equals(jComboBox1.getSelectedItem())) {
                refrescarTabla(majorSelected, parameterField.getText(), 2);
            }
            if ("Datos Cursos".equals(jComboBox1.getSelectedItem())) {
                refrescarTabla(majorSelected, parameterField.getText(), 3);
            }
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un parametro");
            refrescarTabla(main.DataInUniversity);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void parameterBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parameterBoxMouseClicked

    }//GEN-LAST:event_parameterBoxMouseClicked

    private void parameterBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parameterBoxActionPerformed

    }//GEN-LAST:event_parameterBoxActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //con este boton filtramos los cursos por atributo
        try {
            if ("Codigo".equals(parameterBox.getSelectedItem())) {
                refrescarTabla(majorSelected, parameterField.getText(), 1);
            }
            if ("Creditos".equals(parameterBox.getSelectedItem())) {
                refrescarTabla(majorSelected, parameterField.getText(), 2);
            }
            if ("Nombre".equals(parameterBox.getSelectedItem())) {
                refrescarTabla(majorSelected, parameterField.getText(), 3);
            }
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un parametro");
            refrescarTabla(main.DataInUniversity);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCursos;
    private javax.swing.JPanel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel leftBar;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> parameterBox;
    private javax.swing.JTextField parameterField;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
