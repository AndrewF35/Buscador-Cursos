package com.initial;

import javax.swing.table.DefaultTableModel;
import Data.DataGenerator;
import Data.Estudiante;
import Data.Major;
import Data.Subject;
import javax.swing.JOptionPane;

public class initial extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    public static Major subjects = new Major();

    public void AñadirTabla() {
        modelo.addColumn("Asignatura");
        modelo.addColumn("Codigo");
        modelo.addColumn("Creditos");
        modelo.addColumn("cupos");
        refrescarTabla();
    }

    public void refrescarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        for (Subject subject : subjects.getSubjectsFromMajor()) {
            Object a[] = new Object[4];
            a[0] = subject.getNameSubject();
            a[1] = subject.getCodeSubject();
            a[2] = subject.getCreditsSubject();
            a[3] = subject.getQuotesSubject();
            modelo.addRow(a);
        }
        TablaCursos.setModel(modelo);
    }

    public initial() {
        initComponents();
        AñadirTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        leftBar = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        parameterBox = new javax.swing.JComboBox<>();
        parameterField = new javax.swing.JTextField();
        newButton = new javax.swing.JButton();
        editButton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCursos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 400));
        setPreferredSize(new java.awt.Dimension(650, 400));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftBar.setBackground(new java.awt.Color(0, 102, 51));

        javax.swing.GroupLayout leftBarLayout = new javax.swing.GroupLayout(leftBar);
        leftBar.setLayout(leftBarLayout);
        leftBarLayout.setHorizontalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        leftBarLayout.setVerticalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        background.add(leftBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 400));

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setText("BUSCADOR DE CURSOS");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        parameterBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Creditos", "Nombre", " " }));
        parameterBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parameterBoxMouseClicked(evt);
            }
        });
        background.add(parameterBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        parameterField.setForeground(new java.awt.Color(204, 204, 204));
        parameterField.setText("Ingrese el parametro a buscar");
        parameterField.setToolTipText("");
        background.add(parameterField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 270, 30));

        newButton.setText("Nuevo curso");
        newButton.setPreferredSize(new java.awt.Dimension(70, 32));
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });
        background.add(newButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 100, -1));

        editButton1.setText("Editar curso");
        editButton1.setPreferredSize(new java.awt.Dimension(70, 32));
        editButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton1ActionPerformed(evt);
            }
        });
        background.add(editButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 100, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        TablaCursos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaCursos);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 350, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        newGroup v1 = new newGroup();
        v1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newButtonActionPerformed

    private void editButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton1ActionPerformed
        editGroup v2 = new editGroup();
        v2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editButton1ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, "Aun no implementamos esta funcionalidad :D");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void parameterBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parameterBoxMouseClicked

    }//GEN-LAST:event_parameterBoxMouseClicked

    public static void main(String args[]) {
        int numCoursesToGenerate = 10; // Cantidad de cursos a generar
        for (int i = 0; i < numCoursesToGenerate; i++) {
            subjects.addSubjectToMajor(DataGenerator.generateRandomCourses(i));
        }
        System.out.println(subjects.readAllByName());
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new initial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCursos;
    private javax.swing.JPanel background;
    private javax.swing.JButton editButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leftBar;
    private javax.swing.JButton newButton;
    private javax.swing.JComboBox<String> parameterBox;
    private javax.swing.JTextField parameterField;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
