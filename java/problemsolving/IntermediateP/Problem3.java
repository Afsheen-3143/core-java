package IntermediateP;

import java.util.Arrays;
import java.util.List;


import java.util.*;

class Question {
    String question;
    String optionA, optionB, optionC, optionD;
    char correctOption;

    public Question(String question, String optionA, String optionB, String optionC, String optionD, char correctOption) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = Character.toUpperCase(correctOption);
    }

    public void display() {
        System.out.println(question);
        System.out.println("A. " + optionA);
        System.out.println("B. " + optionB);
        System.out.println("C. " + optionC);
        System.out.println("D. " + optionD);
        System.out.print("Your answer (A/B/C/D): ");
    }

    public boolean isCorrect(char userAnswer) {
        return Character.toUpperCase(userAnswer) == correctOption;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> quiz = new ArrayList<>();

        // Add questions to the list
        quiz.add(new Question("What is the capital of India?", "Mumbai", "Chennai", "New Delhi", "Kolkata", 'C'));
        quiz.add(new Question("Which language runs in a web browser?", "Java", "C", "Python", "JavaScript", 'D'));
        quiz.add(new Question("Which company developed Java?", "Microsoft", "Sun Microsystems", "Apple", "Google", 'B'));
        quiz.add(new Question("Which keyword is used to inherit a class in Java?", "this", "super", "extends", "implements", 'C'));
        quiz.add(new Question("Which data structure uses LIFO?", "Queue", "Array", "Stack", "Tree", 'C'));

        int score = 0;

        // Loop through each question
        for (int i = 0; i < quiz.size(); i++) {
            System.out.println("\nQuestion " + (i + 1));
            quiz.get(i).display();
            char userAnswer = sc.next().charAt(0);

            if (quiz.get(i).isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! Correct answer: " + quiz.get(i).correctOption);
            }
        }

        // Result calculation
        int total = quiz.size();
        double percentage = (score * 100.0) / total;
        String result = percentage >= 50 ? "Pass" : "Fail";

        System.out.println("\n--- Quiz Completed ---");
        System.out.println("Score: " + score + "/" + total);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Result: " + result);
    }
}
