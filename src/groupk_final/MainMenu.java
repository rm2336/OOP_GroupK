package groupk_final;

import Alex.QuizGUI;
//import Tiernan.Glossary;
import Roko.CalculatorEditor;
import Roko.CalculatorMenu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rokom
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    private CalculatorMenu rokosMenu;
    private QuizGUI alexsMenu;
    //private Glossary tiernansMenu;
    public MainMenu() {
        initComponents();
    }
    
    public void setCalculatorMenu(CalculatorMenu menu) {
        rokosMenu = menu;
    }
    
    public void setQuizMenu(QuizGUI menu) {
        alexsMenu = menu;
    }
    
    //public void setGlossaryMenu(Glossary menu) {
    //    tiernansMenu = menu;
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenuLBL = new javax.swing.JLabel();
        quizBTN = new javax.swing.JButton();
        calculatorBTN = new javax.swing.JButton();
        glossaryBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hintTA = new javax.swing.JTextArea();
        exitBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(235, 233, 233));

        mainMenuLBL.setText("Main Menu");

        quizBTN.setText("Quiz");
        quizBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quizBTNMouseEntered(evt);
            }
        });
        quizBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizBTNActionPerformed(evt);
            }
        });

        calculatorBTN.setText("Calculator");
        calculatorBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculatorBTNMouseEntered(evt);
            }
        });
        calculatorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorBTNActionPerformed(evt);
            }
        });

        glossaryBTN.setText("Glossary");
        glossaryBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                glossaryBTNMouseEntered(evt);
            }
        });
        glossaryBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glossaryBTNActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

        hintTA.setEditable(false);
        hintTA.setColumns(20);
        hintTA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hintTA.setForeground(new java.awt.Color(0, 204, 0));
        hintTA.setLineWrap(true);
        hintTA.setRows(5);
        hintTA.setWrapStyleWord(true);
        hintTA.setAutoscrolls(false);
        jScrollPane1.setViewportView(hintTA);

        exitBTN.setText("Exit");
        exitBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBTNMouseEntered(evt);
            }
        });
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(mainMenuLBL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calculatorBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quizBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(glossaryBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMenuLBL)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quizBTN)
                        .addGap(37, 37, 37)
                        .addComponent(calculatorBTN)
                        .addGap(37, 37, 37)
                        .addComponent(glossaryBTN))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(exitBTN)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quizBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quizBTNMouseEntered
        // TODO add your handling code here:
        hintTA.setText("Pit your wits against the Sustainable Development Goal quiz.");
    }//GEN-LAST:event_quizBTNMouseEntered

    private void calculatorBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculatorBTNMouseEntered
        // TODO add your handling code here:
        hintTA.setText("Calculate the optimal budget to facilitate quality education.");
    }//GEN-LAST:event_calculatorBTNMouseEntered

    private void glossaryBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glossaryBTNMouseEntered
        // TODO add your handling code here:
        hintTA.setText("Learn more about quality education targets and indicators.");
    }//GEN-LAST:event_glossaryBTNMouseEntered

    private void exitBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBTNMouseEntered
        // TODO add your handling code here:
        hintTA.setText("Slán agus beannacht!");
    }//GEN-LAST:event_exitBTNMouseEntered

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void calculatorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorBTNActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        rokosMenu.setVisible(true);
        
    }//GEN-LAST:event_calculatorBTNActionPerformed

    private void quizBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizBTNActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        alexsMenu.setVisible(true);
    }//GEN-LAST:event_quizBTNActionPerformed

    private void glossaryBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glossaryBTNActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        //tiernansMenu.setVisible(true);
    }//GEN-LAST:event_glossaryBTNActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculatorBTN;
    private javax.swing.JButton exitBTN;
    private javax.swing.JButton glossaryBTN;
    private javax.swing.JTextArea hintTA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mainMenuLBL;
    private javax.swing.JButton quizBTN;
    // End of variables declaration//GEN-END:variables
}
