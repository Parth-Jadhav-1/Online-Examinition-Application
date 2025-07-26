package util;

import java.util.*;

public class MCQBank {
    public static Map<String, String> getQuestions() {
        Map<String, String> questions = new LinkedHashMap<>();
        questions.put("What is the capital of India?\nA. Mumbai\nB. Delhi\nC. Kolkata", "B");
        questions.put("2 + 2 equals to?\nA. 3\nB. 4\nC. 5", "B");
        questions.put("Java is?\nA. Language\nB. Coffee\nC. Both", "C");
        return questions;
    }
}