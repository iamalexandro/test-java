package test.View;

import test.Test;

/**
 *
 * @author Nicola Di Candia
 */
public class GUI1 extends javax.swing.JFrame {
    
    GUI2 gui2 = new GUI2();
    Test t = new Test();
    
    public GUI1() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        doo1 = new javax.swing.JLabel();
        doo = new javax.swing.JLabel();
        you = new javax.swing.JLabel();
        know = new javax.swing.JLabel();
        me = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Nicola Test");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        jButton2.setText("Make your Test");
        jButton2.setBorder(null);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 40));

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 80, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/View/think.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        doo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        doo1.setForeground(new java.awt.Color(255, 255, 255));
        doo1.setText("DO");
        getContentPane().add(doo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        doo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        doo.setForeground(new java.awt.Color(255, 255, 255));
        doo.setText("DO");
        getContentPane().add(doo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        you.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        you.setForeground(new java.awt.Color(255, 255, 255));
        you.setText("YOU");
        getContentPane().add(you, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        know.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        know.setForeground(new java.awt.Color(255, 255, 255));
        know.setText("KNOW");
        getContentPane().add(know, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        me.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        me.setForeground(new java.awt.Color(255, 255, 255));
        me.setText("ME ?");
        getContentPane().add(me, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        gui2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
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
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel doo;
    private javax.swing.JLabel doo1;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel know;
    private javax.swing.JLabel me;
    private javax.swing.JLabel you;
    // End of variables declaration//GEN-END:variables
}
