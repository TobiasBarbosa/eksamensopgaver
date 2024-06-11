package Exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ExamQuestion examQuestion1 = new ExamQuestion(1);
    ExamQuestion examQuestion2 = new ExamQuestion(2);
    ExamQuestion examQuestion3 = new ExamQuestion(3);

    examQuestion1.addQuestion(examQuestion1);
    examQuestion1.addQuestion(examQuestion2);
    examQuestion1.addQuestion(examQuestion3);


    try {
    File file = new File("questions.txt");
    PrintStream out = new PrintStream(file);
    out.println(examQuestion1.getExamQuestions().toString());
    } catch(FileNotFoundException fileNotFoundException) {
        fileNotFoundException.printStackTrace();
    }


    }
}
