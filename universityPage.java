package GUI;

import static GUI.mainMenu.RANK;
import static GUI.mainMenu.SUBRANK;
import static GUI.mainMenu.colleges;
import static GUI.mainMenu.outputRanking;
import static GUI.mainMenu.outputSubRanking;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class universityPage extends javax.swing.JFrame {

    public static String subjects [] = {"Agricultural Sciences", "Arts and Humanities", "Biology and Biochemistry",
                "Chemistry", "Clinical Medicine", "Computer Science", "Economics and Business", "Engineering",
                "Environment/Ecology", "Geoscience", "Immunology", "Material Science", "Mathematics",
                "Microbiology", "Molecular Biology and Genetics", "Neuroscience and Behavior",
                "Pharmacologyand Toxicology", "Physics", "Plant and Animal Science", "Psychiatry/Psychology",
                "Social Science and Public Health", "Space Science"};
    
    public static int rank [] = RANK(colleges);

    public static int subRank [][] = SUBRANK(colleges);
    
    public universityPage() {
        initComponents();
    }
    

    public void close () {
        this.setVisible(false);
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        myUniversities = new javax.swing.JButton();
        universityRanking = new javax.swing.JButton();
        back = new javax.swing.JButton();
        searchUniveristy = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        updateUniRanking = new javax.swing.JMenuItem();
        updateSubRanking = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel1.setText("Univerisity page");

        myUniversities.setFont(new java.awt.Font("Trajan Pro", 1, 13)); // NOI18N
        myUniversities.setText("My Universities");
        myUniversities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myUniversitiesActionPerformed(evt);
            }
        });

        universityRanking.setFont(new java.awt.Font("Trajan Pro", 1, 13)); // NOI18N
        universityRanking.setText("University Ranking");
        universityRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universityRankingActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Trajan Pro", 1, 13)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        searchUniveristy.setFont(new java.awt.Font("Trajan Pro", 1, 13)); // NOI18N
        searchUniveristy.setText("Search Univeristy");
        searchUniveristy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUniveristyActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        updateUniRanking.setText("Update University Ranking");
        updateUniRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUniRankingActionPerformed(evt);
            }
        });
        jMenu1.add(updateUniRanking);

        updateSubRanking.setText("Update Subject Ranking");
        updateSubRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSubRankingActionPerformed(evt);
            }
        });
        jMenu1.add(updateSubRanking);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchUniveristy, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(myUniversities, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(universityRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(myUniversities, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(universityRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchUniveristy, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        mainMenu menu = new mainMenu();
        menu.setVisible(true);
        close();
    }//GEN-LAST:event_backActionPerformed

    private void myUniversitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myUniversitiesActionPerformed
        myUniversities my = new myUniversities();
        my.setVisible(true);
        close();
    }//GEN-LAST:event_myUniversitiesActionPerformed

    private void universityRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universityRankingActionPerformed
        universityRanking ranking = new universityRanking();
        ranking.setVisible(true);
        close();
    }//GEN-LAST:event_universityRankingActionPerformed

    private void searchUniveristyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUniveristyActionPerformed
        searchUniversity search = new searchUniversity();
        search.setVisible(true);
        close();
    }//GEN-LAST:event_searchUniveristyActionPerformed

    private void updateUniRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUniRankingActionPerformed
        JOptionPane.showMessageDialog(rootPane, "WARNING!\nThis process will take around half an hour\n"
                + "Note that this is an annual ranking, thus only need to be updated annually\n"
                + "If there are any error in the program, please re-update this ranking");
        try {
            outputRanking();
        } catch (InterruptedException ex) {
            Logger.getLogger(universityPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateUniRankingActionPerformed

    private void updateSubRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSubRankingActionPerformed
        JOptionPane.showMessageDialog(rootPane, "WARNING!\nThis process will take around an hour\n"
                + "Note that this is an annual ranking, thus only need to be updated annually\n"
                + "If there are any error in the program, please re-update this ranking");
        try {
            outputSubRanking();
        } catch (InterruptedException ex) {
            Logger.getLogger(universityPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateSubRankingActionPerformed

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
            java.util.logging.Logger.getLogger(universityPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(universityPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(universityPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(universityPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new universityPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton myUniversities;
    private javax.swing.JButton searchUniveristy;
    private javax.swing.JButton universityRanking;
    private javax.swing.JMenuItem updateSubRanking;
    private javax.swing.JMenuItem updateUniRanking;
    // End of variables declaration//GEN-END:variables
}