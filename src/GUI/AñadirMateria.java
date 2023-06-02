package GUI;

import Data.Major;
import Data.Student;
import Data.Subject;
import com.initial.main;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class AñadirMateria extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private ArrayList<Subject> subjectsToAdd = new ArrayList<>();;
    private ArrayList<Subject> filteredInArray;

    private void addCheckBox(int column, JTable table) {
        TableColumn tc = table.getColumnModel().getColumn(column);
        tc.setCellEditor(table.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(table.getDefaultRenderer(Boolean.class));        
    }
    private void AñadirTabla(Major subjects) {
        //añade columnas de la tabla
        modelo.addColumn("Asignatura");
        modelo.addColumn("Codigo");
        modelo.addColumn("Creditos");
        modelo.addColumn("Salon");
        modelo.addColumn("Añadir");
        //actualiza la infromacion de la tabla
        addCheckBox(4, TablaCursos);
        refrescarTabla(subjects);   
    }

    private void refrescarTabla(Major subjects, String parameter, int filterby) {

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
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
            a[3] = subject.getQuotesSubject();
            modelo.addRow(a);
        }
        addCheckBox(4, TablaCursos);
        TablaCursos.setModel(modelo);
        

    }

    private void refrescarTabla(Major subjects) {

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        filteredInArray = subjects.readAllByName();
        for (Subject subject : filteredInArray) {
            Object a[] = new Object[5];
            a[0] = subject.getNameSubject();
            a[1] = subject.getCodeSubject();
            a[2] = subject.getCreditsSubject();
            a[3] = subject.getQuotesSubject();
            modelo.addRow(a);
        }
        addCheckBox(4, TablaCursos);
        TablaCursos.setModel(modelo);
        
    }

    public AñadirMateria() {
        initComponents();
        AñadirTabla(login.currentStudent.getMajorCurrent());

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        codeLabel = new javax.swing.JLabel();
        filterField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jComboBox12 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        scrollPanel1 = new javax.swing.JScrollPane();
        TablaCursos = new javax.swing.JTable();
        codeLabel1 = new javax.swing.JLabel();
        majorField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setRequestFocusEnabled(false);

        codeLabel.setText("Filtrar por:");

        filterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterFieldActionPerformed(evt);
            }
        });

        saveButton.setText("Añadir");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        Regresar.setText("Cerrar Menu");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre", "Creditos" }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });

        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TablaCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Asignatura", "Codigo", "Creditos", "Salon", "Añadir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
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

        codeLabel1.setText("Añadiendo Materias de ");

        majorField.setEditable(false);
        majorField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        majorField.setPreferredSize(new java.awt.Dimension(300, 25));
        majorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                majorFieldActionPerformed(evt);
            }
        });
        majorField.setText(login.currentStudent.getMajorCurrent().getNameMajor());

        jButton2.setText("Eliminar");
        jButton2.setToolTipText("");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(saveButton)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2)
                            .addGap(22, 22, 22)
                            .addComponent(Regresar))
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addComponent(codeLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(majorField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addComponent(codeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox12, 0, 242, Short.MAX_VALUE)
                                        .addComponent(filterField)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeLabel)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(majorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(Regresar)
                    .addComponent(jButton2))
                .addGap(1155, 1155, 1155))
        );

        jPanel1.setBackground(new java.awt.Color(70, 107, 63));

        title.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 239));
        title.setText("Editar Materias del Horario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(title)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaCursosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TablaCursosComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaCursosComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if ("Codigo".equals(jComboBox12.getSelectedItem())) {
                refrescarTabla(login.currentStudent.getMajorCurrent(), filterField.getText(), 1);
            }
            if ("Creditos".equals(jComboBox12.getSelectedItem())) {
                refrescarTabla(login.currentStudent.getMajorCurrent(), filterField.getText(), 2);
            }
            if ("Nombre".equals(jComboBox12.getSelectedItem())) {
                refrescarTabla(login.currentStudent.getMajorCurrent(), filterField.getText(), 3);
            }
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un parametro");
            refrescarTabla(main.DataInUniversity);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        try {
            for (int i = 0; i <filteredInArray.size(); i++) {
                if ((TablaCursos.getValueAt(i, 4)) != null) {
                    subjectsToAdd.add(filteredInArray.get(i));
                }
            }
            for (int i = 0; i < subjectsToAdd.size(); i++) {
                login.currentStudent.addSubjectToSchedule(subjectsToAdd.get(i));
            }
            subjectsToAdd.clear();
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error añadiendo informacion");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void filterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterFieldActionPerformed

    }//GEN-LAST:event_filterFieldActionPerformed

    private void majorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_majorFieldActionPerformed
    
    }//GEN-LAST:event_majorFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AñadirMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirMateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JTable TablaCursos;
    private javax.swing.JPanel background;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JLabel codeLabel1;
    private javax.swing.JTextField filterField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField majorField;
    private javax.swing.JButton saveButton;
    private javax.swing.JScrollPane scrollPanel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
