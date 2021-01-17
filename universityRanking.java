package GUI;

import static GUI.mainMenu.colleges;
import static GUI.universityPage.rank;
import static GUI.universityPage.subRank;
import static GUI.universityPage.subjects;


public class universityRanking extends javax.swing.JFrame {

    boolean show;
    
    public universityRanking() {
        initComponents();
        slider.setValue(0);
        slider.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        search = new javax.swing.JButton();
        viewMyUni = new javax.swing.JButton();
        display = new javax.swing.JScrollPane();
        rankingDisplay = new javax.swing.JTextArea();
        slider = new javax.swing.JSlider();
        showRank = new javax.swing.JButton();
        showSubRanking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel1.setText("University Ranking");

        back.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        search.setText("Search for Detail");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        viewMyUni.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        viewMyUni.setText("View My Universities");
        viewMyUni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMyUniActionPerformed(evt);
            }
        });

        rankingDisplay.setColumns(20);
        rankingDisplay.setRows(5);
        display.setViewportView(rankingDisplay);

        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        showRank.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        showRank.setText("University Ranking");
        showRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRankActionPerformed(evt);
            }
        });

        showSubRanking.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        showSubRanking.setText("Ranking by Subject");
        showSubRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSubRankingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewMyUni, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(search, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showRank, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(showSubRanking, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(34, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showRank, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(showSubRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewMyUni, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        universityPage university = new universityPage();
        university.setVisible(true);
        close();
    }//GEN-LAST:event_backActionPerformed

    private void showSubRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSubRankingActionPerformed
        slider.setEnabled(true);
        slider.setMinimum(0);
        slider.setMaximum(subjects.length-1);
        show = true;
        String out = subjects[slider.getValue()] + "\n\n";
        for (int i = 0; i < subRank[0].length; i++) {
            out += (i+1) + "    " + colleges[subRank[slider.getValue()][i]].getName() + "\n";
        }
        rankingDisplay.setText(out);
        rankingDisplay.setCaretPosition(0);
    }//GEN-LAST:event_showSubRankingActionPerformed

    private void showRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRankActionPerformed
        slider.setEnabled(false);
        show = false;
        String out = "";
        for (int i = 0; i < rank.length; i++) {
            out += (i+1) + "    " + colleges[rank[i]].getName() + "\n";
        }
        rankingDisplay.setText(out);
        rankingDisplay.setCaretPosition(0);
        
    }//GEN-LAST:event_showRankActionPerformed

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        if (show) {
            String out = subjects[slider.getValue()] + "\n\n";
            for (int i = 0; i < subRank[0].length; i++) {
                out += (i+1) + "    " + colleges[subRank[slider.getValue()][i]].getName() + "\n";
            }
            
            rankingDisplay.setText(out);
            rankingDisplay.setCaretPosition(0);
        }
        
    }//GEN-LAST:event_sliderStateChanged

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        searchUniversity search = new searchUniversity();
        search.setVisible(true);
        close();
    }//GEN-LAST:event_searchActionPerformed

    private void viewMyUniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMyUniActionPerformed
        myUniversities my = new myUniversities();
        my.setVisible(true);
        close();
    }//GEN-LAST:event_viewMyUniActionPerformed

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
            java.util.logging.Logger.getLogger(universityRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(universityRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(universityRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(universityRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new universityRanking().setVisible(true);
            }
        });
    }
    
    public void close () {
        this.setVisible(false);
        dispose();
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JScrollPane display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea rankingDisplay;
    private javax.swing.JButton search;
    private javax.swing.JButton showRank;
    private javax.swing.JButton showSubRanking;
    private javax.swing.JSlider slider;
    private javax.swing.JButton viewMyUni;
    // End of variables declaration//GEN-END:variables
}
