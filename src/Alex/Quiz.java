package Alex;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/*
  @author Alex MacHugh
 */

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Question> questions;
    private int currentQuestionIndex;

    public Quiz() {
        questions = new ArrayList<>();
        currentQuestionIndex = 0;
        
questions.add(new Question(
    "What is the main goal of SDG 4?",
    List.of("Ensure inclusive and equitable quality education", "Provide free food globally", "Reduce greenhouse gases", "Increase internet speed"),
    "Ensure inclusive and equitable quality education"
));

questions.add(new Question(
    "Which age group does SDG 4 aim to provide universal primary education for?",
    List.of("Children aged 6-12", "Teenagers aged 13-19", "Adults aged 20-30", "Preschoolers aged 3-5"),
    "Children aged 6-12"
));

questions.add(new Question(
    "What is a key target of SDG 4 by 2030?",
    List.of("Ensure all youth achieve literacy and numeracy", "Provide free university education to everyone", "Eliminate poverty worldwide", "Create a global education tax"),
    "Ensure all youth achieve literacy and numeracy"
));

questions.add(new Question(
    "What percentage of children globally are currently out of school, according to SDG 4 data?",
    List.of("10%", "15%", "20%", "25%"),
    "15%"
));

questions.add(new Question(
    "What does 'inclusive education' mean in the context of SDG 4?",
    List.of(
        "Ensuring education is accessible to everyone, regardless of gender, disability, or background",
        "Providing online classes for all students",
        "Teaching only in local languages",
        "Focusing only on science and technology education"
    ),
    "Ensuring education is accessible to everyone, regardless of gender, disability, or background"
));

questions.add(new Question(
    "Which region faces the greatest challenge in achieving SDG 4?",
    List.of("Sub-Saharan Africa", "North America", "Europe", "East Asia"),
    "Sub-Saharan Africa"
));

questions.add(new Question(
    "How does SDG 4 aim to address gender disparities in education?",
    List.of("By promoting equal access to education for girls and boys", "By banning male-only schools", "By creating girls-only universities", "By limiting educational opportunities for men"),
    "By promoting equal access to education for girls and boys"
));

questions.add(new Question(
    "Which of these is a way SDG 4 aims to improve education?",
    List.of("Building more schools", "Training more teachers", "Providing scholarships", "All of the above"),
    "All of the above"
));

questions.add(new Question(
    "What is one benefit of achieving SDG 4?",
    List.of(
        "Improved economic opportunities",
        "Better health outcomes",
        "Reduction in inequality",
        "All of the above"
    ),
    "All of the above"
));

questions.add(new Question(
    "Which international organization leads efforts to achieve SDG 4?",
    List.of("UNESCO", "WHO", "FAO", "UNICEF"),
    "UNESCO"
));

        
    }
    
        //Retrieve the current question
        public Question getCurrentQuestion(){
            return questions.get(currentQuestionIndex);
        }
        
        //check if there are any more questions
        public boolean hasNextQuestion(){
            return currentQuestionIndex < questions.size() -1;
        }
        
        //Move to the next question
        public void moveToNextQuestion(){
            if(hasNextQuestion()){
                currentQuestionIndex++;
            }
        }
    }