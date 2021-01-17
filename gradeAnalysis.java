package GUI;

import static GUI.mainMenu.inputGrade;
import static GUI.yourGradeBook.numClasses;
import static GUI.mainMenu.num;
import javax.swing.JOptionPane;

public class gradeAnalysis extends javax.swing.JFrame {
    
    public static String classes [] = new String [numClasses];
    public static assignments all [] = inputGrade(num);

    public gradeAnalysis() {
        initComponents();
        
        int temp = 0;
        classes[temp] = all[temp].getCourseName();
        int count = 0;
        
        for (int i = 1; i < all.length; i++) {
            if (!all[temp].getCourseName().equals(all[i].getCourseName())) {
                count++;
                temp = i;
                classes[count] = all[temp].getCourseName();
            }
        }

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(classes));
        
        String out = "";
        String categoryGrade = "";
        String assignmentName = "";
        String assignmentMark = "";
        String assignmentAssign = "";
        String assignmentDue = "";
        for (int i = 0; i < all.length; i++) {
            if (all[i].getCourseName().equals(combo.getSelectedItem())) {
                out += all[i].getCategoryName() + "sep";
                categoryGrade += all[i].getCategoryGrade() + "sep";
                assignmentName += all[i].getAssignmentName() + "sep";
                assignmentMark += all[i].getAssignmentGrade() + "sep";
                assignmentAssign += all[i].getDateAssigned() + "sep";
                assignmentDue += all[i].getDateDue() + "sep";
            }
        }
        
        String category [] = out.split("sep");
        String assignName [] = assignmentName.split("sep");
        String assignMark [] = assignmentMark.split("sep");
        String assignAssign [] = assignmentAssign.split("sep");
        String assignDue [] = assignmentDue.split("sep");
        String cateGrade [] = categoryGrade.split("sep");
        int tem = 0;
        int num = 0;
        String good = category[tem];
        String bad = category[tem];
        double big = Double.parseDouble(cateGrade[tem]);
        double small = Double.parseDouble(cateGrade[tem]);
        out = category[tem] + "            " + cateGrade[tem] + "\n      " 
                + assignName[tem] + "\n             "
                + assignMark[tem] + "%\n             Date Assigned: "
                + assignAssign[tem] + "\n             Date Due: "
                + assignDue[tem];;
        for (int i = 1; i < category.length; i++) {
            if (!category[tem].equals(category[i])) {
                num++;
                tem = i;
                out += "\n\n" + category[tem] + "            " + cateGrade[tem];
                if (big < Double.parseDouble(cateGrade[tem])) {
                    big = Double.parseDouble(cateGrade[tem]);
                    good = category[tem];
                } else if (small > Double.parseDouble(cateGrade[tem])) {
                    small = Double.parseDouble(cateGrade[tem]);
                    bad = category[tem];
                }
                
            }
            out += "\n      " + assignName[i] + "\n             "
                    + assignMark[i] + "%\n             Date Assigned: "
                    + assignAssign[i] + "\n             Date Due: "
                    + assignDue[i];
            
        }
        display.setText(out);
        display.setCaretPosition(0);
//        JOptionPane.showMessageDialog(rootPane, "Report\n\nThe best category is " + good
//                + " -- " + big + "%\nMaintain your hard work!\n\nThe worst category is " +
//                bad + " -- " + small + "%\nNeeds some improvements");
    }
    
    public void close () {
        this.setVisible(false);
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        combo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(213, 242, 242));

        back.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        back.setText("Back");
        back.setToolTipText("");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel1.setText("Grade Analysis");

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        yourGradeBook gradeBook = new yourGradeBook();
        gradeBook.setVisible(true);
        close();
    }//GEN-LAST:event_backActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        String out = "";
        String categoryGrade = "";
        String assignmentName = "";
        String assignmentMark = "";
        String assignmentAssign = "";
        String assignmentDue = "";
        for (int i = 0; i < all.length; i++) {
            if (all[i].getCourseName().equals(combo.getSelectedItem())) {
                out += all[i].getCategoryName() + "sep";
                categoryGrade += all[i].getCategoryGrade() + "sep";
                assignmentName += all[i].getAssignmentName() + "sep";
                assignmentMark += all[i].getAssignmentGrade() + "sep";
                assignmentAssign += all[i].getDateAssigned() + "sep";
                assignmentDue += all[i].getDateDue() + "sep";
            }
        }
        
        String category [] = out.split("sep");
        String assignName [] = assignmentName.split("sep");
        String assignMark [] = assignmentMark.split("sep");
        String assignAssign [] = assignmentAssign.split("sep");
        String assignDue [] = assignmentDue.split("sep");
        String cateGrade [] = categoryGrade.split("sep");
        int tem = 0;
        int num = 0;
        String good = category[tem];
        String bad = category[tem];
        double big = Double.parseDouble(cateGrade[tem]);
        double small = Double.parseDouble(cateGrade[tem]);
        out = category[tem] + "            " + cateGrade[tem] + "\n      " 
                + assignName[tem] + "\n             "
                + assignMark[tem] + "%\n             Date Assigned: "
                + assignAssign[tem] + "\n             Date Due: "
                + assignDue[tem];;
        for (int i = 1; i < category.length; i++) {
            if (!category[tem].equals(category[i])) {
                num++;
                tem = i;
                out += "\n\n" + category[tem] + "            " + cateGrade[tem];
                if (big < Double.parseDouble(cateGrade[tem])) {
                    big = Double.parseDouble(cateGrade[tem]);
                    good = category[tem];
                } else if (small > Double.parseDouble(cateGrade[tem])) {
                    small = Double.parseDouble(cateGrade[tem]);
                    bad = category[tem];
                }
                
            }
            out += "\n      " + assignName[i] + "\n             "
                    + assignMark[i] + "%\n             Date Assigned: "
                    + assignAssign[i] + "\n             Date Due: "
                    + assignDue[i];
            
        }
        display.setText(out);
        display.setCaretPosition(0);
        JOptionPane.showMessageDialog(rootPane, "Report\n\nThe best category is " + good
                + " -- " + big + "%\nMaintain your hard work!\n\nThe worst category is " +
                bad + " -- " + small + "%\nNeeds some improvements");
    }//GEN-LAST:event_comboActionPerformed

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
            java.util.logging.Logger.getLogger(gradeAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradeAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradeAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradeAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradeAnalysis().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextArea display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
