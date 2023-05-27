package GUI;

import java.awt.Color;

public class register extends javax.swing.JFrame {

    public register() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        ocupationLabel = new javax.swing.JLabel();
        ocupationField = new javax.swing.JComboBox<>();
        registerButton = new javax.swing.JPanel();
        registerText = new javax.swing.JLabel();
        cancelButton = new javax.swing.JPanel();
        cancelText = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 470));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("REGISTRO");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 350, -1));

        userLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("USUARIO");
        background.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 350, -1));

        userField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        userField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        userField.setPreferredSize(new java.awt.Dimension(200, 25));
        background.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 85, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("CONTRASEÑA");
        background.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 350, -1));

        passwordField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordField.setPreferredSize(new java.awt.Dimension(200, 25));
        background.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 140, -1, -1));

        ocupationLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        ocupationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ocupationLabel.setText("OCUPACION");
        background.add(ocupationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 171, 350, -1));

        ocupationField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ocupationField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Docente" }));
        ocupationField.setPreferredSize(new java.awt.Dimension(200, 25));
        background.add(ocupationField, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 192, -1, -1));

        registerButton.setBackground(new java.awt.Color(255, 255, 255));
        registerButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        registerButton.setPreferredSize(new java.awt.Dimension(75, 25));
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });

        registerText.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        registerText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerText.setText("Registrar");
        registerText.setPreferredSize(new java.awt.Dimension(75, 25));

        javax.swing.GroupLayout registerButtonLayout = new javax.swing.GroupLayout(registerButton);
        registerButton.setLayout(registerButtonLayout);
        registerButtonLayout.setHorizontalGroup(
            registerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerButtonLayout.createSequentialGroup()
                .addComponent(registerText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        registerButtonLayout.setVerticalGroup(
            registerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerText, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        background.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 235, -1, -1));

        cancelButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cancelButton.setPreferredSize(new java.awt.Dimension(75, 25));
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
        cancelText.setPreferredSize(new java.awt.Dimension(75, 25));

        javax.swing.GroupLayout cancelButtonLayout = new javax.swing.GroupLayout(cancelButton);
        cancelButton.setLayout(cancelButtonLayout);
        cancelButtonLayout.setHorizontalGroup(
            cancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelButtonLayout.createSequentialGroup()
                .addComponent(cancelText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        cancelButtonLayout.setVerticalGroup(
            cancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelText, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        background.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 235, -1, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/escudo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 272, 350, -1));

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

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        registerButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        registerButton.setBackground(Color.white);
    }//GEN-LAST:event_registerButtonMouseExited

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        cancelButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setBackground(Color.white);
    }//GEN-LAST:event_cancelButtonMouseExited

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        login newWindow1 = new login();
        newWindow1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

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
    private javax.swing.JPanel background;
    private javax.swing.JPanel cancelButton;
    private javax.swing.JLabel cancelText;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> ocupationField;
    private javax.swing.JLabel ocupationLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel registerButton;
    private javax.swing.JLabel registerText;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}