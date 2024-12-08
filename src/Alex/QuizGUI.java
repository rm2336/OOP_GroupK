package Alex;

//import groupk.MainMenu;
import groupk_final.MainMenu;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Alex MacHugh
 */
public class QuizGUI extends javax.swing.JFrame {
    
//    private MainMenu mainMenu;
    private User user;
    private Quiz quiz;
    private Evaluation evaluation; //Evaluate and stores the quiz results
    private MainMenu mainMenu;
    private Question question;
    
    
    
public QuizGUI(Quiz quiz) {
    this.quiz = quiz;
    initComponents(); // Initialize all GUI components
    // Customize scoreLabel properties
    scoreLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14)); // Set font for better visibility
    scoreLabel.setText("Score: 0"); // Initialize text
    scoreLabel.setVisible(true); // Ensure it's visible

    // Display the start panel initially
    mainPanel.removeAll();
    mainPanel.add(startPanel);
    mainPanel.repaint();
    mainPanel.revalidate();
}


public QuizGUI() {
    this.quiz = new Quiz(); // Initialize with a default Quiz object
    initComponents();
}

// Setter for MainMenu
public void setMainMenu(MainMenu mainMenu) {
    this.mainMenu = mainMenu;
    }    

@SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        startPanel = new javax.swing.JPanel();
        userIDField = new javax.swing.JTextField();
        userNameField = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        userIDLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        questionPanel = new javax.swing.JPanel();
        questionLabel = new javax.swing.JLabel();
        optionButton1 = new javax.swing.JRadioButton();
        optionButton2 = new javax.swing.JRadioButton();
        optionButton3 = new javax.swing.JRadioButton();
        optionButton4 = new javax.swing.JRadioButton();
        nextButton = new javax.swing.JButton();
        headerPanel = new javax.swing.JPanel();
        scoreLabel = new javax.swing.JLabel();
        summaryPanel = new javax.swing.JPanel();
        retakeQuizButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        summaryLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setName(""); // NOI18N
        mainPanel.setLayout(new java.awt.CardLayout());

        startPanel.setBackground(new java.awt.Color(235, 233, 233));
        startPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        userIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDFieldActionPerformed(evt);
            }
        });

        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });

        startButton.setText("Start");
        startButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        userIDLabel.setBackground(new java.awt.Color(255, 255, 255));
        userIDLabel.setLabelFor(userIDLabel);
        userIDLabel.setText("User ID:");
        userIDLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userIDLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        userIDLabel.setOpaque(true);

        userNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("User Name:");
        userNameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userNameLabel.setOpaque(true);

        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to the SDG Education Quiz!");

        jLabel2.setText("Test your knowledge of the UN Sustainable Development Goals oneducation");

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2)
                    .addGroup(startPanelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(startPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
        );
        startPanelLayout.setVerticalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel))
                .addGap(31, 31, 31)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBTN)
                .addGap(37, 37, 37))
        );

        mainPanel.add(startPanel, "card2");

        questionPanel.setBackground(javax.swing.UIManager.getDefaults().getColor("Component.warning.borderColor"));

        questionLabel.setBackground(java.awt.Color.white);
        questionLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        questionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionLabel.setText("Question 1");
        questionLabel.setToolTipText("");
        questionLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        questionLabel.setOpaque(true);

        buttonGroup1.add(optionButton1);
        optionButton1.setText("jRadioButton1");
        optionButton1.setOpaque(true);
        optionButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(optionButton2);
        optionButton2.setText("jRadioButton2");
        optionButton2.setOpaque(true);

        buttonGroup1.add(optionButton3);
        optionButton3.setText("jRadioButton3");
        optionButton3.setOpaque(true);

        buttonGroup1.add(optionButton4);
        optionButton4.setText("jRadioButton4");
        optionButton4.setOpaque(true);

        nextButton.setText("Next");
        nextButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        scoreLabel.setText("Score:");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(scoreLabel)
                .addGap(22, 22, 22))
        );

        scoreLabel.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout questionPanelLayout = new javax.swing.GroupLayout(questionPanel);
        questionPanel.setLayout(questionPanelLayout);
        questionPanelLayout.setHorizontalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanelLayout.createSequentialGroup()
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(questionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(questionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(questionPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(questionPanelLayout.createSequentialGroup()
                                    .addComponent(optionButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionPanelLayout.createSequentialGroup()
                                    .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(optionButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(optionButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(82, 82, 82)))
                            .addComponent(optionButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addContainerGap())
        );
        questionPanelLayout.setVerticalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(questionPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(optionButton1)
                        .addGap(12, 12, 12)
                        .addComponent(optionButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(questionPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(questionPanelLayout.createSequentialGroup()
                        .addComponent(optionButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(optionButton4))
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        mainPanel.add(questionPanel, "card3");

        summaryPanel.setBackground(new java.awt.Color(255, 153, 153));
        summaryPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        retakeQuizButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        retakeQuizButton.setText("Retake Quiz");
        retakeQuizButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        retakeQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retakeQuizButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        summaryLabel.setBackground(new java.awt.Color(255, 255, 204));
        summaryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        summaryLabel.setText("Congratulation! ");
        summaryLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        summaryLabel.setOpaque(true);
        jScrollPane2.setViewportView(summaryLabel);

        javax.swing.GroupLayout summaryPanelLayout = new javax.swing.GroupLayout(summaryPanel);
        summaryPanel.setLayout(summaryPanelLayout);
        summaryPanelLayout.setHorizontalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(summaryPanelLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(retakeQuizButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        summaryPanelLayout.setVerticalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retakeQuizButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        mainPanel.add(summaryPanel, "card4");

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);
        mainPanel.getAccessibleContext().setAccessibleName("mainPanel");
        mainPanel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        if (mainMenu != null) {
            this.setVisible(false); // Hide the QuizGUI
            mainMenu.setVisible(true); // Show the MainMenu
        } else {
            System.out.println("MainMenu instance is null. Cannot navigate back.");
        }

    }//GEN-LAST:event_backBTNActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
            //get input from the text field
            String userName = userNameField.getText().trim();
            String userIDText = userIDField.getText().trim();
            
           
            //validate input
            if(userName.isEmpty() || userIDText.isEmpty()){
                JOptionPane.showMessageDialog(this, 
                        "Both User ID and User Name are Required!",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
                      return;
            }
            
            try{
                // Parse User ID as an integer
                int userID = Integer.parseInt(userIDText);
                
                //Create a new user object for storing user's details
                user = new User(userID, userName);
                
                quiz = new Quiz(); // Load Question into the Quiz
                evaluation = new Evaluation(user); // initialize evaluation with the user
                
                // Switch to the Question Panel
                mainPanel.removeAll();
                mainPanel.add(questionPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
                
                //display the first question
                displayCurrentQuestion();
                
            } catch (NumberFormatException e){
                //this is for handling with invalid userID input
                JOptionPane.showMessageDialog(this, "Please enter a valid User ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_startButtonActionPerformed

    //method to display Current Question
    private void displayCurrentQuestion(){
        Question currentQuestion = quiz.getCurrentQuestion();
        
        // Set question text
        questionLabel.setText(currentQuestion.getQuestionText());
        scoreLabel.setText("Score: " + user.getScore());  

        // Set the options for the radio buttons
        optionButton1.setText(currentQuestion.getOptions().get(0));
        optionButton2.setText(currentQuestion.getOptions().get(1));
        optionButton3.setText(currentQuestion.getOptions().get(2));
        optionButton4.setText(currentQuestion.getOptions().get(3));
    }
    
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
    Question currentQuestion = quiz.getCurrentQuestion();
    String selectedAnswer = getSelectedAnswer();
    
    //check if an answer is selected
    if(selectedAnswer.isEmpty()){
        JOptionPane.showMessageDialog(this, "Please select an answer.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    evaluation.evaluateAnswer(currentQuestion, selectedAnswer);
    if (currentQuestion.checkAnswer(selectedAnswer)) {
        user.incrementScore();
        System.out.println("Correct! Score updated: " + user.getScore());
    } else {
        System.out.println("Wrong! Score remains: " + user.getScore());
    }

    updateScoreLabel();    // Update the score label

    //move to the next question or finish the quiz
    if(quiz.hasNextQuestion()){
        quiz.moveToNextQuestion();
        displayCurrentQuestion();
    } else {
        mainPanel.removeAll(); // Remove current panel components
        mainPanel.add(summaryPanel); // Add the summary panel
        mainPanel.repaint(); // Refresh the panel
        mainPanel.revalidate(); // Revalidate the layout to display changes
    
        displaySummary();
    }
    }//GEN-LAST:event_nextButtonActionPerformed

private void updateScoreLabel() {
    // Update the score label only once
    scoreLabel.setText("Score: " + user.getScore());
}


   
    private String getSelectedAnswer() {
        if (optionButton1.isSelected()) {
            return optionButton1.getText();
        } else if (optionButton2.isSelected()) {
            return optionButton2.getText();
        } else if (optionButton3.isSelected()) {
            return optionButton3.getText();
        } else if (optionButton4.isSelected()) {
            return optionButton4.getText();
        }
        return "";  // Return empty if no option is selected
    }
    
    private void displaySummary() {
    String summary = evaluation.getSummary();  // Retrieve feedback from Evaluation class
    summary += "Final Score: " + user.getScore(); // Add score to the summary
    summaryLabel.setText("<html>" + summary.replaceAll("\n", "<br>") + "</html>");  // Display the summary in the summary panel
}
    
    private void userIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDFieldActionPerformed

    private void optionButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionButton1ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

        this.setVisible(false);
        mainMenu.setVisible(true);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void retakeQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retakeQuizButtonActionPerformed
        // TODO add your handling code here:
        // Navigate back to the start panel
        mainPanel.removeAll(); // Remove current panel components
        mainPanel.add(startPanel); // Add the start panel
        mainPanel.repaint(); // Refresh the panel
        mainPanel.revalidate(); // Revalidate the layout to display changes

    }//GEN-LAST:event_retakeQuizButtonActionPerformed

public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainMenu mainMenu = new MainMenu(); // Create the MainMenu
                Quiz quiz = new Quiz(); // Create the Quiz

                QuizGUI quizGUI = new QuizGUI(quiz); // Pass the Quiz to QuizGUI
                quizGUI.setMainMenu(mainMenu); // Pass the MainMenu to QuizGUI

                mainMenu.setVisible(true); // Show the MainMenu by default
            }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JRadioButton optionButton1;
    private javax.swing.JRadioButton optionButton2;
    private javax.swing.JRadioButton optionButton3;
    private javax.swing.JRadioButton optionButton4;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JButton retakeQuizButton;
    public javax.swing.JLabel scoreLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JPanel startPanel;
    private javax.swing.JLabel summaryLabel;
    private javax.swing.JPanel summaryPanel;
    private javax.swing.JTextField userIDField;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
