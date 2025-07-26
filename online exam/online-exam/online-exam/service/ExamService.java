package service;

import util.MCQBank;
import java.util.*;

public class ExamService {
    private Scanner sc = new Scanner(System.in);
    private int score = 0;

    public void startExam() {
        Map<String, String> questions = MCQBank.getQuestions();
        Timer timer = new Timer();
        System.out.println("Exam started. You have 30 seconds.");

        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("\nTime's up! Auto-submitting your exam.");
                System.exit(0);
            }
        }, 30000); // 30 seconds

        for (Map.Entry<String, String> q : questions.entrySet()) {
            System.out.println(q.getKey());
            System.out.print("Your Answer (A/B/C): ");
            String ans = sc.nextLine().toUpperCase();
            if (ans.equals(q.getValue())) score++;
        }

        timer.cancel();
        System.out.println("Exam submitted. Your score is: " + score + "/" + questions.size());
    }
}