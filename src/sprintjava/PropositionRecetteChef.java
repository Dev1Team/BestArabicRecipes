/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sprintjava;

/**
 *
 * @author Mhamdi Amar
 */
public class PropositionRecetteChef extends javax.swing.JFrame {

    /**
     * Creates new form PropositionRecetteClient
     */
    public PropositionRecetteChef() {
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField5 = new javax.swing.JTextField();
        jBT_supprimer5 = new javax.swing.JButton();
        jBT_supprimer2 = new javax.swing.JButton();
        jBT_supprimer9 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 400, 100, 70);

        jLabel9.setFont(new java.awt.Font("DK Cool Crayon", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("Nom Recette");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 140, 171, 22);

        jLabel10.setFont(new java.awt.Font("DK Cool Crayon", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("Origine ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(260, 180, 171, 22);

        jLabel11.setFont(new java.awt.Font("DK Cool Crayon", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("Catégorie ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(260, 220, 171, 22);

        jLabel12.setFont(new java.awt.Font("DK Cool Crayon", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setText("Ingrédients ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(260, 260, 171, 22);

        jLabel13.setFont(new java.awt.Font("DK Cool Crayon", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setText("Preparation");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(260, 300, 171, 22);

        jLabel14.setFont(new java.awt.Font("DK Cool Crayon", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("Photo");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(260, 400, 171, 22);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(420, 300, 230, 80);

        jTextField4.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jTextField4.setText(" ");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(420, 260, 230, 30);

        jComboBox3.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Recettes Fricko", "SOUPE", "Autorités", "Boulangerie", "Plat principal", "Recettes courts", "Bonbons", "Les plats d'accompagnement", "Macaroni", "Boissons", "Chocolat", "Bonbons", "Viande", "Volailles et les oiseaux", "Poissons et crustacés" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(420, 220, 140, 30);

        jComboBox4.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arabie saoudite", "Bahreïn", "Émirats arabes unis", "l'Irak", "la Jordanie", "Koweït", "Liban", "Oman", "la Palestine", "Qatar", "la Syrie", "Yémen", "l'Algérie", "l'Égypte", "la Libye", "Maroc", "Soudan", "la Tunisie" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(420, 180, 140, 30);

        jTextField5.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(420, 140, 220, 30);

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

        jBT_supprimer2.setBackground(new java.awt.Color(51, 0, 0));
        jBT_supprimer2.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jBT_supprimer2.setForeground(new java.awt.Color(255, 102, 0));
        jBT_supprimer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/ajoute.png"))); // NOI18N
        jBT_supprimer2.setText("Ajouter");
        jBT_supprimer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_supprimer2ActionPerformed(evt);
            }
        });
        getContentPane().add(jBT_supprimer2);
        jBT_supprimer2.setBounds(510, 480, 110, 30);

        jBT_supprimer9.setBackground(new java.awt.Color(51, 0, 0));
        jBT_supprimer9.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jBT_supprimer9.setForeground(new java.awt.Color(255, 102, 0));
        jBT_supprimer9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/suppr.PNG"))); // NOI18N
        jBT_supprimer9.setText("Annuler");
        jBT_supprimer9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_supprimer9ActionPerformed(evt);
            }
        });
        getContentPane().add(jBT_supprimer9);
        jBT_supprimer9.setBounds(640, 480, 110, 30);

        jLabel15.setFont(new java.awt.Font("DK Cool Crayon", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Proposer recette");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(230, 80, 360, 30);

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
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Proposer Recette");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jBT_supprimer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_supprimer5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT_supprimer5ActionPerformed

    private void jBT_supprimer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_supprimer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT_supprimer2ActionPerformed

    private void jBT_supprimer9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_supprimer9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT_supprimer9ActionPerformed

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
            java.util.logging.Logger.getLogger(PropositionRecetteChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PropositionRecetteChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PropositionRecetteChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PropositionRecetteChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PropositionRecetteChef().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBT_supprimer2;
    private javax.swing.JButton jBT_supprimer5;
    private javax.swing.JButton jBT_supprimer9;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
