package Pack;

import javax.swing.ImageIcon;

public class Welcompage extends javax.swing.JFrame {

    public Welcompage() {
        initComponents();
        jLabel2.setIcon(new ImageIcon("src\\pics\\picPage.jpg"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        PictureButton = new javax.swing.JButton();
        MovieButton = new javax.swing.JButton();
        SoundButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PictureButton.setFont(new java.awt.Font("Franklin Gothic Book", 2, 24)); // NOI18N
        PictureButton.setForeground(new java.awt.Color(0, 51, 102));
        PictureButton.setText("Picture");
        PictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PictureButtonActionPerformed(evt);
            }
        });
        jPanel3.add(PictureButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 180, 50));

        MovieButton.setFont(new java.awt.Font("Franklin Gothic Book", 2, 24)); // NOI18N
        MovieButton.setForeground(new java.awt.Color(0, 51, 102));
        MovieButton.setText("Movie");
        MovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovieButtonActionPerformed(evt);
            }
        });
        jPanel3.add(MovieButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 180, 50));

        SoundButton.setFont(new java.awt.Font("Franklin Gothic Book", 2, 24)); // NOI18N
        SoundButton.setForeground(new java.awt.Color(0, 51, 102));
        SoundButton.setText("Sound");
        SoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoundButtonActionPerformed(evt);
            }
        });
        jPanel3.add(SoundButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 180, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME TO MEDIA CLOUD PROJECT");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Please choose to start:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Jaylan Alotaibi 1907030          Elaf Aloufi 1911265          Manar Altaiary 1906775       ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, -1, -1));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PictureButtonActionPerformed
        // TODO add your handling code here:
        PicturesForm p = new PicturesForm();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_PictureButtonActionPerformed

    private void MovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovieButtonActionPerformed
        // TODO add your handling code here:
        MovieForm m = new MovieForm();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_MovieButtonActionPerformed

    private void SoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoundButtonActionPerformed
        // TODO add your handling code here:
        SoundForm s = new SoundForm();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_SoundButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Welcompage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcompage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcompage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcompage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcompage().setVisible(true);
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MovieButton;
    private javax.swing.JButton PictureButton;
    private javax.swing.JButton SoundButton;
    private javax.swing.JLabel jLabel1;
    static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
