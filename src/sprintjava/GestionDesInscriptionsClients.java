/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sprintjava;

/**
 *
 * @author Mhamdi Amar
 */
public class GestionDesInscriptionsClients extends javax.swing.JFrame {

    /**
     * Creates new form PropositionRecetteClient
     */
    public GestionDesInscriptionsClients() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jBT_supprimer1 = new javax.swing.JButton();
        jBT_supprimer4 = new javax.swing.JButton();
        jBT_supprimer5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jTable1.setBackground(new java.awt.Color(51, 0, 0));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 102, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Souki", "Mahmoud", "28/11/1990", "Monastir", "Mido", "**********", "mahmoud.souki@esprit.tn", null},
                { new Integer(2), "Bouhachem", "Marwa", "27/06/1991", "Tunis", "Moumou", "*********", "marwa.bouhachem@esprit.tn", null},
                { new Integer(3), "Slama", "Emna", "07/04/1990", "Tunis", "Monmon", "************", "emna.slama@esprit.tn", null}
            },
            new String [] {
                "Id", "Nom", "Prénom", "Date de naissance", "Lieu de naissance", "Pseudo", "Mot de passe", "Email", "Décision"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowHeight(17);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 230, 780, 80);

        jTextField2.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(110, 180, 120, 30);

        jBT_supprimer1.setBackground(new java.awt.Color(51, 0, 0));
        jBT_supprimer1.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jBT_supprimer1.setForeground(new java.awt.Color(255, 102, 0));
        jBT_supprimer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/cherch.png"))); // NOI18N
        jBT_supprimer1.setText("Chercher");
        jBT_supprimer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_supprimer1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBT_supprimer1);
        jBT_supprimer1.setBounds(240, 180, 120, 30);

        jBT_supprimer4.setBackground(new java.awt.Color(51, 0, 0));
        jBT_supprimer4.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jBT_supprimer4.setForeground(new java.awt.Color(255, 102, 0));
        jBT_supprimer4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/deco.jpg"))); // NOI18N
        jBT_supprimer4.setText("Déconnexion");
        jBT_supprimer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_supprimer4ActionPerformed(evt);
            }
        });
        getContentPane().add(jBT_supprimer4);
        jBT_supprimer4.setBounds(640, 20, 140, 30);

        jBT_supprimer5.setBackground(new java.awt.Color(51, 0, 0));
        jBT_supprimer5.setFont(new java.awt.Font("DK Cool Crayon", 1, 12)); // NOI18N
        jBT_supprimer5.setForeground(new java.awt.Color(255, 102, 0));
        jBT_supprimer5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/suppr.PNG"))); // NOI18N
        jBT_supprimer5.setText("Supprimer");
        jBT_supprimer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_supprimer5ActionPerformed(evt);
            }
        });
        getContentPane().add(jBT_supprimer5);
        jBT_supprimer5.setBounds(660, 330, 120, 30);

        jLabel3.setFont(new java.awt.Font("DK Cool Crayon", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestion des inscriptions");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 80, 360, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/bg1.jpg"))); // NOI18N
        jLabel1.setText(" ");
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 800, 600);

        jMenu4.setText("Accueil");
        jMenuBar1.add(jMenu4);

        jMenu1.setText("Gestion des inscriptions");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/client.jpg"))); // NOI18N
        jMenuItem1.setText("Clients");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/chef.jpg"))); // NOI18N
        jMenuItem2.setText("Chefs");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Gestion des propositions");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprintjava/img/recettes.jpg"))); // NOI18N
        jMenuItem3.setText("Liste des propositions");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new GestionDesInscriptionsClients().setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new GestionDesPropositions().setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new GestionDesInscriptionsChefs().setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jBT_supprimer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_supprimer1ActionPerformed
        // TODO add your handling code here:

        /*int rw= jTable_clients.getSelectedRow();
        if(==true){

        } */
    }//GEN-LAST:event_jBT_supprimer1ActionPerformed

    private void jBT_supprimer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_supprimer4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT_supprimer4ActionPerformed

    private void jBT_supprimer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_supprimer5ActionPerformed
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
            java.util.logging.Logger.getLogger(GestionDesInscriptionsClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDesInscriptionsClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDesInscriptionsClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDesInscriptionsClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDesInscriptionsClients().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBT_supprimer1;
    private javax.swing.JButton jBT_supprimer4;
    private javax.swing.JButton jBT_supprimer5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
