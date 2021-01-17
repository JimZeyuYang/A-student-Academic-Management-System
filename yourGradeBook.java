package GUI;

import static GUI.mainMenu.inputGrade;
import static GUI.mainMenu.num;

public class yourGradeBook extends javax.swing.JFrame {
    
    public static int numClasses = 0;
    
    public yourGradeBook() {
        
        initComponents();
        
        assignments all [] = inputGrade(num);
        int temp = 0;
        double GPA = 0;
        String out = "";
        String gradeOut = "";
        out += all[temp].getCourseName() + "\n\n";
        gradeOut += all[temp].getCourseGrade() + "\n\n";
        GPA += all[temp].getCourseGrade();
        int numClass = 1;
        
        for (int i = 1; i < all.length; i++) {
            if (!all[temp].getCourseName().equals(all[i].getCourseName())) {
                numClass++;
                temp = i;
                out += all[temp].getCourseName() + "\n\n";
                gradeOut += all[temp].getCourseGrade() + "\n\n";
                GPA += all[temp].getCourseGrade();
            }
            
        }
        GPA /= numClass;
        display.setText(out);
        gradeDisplay.setText(gradeOut);
        gpaDisplay.setText(Double.toString(GPA).substring(0, 5));
        numClasses = numClass;
        
    }
    public void close () {
        this.setVisible(false);
        dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        search = new javax.swing.JButton();
        gradeAnalysis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        wut = new javax.swing.JScrollPane();
        gradeDisplay = new javax.swing.JTextArea();
        gpaDisplay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        gradeAnalysis.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        gradeAnalysis.setText("View Grade Analysis");
        gradeAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeAnalysisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel1.setText("Grade Book");

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        gradeDisplay.setColumns(20);
        gradeDisplay.setRows(5);
        gradeDisplay.setSize(new java.awt.Dimension(40, 40));
        wut.setViewportView(gradeDisplay);

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel2.setText("GPA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gradeAnalysis))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(gpaDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gpaDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wut, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        mainMenu menu = new mainMenu();
        menu.setVisible(true);
        close();
    }//GEN-LAST:event_backActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        searchUniversity search = new searchUniversity();
        search.setVisible(true);
        close();
    }//GEN-LAST:event_searchActionPerformed

    private void gradeAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeAnalysisActionPerformed
        gradeAnalysis analysis = new gradeAnalysis();
        analysis.setVisible(true);
        close();
    }//GEN-LAST:event_gradeAnalysisActionPerformed

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
            java.util.logging.Logger.getLogger(yourGradeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yourGradeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yourGradeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yourGradeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yourGradeBook().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextArea display;
    private javax.swing.JTextField gpaDisplay;
    private javax.swing.JButton gradeAnalysis;
    private javax.swing.JTextArea gradeDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JScrollPane wut;
    // End of variables declaration//GEN-END:variables
}
