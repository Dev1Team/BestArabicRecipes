/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sprintjava;


/**
 *
 * @author Mhamdi Amar
 */
public class Accueil extends javax.swing.JFrame {

    /**
     * Creates new form PropositionRecetteClient
     */
    public Accueil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBT_supprimer5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("DK Cool Crayon", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bienvenue dans Best Arabic Recipes");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 20, 490, 100);

        jLabel2.setFont(new java.awt.Font("DK Cool Crayon", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("pour se connecter cliquez ici :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 180, 280, 50);

        jBT_supprimer5.setBackground(new java.awt.Color(51, 0, 0));
        jBT_supprimer5.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jBT_supprimer5.setForeground(new java.awt.Color(255, 102, 0));
        jBT_supprimer5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/deco.jpg"))); // NOI18N
        jBT_supprimer5.setText("Connexion");
        jBT_supprimer5.setToolTipText("");
        jBT_supprimer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_supprimer5ActionPerformed(evt);
            }
        });
        getContentPane().add(jBT_supprimer5);
        jBT_supprimer5.setBounds(450, 190, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/bg1.jpg"))); // NOI18N
        jLabel1.setText(" ");
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 800, 600);

        jMenu1.setText("Chercher");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/rec.jpg"))); // NOI18N
        jMenuItem1.setText("Recette");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/chef.jpg"))); // NOI18N
        jMenuItem2.setText("Chef");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Proposer recette");
        jMenuBar1.add(jMenu4);

        jMenu3.setText("Evaluation");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new RechercheRecetteParClient().setVisible(true); 
        setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new RechercheChefParClient().setVisible(true); 
        setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jBT_supprimer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_supprimer5ActionPerformed
       new Authentification().setVisible(true); 
        setVisible(false);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT_supprimer5ActionPerformed

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBT_supprimer5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
