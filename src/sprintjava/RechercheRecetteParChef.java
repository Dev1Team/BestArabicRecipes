/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sprintjava;

/**
 *
 * @author Mhamdi Amar
 */
public class RechercheRecetteParChef extends javax.swing.JFrame {

    /**
     * Creates new form PropositionRecetteClient
     */
    public RechercheRecetteParChef() {
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

        jBT_supprimer5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jBT_supprimer3 = new javax.swing.JButton();
        jBT_supprimer10 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jBT_supprimer5.setBackground(new java.awt.Color(51, 0, 0));
        jBT_supprimer5.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jBT_supprimer5.setForeground(new java.awt.Color(255, 102, 0));
        jBT_supprimer5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/deco.jpg"))); // NOI18N
        jBT_supprimer5.setText("Déconnexion");
        jBT_supprimer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_supprimer5ActionPerformed(evt);
            }
        });
        getContentPane().add(jBT_supprimer5);
        jBT_supprimer5.setBounds(640, 20, 140, 30);

        jLabel7.setFont(new java.awt.Font("DK Cool Crayon", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Nom");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 140, 171, 22);

        jLabel8.setFont(new java.awt.Font("DK Cool Crayon", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("Catégorie ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 180, 171, 22);

        jLabel9.setFont(new java.awt.Font("DK Cool Crayon", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("Pays ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 220, 171, 22);

        jTextField2.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(380, 140, 220, 30);

        jComboBox1.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Recettes Fricko", "SOUPE", "Autorités", "Boulangerie", "Plat principal", "Recettes courts", "Bonbons", "Les plats d'accompagnement", "Macaroni", "Boissons", "Chocolat", "Bonbons", "Viande", "Volailles et les oiseaux", "Poissons et crustacés" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(380, 180, 140, 30);

        jComboBox2.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arabie saoudite", "Bahreïn", "Émirats arabes unis", "Irak", "Jordanie", "Koweït", "Liban", "Oman", "Palestine", "Qatar", "Syrie", "Yémen", "Algérie", "Égypte", "Libye", "Maroc", "Soudan", " Tunisie" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(380, 220, 140, 30);

        jBT_supprimer3.setBackground(new java.awt.Color(51, 0, 0));
        jBT_supprimer3.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jBT_supprimer3.setForeground(new java.awt.Color(255, 102, 0));
        jBT_supprimer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/ajoute.png"))); // NOI18N
        jBT_supprimer3.setText("Valider");
        jBT_supprimer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_supprimer3ActionPerformed(evt);
            }
        });
        getContentPane().add(jBT_supprimer3);
        jBT_supprimer3.setBounds(510, 270, 110, 30);

        jBT_supprimer10.setBackground(new java.awt.Color(51, 0, 0));
        jBT_supprimer10.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jBT_supprimer10.setForeground(new java.awt.Color(255, 102, 0));
        jBT_supprimer10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/suppr.PNG"))); // NOI18N
        jBT_supprimer10.setText("Annuler");
        jBT_supprimer10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_supprimer10ActionPerformed(evt);
            }
        });
        getContentPane().add(jBT_supprimer10);
        jBT_supprimer10.setBounds(630, 270, 110, 30);

        jLabel10.setFont(new java.awt.Font("DK Cool Crayon", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Chercher recette");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(230, 80, 360, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/bg1.jpg"))); // NOI18N
        jLabel1.setText(" ");
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 800, 600);

        jMenu4.setText("Accueil");
        jMenuBar1.add(jMenu4);

        jMenu1.setText("Chercher ");

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

        jMenu3.setText("Deposer Recette");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new RechercheRecetteParChef().setVisible(true); 
        setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new RechercheChefParClient().setVisible(true); 
        setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jBT_supprimer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_supprimer5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT_supprimer5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jBT_supprimer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_supprimer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT_supprimer3ActionPerformed

    private void jBT_supprimer10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_supprimer10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT_supprimer10ActionPerformed

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
            java.util.logging.Logger.getLogger(RechercheRecetteParChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RechercheRecetteParChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RechercheRecetteParChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RechercheRecetteParChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RechercheRecetteParChef().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBT_supprimer10;
    private javax.swing.JButton jBT_supprimer3;
    private javax.swing.JButton jBT_supprimer5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
