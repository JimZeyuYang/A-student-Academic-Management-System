package GUI;

import static GUI.mainMenu.addMyUni;
import static GUI.mainMenu.colleges;
import static GUI.mainMenu.did;
import static GUI.searchUniversity.position;
import static GUI.universityPage.subjects;
import javax.swing.JOptionPane;

public class universityDetail extends javax.swing.JFrame {

    public universityDetail() {
        initComponents();
        name.setText(colleges[position].getName());
        percent.setText(Integer.toString((int )(Math.random() * 100 + 1)) + "%");
        String out = "";
        out += "Global University Ranking: No." + colleges[position].getRanking()
                + "\n\n" + colleges[position].getLocation() + "\n\nRanking by Subject:\n";
        for (int i = 0; i < subjects.length; i++) {
            if (colleges[position].getSubRank(i) != 9999) {
                out += colleges[position].getSubRank(i) + " ------ "
                    + subjects[i] + "\n";
            }
        }
        display.setText(out);
    }
    
    public void close () {
        this.setVisible(false);
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        seeCurrentGrade = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        addToMyUni = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        percent = new javax.swing.JLabel();
        backToSearch = new javax.swing.JButton();
        backToUniPage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        name.setText("University Details");
        name.setToolTipText("");

        seeCurrentGrade.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        seeCurrentGrade.setText("See Current Grade");
        seeCurrentGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeCurrentGradeActionPerformed(evt);
            }
        });

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        addToMyUni.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        addToMyUni.setText("Add to My Universities");
        addToMyUni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToMyUniActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel2.setText("Your chance of");

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel3.setText("getting in");

        percent.setFont(new java.awt.Font("Trajan Pro", 1, 48)); // NOI18N
        percent.setText("0");

        backToSearch.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        backToSearch.setText("Back to Search");
        backToSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToSearchActionPerformed(evt);
            }
        });

        backToUniPage.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        backToUniPage.setText("Back to University Page");
        backToUniPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToUniPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(name))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(70, 70, 70))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(percent)
                                .addGap(86, 86, 86))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2)
                            .addComponent(addToMyUni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seeCurrentGrade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backToSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backToUniPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addToMyUni, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(seeCurrentGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backToUniPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seeCurrentGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeCurrentGradeActionPerformed
        if (did) {
            yourGradeBook gradeBook = new yourGradeBook();
            gradeBook.setVisible(true);
            close();
        } else {        
            tigerNetLogin loginPage = new tigerNetLogin();
            loginPage.setVisible(true);
            close();
        }
    }//GEN-LAST:event_seeCurrentGradeActionPerformed

    private void addToMyUniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToMyUniActionPerformed
        addMyUni(colleges[position].getName());
        JOptionPane.showMessageDialog(rootPane, "University has been successfully added to your list");
    }//GEN-LAST:event_addToMyUniActionPerformed

    private void backToSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToSearchActionPerformed
        searchUniversity search = new searchUniversity();
        search.setVisible(true);
        close();
    }//GEN-LAST:event_backToSearchActionPerformed

    private void backToUniPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToUniPageActionPerformed
        universityPage university = new universityPage();
        university.setVisible(true);
        close();
    }//GEN-LAST:event_backToUniPageActionPerformed

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
            java.util.logging.Logger.getLogger(universityDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(universityDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(universityDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(universityDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new universityDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToMyUni;
    private javax.swing.JButton backToSearch;
    private javax.swing.JButton backToUniPage;
    private javax.swing.JTextArea display;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel percent;
    private javax.swing.JButton seeCurrentGrade;
    // End of variables declaration//GEN-END:variables
}
