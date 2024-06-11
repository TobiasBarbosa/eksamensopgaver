package Exam;

import java.util.ArrayList;
import java.util.Random;

public class ExamQuestion {
    private int number;
    private Grade grade;
    ArrayList<ExamQuestion> examQuestions = new ArrayList<>();

    Random random = new Random();

    public ExamQuestion(int number){
        this.number = number;
        grade = randomGrade();
    }

    public Grade randomGrade(){
        int gradeNumber = random.nextInt(6);
        return Grade.values()[gradeNumber];
    }

    public void addQuestion(ExamQuestion examQuestion) {
        if (examQuestions.size() < 14) {
            examQuestions.add(examQuestion);
        } else {
            throw new IllegalArgumentException("There can maximum be 14 exam questions");
        }
    }

    public ArrayList<ExamQuestion> getExamQuestions(){
        return examQuestions;
    }

    @Override
    public String toString(){
        return "Question number " + number + "\nGrade: " + randomGrade() + "\n";
    }


}
