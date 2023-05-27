
package GUI;

import java.awt.Color;
import javax.swing.JOptionPane;

public class studentMenu extends javax.swing.JFrame {

    /**
     * Creates new form studentMenu
     */
    public studentMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        leftBar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        scheduleButton = new javax.swing.JPanel();
        scheduleText = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        separator2 = new javax.swing.JSeparator();
        nameField = new javax.swing.JTextField();
        majorField = new javax.swing.JTextField();
        paField2 = new javax.swing.JTextField();
        papaField = new javax.swing.JTextField();
        scrollPanel = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchMenuButton = new javax.swing.JPanel();
        searchMenuText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 650));
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
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 37, 710, -1));

        scheduleButton.setBackground(new java.awt.Color(255, 255, 255));
        scheduleButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        scheduleButton.setPreferredSize(new java.awt.Dimension(100, 25));
        scheduleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scheduleButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                scheduleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                scheduleButtonMouseExited(evt);
            }
        });

        scheduleText.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        scheduleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scheduleText.setText("Horario");
        scheduleText.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout scheduleButtonLayout = new javax.swing.GroupLayout(scheduleButton);
        scheduleButton.setLayout(scheduleButtonLayout);
        scheduleButtonLayout.setHorizontalGroup(
            scheduleButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scheduleText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );
        scheduleButtonLayout.setVerticalGroup(
            scheduleButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scheduleText, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        background.add(scheduleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 115, -1, -1));

        separator1.setBackground(new java.awt.Color(0, 0, 0));
        separator1.setForeground(new java.awt.Color(0, 0, 0));
        background.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 201, 568, 10));

        separator2.setBackground(new java.awt.Color(0, 0, 0));
        separator2.setForeground(new java.awt.Color(0, 0, 0));
        background.add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 358, 568, 11));

        nameField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nameField.setPreferredSize(new java.awt.Dimension(300, 25));
        background.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 92, -1, -1));

        majorField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        majorField.setPreferredSize(new java.awt.Dimension(300, 25));
        background.add(majorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 135, -1, -1));

        paField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        paField2.setPreferredSize(new java.awt.Dimension(100, 100));
        background.add(paField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 229, -1, -1));

        papaField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        papaField.setPreferredSize(new java.awt.Dimension(100, 100));
        background.add(papaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 229, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
                "Asignatura", "Codigo", "Creditos", "Promedio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        table.setPreferredSize(new java.awt.Dimension(150, 50));
        scrollPanel.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        background.add(scrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 387, 568, 132));

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
            .addComponent(searchMenuText, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        searchMenuButtonLayout.setVerticalGroup(
            searchMenuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchMenuText, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        background.add(searchMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 537, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scheduleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleButtonMouseEntered
        scheduleButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_scheduleButtonMouseEntered

    private void scheduleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleButtonMouseExited
        scheduleButton.setBackground(Color.white);
    }//GEN-LAST:event_scheduleButtonMouseExited

    private void searchMenuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMenuButtonMouseEntered
        searchMenuButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_searchMenuButtonMouseEntered

    private void searchMenuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMenuButtonMouseExited
        searchMenuButton.setBackground(Color.white);
    }//GEN-LAST:event_searchMenuButtonMouseExited

    private void scheduleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleButtonMouseClicked
        JOptionPane.showMessageDialog(this, "Funcion no disponible");
    }//GEN-LAST:event_scheduleButtonMouseClicked

    private void searchMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMenuButtonMouseClicked
        searchMenu newWindow4 = new searchMenu();
        newWindow4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchMenuButtonMouseClicked

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
    private javax.swing.JPanel background;
    private javax.swing.JPanel leftBar;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField majorField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField paField2;
    private javax.swing.JTextField papaField;
    private javax.swing.JPanel scheduleButton;
    private javax.swing.JLabel scheduleText;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JPanel searchMenuButton;
    private javax.swing.JLabel searchMenuText;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}