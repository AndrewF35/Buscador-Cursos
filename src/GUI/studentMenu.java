package GUI;

import Data.Major;
import Data.Student;
import Data.Subject;
import com.initial.main;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class studentMenu extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    private void AñadirTabla(Major major) {
        //añade columnas de la tabla
        modelo.addColumn("Asignatura");
        modelo.addColumn("Codigo");
        modelo.addColumn("Creditos");
        modelo.addColumn("Salon");
        //actualiza la infromacion de la tabla
        refrescarTabla(major);
    }

    private void refrescarTabla(Student student, int filterby) {

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        List<Subject> filteredInArray;

        switch (filterby) {
            case 1 ->
                filteredInArray = student.getSchedule();
            case 2 ->
                filteredInArray = student.getDoneSubjects();
            case 3 ->
                filteredInArray = student.getRemainingSubjects();
            default -> {
                filteredInArray = main.DataInUniversity.readAllByName();
            }
        }

        for (Subject subject : filteredInArray) {
            Object a[] = new Object[4];
            a[0] = subject.getNameSubject();
            a[1] = subject.getCodeSubject();
            a[2] = subject.getCreditsSubject();
            a[3] = subject.getQuotesSubject();
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
            a[3] = subject.getQuotesSubject();
            modelo.addRow(a);
        }
        TablaCursos.setModel(modelo);
    }

    public studentMenu() {
        initComponents();
        AñadirTabla(login.currentStudent.getMajorCurrent());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        leftBar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        nameField = new javax.swing.JTextField();
        tableField = new javax.swing.JTextField();
        searchMenuButton = new javax.swing.JPanel();
        searchMenuText = new javax.swing.JLabel();
        scheduleText = new javax.swing.JLabel();
        scheduleText1 = new javax.swing.JLabel();
        scheduleText2 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        jComboFiltro = new javax.swing.JComboBox<>();
        scheduleText3 = new javax.swing.JLabel();
        scrollPanel1 = new javax.swing.JScrollPane();
        TablaCursos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        scheduleText4 = new javax.swing.JLabel();
        majorField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftBar.setBackground(new java.awt.Color(70, 107, 63));
        leftBar.setPreferredSize(new java.awt.Dimension(233, 650));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/escudoBlanco.png"))); // NOI18N

        javax.swing.GroupLayout leftBarLayout = new javax.swing.GroupLayout(leftBar);
        leftBar.setLayout(leftBarLayout);
        leftBarLayout.setHorizontalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        leftBarLayout.setVerticalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(leftBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        title.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("HISTORIA ACADEMICA");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 37, 710, 30));

        separator1.setBackground(new java.awt.Color(0, 0, 0));
        separator1.setForeground(new java.awt.Color(0, 0, 0));
        background.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 201, 568, 10));

        nameField.setEditable(false);
        nameField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nameField.setPreferredSize(new java.awt.Dimension(300, 25));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        nameField.setText(login.currentStudent.getName());
        userField.setText(login.currentStudent.getUser());
        background.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        tableField.setEditable(false);
        tableField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableField.setPreferredSize(new java.awt.Dimension(300, 25));
        tableField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableFieldActionPerformed(evt);
            }
        });
        if ("Horario".equals(jComboFiltro.getSelectedItem())) {
            tableField.setText("Horario");
        }

        if ("Materias No Cursadas".equals(jComboFiltro.getSelectedItem())) {
            tableField.setText("Materias No Cursadas");
        }

        if ("Materias Cursadas".equals(jComboFiltro.getSelectedItem())) {
            tableField.setText("Materias Cursadas");
        }
        if ("Materias Carrera".equals(jComboFiltro.getSelectedItem())) {
            tableField.setText("Materias Carrera");
        }
        background.add(tableField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 300, -1));

        searchMenuButton.setBackground(new java.awt.Color(255, 255, 255));
        searchMenuButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchMenuButton.setPreferredSize(new java.awt.Dimension(125, 25));
        searchMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMenuButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMenuButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMenuButtonMouseExited(evt);
            }
        });

        searchMenuText.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        searchMenuText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchMenuText.setText("Buscador de cursos");
        searchMenuText.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout searchMenuButtonLayout = new javax.swing.GroupLayout(searchMenuButton);
        searchMenuButton.setLayout(searchMenuButtonLayout);
        searchMenuButtonLayout.setHorizontalGroup(
            searchMenuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchMenuButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(searchMenuText, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        searchMenuButtonLayout.setVerticalGroup(
            searchMenuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchMenuButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(searchMenuText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(searchMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, -1, -1));

        scheduleText.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        scheduleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scheduleText.setText("Mostrando:");
        scheduleText.setPreferredSize(new java.awt.Dimension(100, 25));
        background.add(scheduleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 96, 21));

        scheduleText1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        scheduleText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scheduleText1.setText("Materias a mostrar");
        scheduleText1.setPreferredSize(new java.awt.Dimension(100, 25));
        background.add(scheduleText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 170, 21));

        scheduleText2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        scheduleText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scheduleText2.setText("Usuario");
        scheduleText2.setPreferredSize(new java.awt.Dimension(100, 25));
        background.add(scheduleText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 96, 21));

        userField.setEditable(false);
        userField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        userField.setPreferredSize(new java.awt.Dimension(300, 25));
        background.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jComboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Materias Carrera", "Horario", "Materias No Cursadas", "Materias Cursadas" }));
        jComboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFiltroActionPerformed(evt);
            }
        });
        background.add(jComboFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 200, 20));

        scheduleText3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        scheduleText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scheduleText3.setText("Nombre");
        scheduleText3.setPreferredSize(new java.awt.Dimension(100, 25));
        background.add(scheduleText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 96, 21));

        TablaCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Asignatura", "Codigo", "Creditos", "Salon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaCursos.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TablaCursosComponentAdded(evt);
            }
        });
        scrollPanel1.setViewportView(TablaCursos);

        background.add(scrollPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 560, 320));

        jButton1.setText("Buscar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 80, 30));

        jButton2.setLabel("Cerrar Sesion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        background.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 570, 120, -1));

        jButton3.setText("Añadir Materia al Horario");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        background.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 170, 30));

        scheduleText4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        scheduleText4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scheduleText4.setText("Carrera");
        scheduleText4.setPreferredSize(new java.awt.Dimension(100, 25));
        background.add(scheduleText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 96, 21));

        majorField1.setEditable(false);
        majorField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        majorField1.setPreferredSize(new java.awt.Dimension(300, 25));
        majorField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                majorField1ActionPerformed(evt);
            }
        });
        majorField1.setText(login.currentStudent.getMajorCurrent().getNameMajor());
        background.add(majorField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 300, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFiltroActionPerformed
    }//GEN-LAST:event_jComboFiltroActionPerformed

    private void TablaCursosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TablaCursosComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaCursosComponentAdded

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed


    }//GEN-LAST:event_nameFieldActionPerformed

    private void tableFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        login.currentStudent =null;
        login newWindow4 = new login();
        newWindow4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AñadirMateria newWindow4 = new AñadirMateria();
        newWindow4.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            if ("Horario".equals(jComboFiltro.getSelectedItem())) {
                tableField.setText("Horario");
                refrescarTabla(login.currentStudent, 1);
            }
            if ("Materias No Cursadas".equals(jComboFiltro.getSelectedItem())) {
                refrescarTabla(login.currentStudent, 2);
                tableField.setText("Materias No Cursadas");
            }
            if ("Materias Cursadas".equals(jComboFiltro.getSelectedItem())) {
                refrescarTabla(login.currentStudent, 3);
                tableField.setText("Materias Cursadas");
            }
            if ("Materias Carrera".equals(jComboFiltro.getSelectedItem())) {
                refrescarTabla(login.currentStudent.getMajorCurrent());
                tableField.setText("Materias Carrera");
            }
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No hay informacion academica para imprimir");
            refrescarTabla(login.currentStudent.getMajorCurrent());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void majorField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_majorField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_majorField1ActionPerformed

    private void searchMenuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMenuButtonMouseExited
        // searchMenuButton.setBackground(Color.white);
    }//GEN-LAST:event_searchMenuButtonMouseExited

    private void searchMenuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMenuButtonMouseEntered
        //searchMenuButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_searchMenuButtonMouseEntered

    private void searchMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMenuButtonMouseClicked
        searchMenu newWindow4 = new searchMenu();
        newWindow4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchMenuButtonMouseClicked

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
            java.util.logging.Logger.getLogger(studentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCursos;
    private javax.swing.JPanel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboFiltro;
    private javax.swing.JPanel leftBar;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField majorField1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel scheduleText;
    private javax.swing.JLabel scheduleText1;
    private javax.swing.JLabel scheduleText2;
    private javax.swing.JLabel scheduleText3;
    private javax.swing.JLabel scheduleText4;
    private javax.swing.JScrollPane scrollPanel1;
    private javax.swing.JPanel searchMenuButton;
    private javax.swing.JLabel searchMenuText;
    private javax.swing.JSeparator separator1;
    private javax.swing.JTextField tableField;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
