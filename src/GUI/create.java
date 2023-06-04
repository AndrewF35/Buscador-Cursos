package GUI;

import Data.Major;
import static com.initial.main.DataInUniversity;
import java.awt.Color;
import javax.swing.JOptionPane;

public class create extends javax.swing.JFrame {

    public create() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        leftBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        codeLabel = new javax.swing.JLabel();
        codeField = new javax.swing.JTextField();
        creditLabel = new javax.swing.JLabel();
        creditField = new javax.swing.JTextField();
        roomLabel = new javax.swing.JLabel();
        roomField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        descriptionField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JPanel();
        cancelText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(950, 650));

        leftBar.setBackground(new java.awt.Color(70, 107, 63));
        leftBar.setPreferredSize(new java.awt.Dimension(233, 650));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/escudoBlanco.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(233, 650));

        javax.swing.GroupLayout leftBarLayout = new javax.swing.GroupLayout(leftBar);
        leftBar.setLayout(leftBarLayout);
        leftBarLayout.setHorizontalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        leftBarLayout.setVerticalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        title.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CREAR MATERIA");

        nameLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nameLabel.setText("NOMBRE");

        nameField.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nameField.setPreferredSize(new java.awt.Dimension(250, 25));

        codeLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        codeLabel.setText("CODIGO");

        codeField.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        codeField.setPreferredSize(new java.awt.Dimension(250, 25));

        creditLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        creditLabel.setText("CREDITOS");

        creditField.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        creditField.setPreferredSize(new java.awt.Dimension(250, 25));

        roomLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        roomLabel.setText("SALON");

        roomField.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        roomField.setPreferredSize(new java.awt.Dimension(250, 25));

        descriptionLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        descriptionLabel.setText("DESCRIPCION");

        descriptionField.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        descriptionField.setPreferredSize(new java.awt.Dimension(250, 25));

        cancelButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cancelButton.setPreferredSize(new java.awt.Dimension(100, 25));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelButtonMouseExited(evt);
            }
        });

        cancelText.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cancelText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelText.setText("Cancelar");
        cancelText.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout cancelButtonLayout = new javax.swing.GroupLayout(cancelButton);
        cancelButton.setLayout(cancelButtonLayout);
        cancelButtonLayout.setHorizontalGroup(
            cancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelText, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );
        cancelButtonLayout.setVerticalGroup(
            cancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelText, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addGap(0, 98, Short.MAX_VALUE)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLabel)
                                    .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codeLabel)
                                    .addComponent(creditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(creditLabel)
                                    .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roomLabel))
                                .addGap(18, 18, 18)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descriptionLabel)
                                    .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(95, 95, 95))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(leftBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(title)
                .addGap(55, 55, 55)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(descriptionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        cancelButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setBackground(Color.white);
    }//GEN-LAST:event_cancelButtonMouseExited

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        AdminMenu newWindow7 = new AdminMenu();
        newWindow7.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Major newSubject = DataInUniversity;
            newSubject.addSubjectToMajor(nameField.getText(), Integer.parseInt(codeField.getText()), Integer.parseInt(creditField.getText()), Integer.parseInt(roomField.getText()));
            JOptionPane.showMessageDialog(this, """
                                                Materia a\u00f1adida exitosamente con esta informacion 
                                                Nombre: """+nameField.getText() + " Codigo: "+codeField.getText() + " Creditos: "+creditField.getText()+" Salon: "+ roomField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error añadiendo informacion");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel cancelButton;
    private javax.swing.JLabel cancelText;
    private javax.swing.JTextField codeField;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JTextField creditField;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel leftBar;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField roomField;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
