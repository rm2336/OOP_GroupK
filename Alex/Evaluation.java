package Alex;

import java.util.ArrayList;
import java.util.List;

public class Evaluation {
    private User user;
    private List<Question> questions;  // List of questions
    private List<String> userAnswers;  // List of user's answers
    private int correctAnswersCount;   // Count of correct answers

    public Evaluation(User user) {
        this.user = user;
        this.questions = new ArrayList<>();
        this.userAnswers = new ArrayList<>();
        this.correctAnswersCount = 0;
    }

    // Add a question and user's answer for evaluation
    public void evaluateAnswer(Question question, String userAnswer) {
        questions.add(question);
        userAnswers.add(userAnswer);

        // Check if the user's answer is correct
        if (question.checkAnswer(userAnswer)) {
            correctAnswersCount++;
        }
    }

    // Generate a summary of the user's performance
public String getSummary() {
    StringBuilder summary = new StringBuilder();

    // Add user details
    summary.append("User: ").append(user.getUserName()).append("\n");
    summary.append("ID: ").append(user.getUserID()).append("\n\n");

    // Add results
    summary.append("Quiz Results:\n");
    summary.append("Correct Answers: ").append(correctAnswersCount).append("\n");
    summary.append("Total Questions: ").append(questions.size()).append("\n");
    summary.append("Score: ").append(getScorePercentage()).append("%\n\n");

    // Add feedback for each question
    summary.append("Detailed Feedback:\n");
    for (int i = 0; i < questions.size(); i++) {
        Question question = questions.get(i);
        String userAnswer = userAnswers.get(i);
        String correctAnswer = question.getCorrectAnswer();

        summary.append("Q").append(i + 1).append(": ").append(question.getQuestionText()).append("\n");
        summary.append("Your Answer: ").append(userAnswer).append("\n");
        summary.append("Correct Answer: ").append(correctAnswer).append("\n");
        summary.append(userAnswer.equals(correctAnswer) ? "Correct!" : "Incorrect!").append("\n\n");
    }

    return summary.toString();
}


    // Calculate the user's score as a percentage
    private double getScorePercentage() {
        return (double) correctAnswersCount / questions.size() * 100;
    }
}
