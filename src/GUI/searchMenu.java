package GUI;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

import Data.Major;
import Data.Subject;
import com.initial.main;
import java.util.ArrayList;

public class searchMenu extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Major majorSelected;
    
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
        ArrayList<Subject> SubjectsInArray =subjects.readAllByName();
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

    public searchMenu() {
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
        jButton1 = new javax.swing.JButton();
        parameterBox = new javax.swing.JComboBox<>();
        parameterField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 650));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        leftBar.setBackground(new java.awt.Color(70, 107, 63));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/escudoBlanco.png"))); // NOI18N

        javax.swing.GroupLayout leftBarLayout = new javax.swing.GroupLayout(leftBar);
        leftBar.setLayout(leftBarLayout);
        leftBarLayout.setHorizontalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        leftBarLayout.setVerticalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        title.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("BUSCADOR DE CURSOS");

        separator.setBackground(new java.awt.Color(0, 0, 0));

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
        scrollPanel.setViewportView(TablaCursos);
        if (TablaCursos.getColumnModel().getColumnCount() > 0) {
            TablaCursos.getColumnModel().getColumn(0).setResizable(false);
            TablaCursos.getColumnModel().getColumn(1).setResizable(false);
            TablaCursos.getColumnModel().getColumn(2).setResizable(false);
            TablaCursos.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jLabel1.setText("¿Que data desea dodificar? ");

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        for(int i=0;i<main.majorsInUniversity.size();i++){
            jComboBox1.addItem(main.majorsInUniversity.get(i).getNameMajor());
        }
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(parameterBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(parameterField, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(leftBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(backgroundLayout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addGap(307, 307, 307)
                                    .addComponent(jButton2))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(title)
                .addGap(26, 26, 26)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parameterField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parameterBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaCursosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TablaCursosComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaCursosComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void parameterBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parameterBoxMouseClicked

    }//GEN-LAST:event_parameterBoxMouseClicked

    private void parameterBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parameterBoxActionPerformed

    }//GEN-LAST:event_parameterBoxActionPerformed

    private void parameterFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parameterFieldMouseClicked
        parameterField.setText("");
    }//GEN-LAST:event_parameterFieldMouseClicked

    private void parameterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parameterFieldActionPerformed

    }//GEN-LAST:event_parameterFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(login.currentStudent != null){
            studentMenu newWindow4 = new studentMenu();
            newWindow4.setVisible(true);
            this.dispose();
        }
        teacherMenu newWindow5 = new teacherMenu();
        newWindow5.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            for (int i = 0; i < main.majorsInUniversity.size(); i++) {
                if (main.majorsInUniversity.get(i).getNameMajor().equals(jComboBox1.getSelectedItem())) {
                    majorSelected = main.majorsInUniversity.get(i);
                    refrescarTabla(majorSelected);
                }
            }
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Materias No disponibles");
            refrescarTabla(main.DataInUniversity);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(searchMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCursos;
    private javax.swing.JPanel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
