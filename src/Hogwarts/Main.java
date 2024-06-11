package Hogwarts;

public class Main {

    public static void main(String[] args) {

        HogwartsStudent hogwartsStudent1 = new HogwartsStudent("Harry", "Potter", "Gryffindor");
        HogwartsStudent hogwartsStudent2 = new HogwartsStudent("Hermoine", "Granger", "Slytherin");
        HogwartsStudent hogwartsStudent3 = new HogwartsStudent("Ron", "Weasley", "Ravenclaw");

        hogwartsStudent1.addHogwartsStudent(hogwartsStudent1);
        hogwartsStudent1.addHogwartsStudent(hogwartsStudent2);
        hogwartsStudent1.addHogwartsStudent(hogwartsStudent3);

        System.out.println(hogwartsStudent1.getHogwartsStudentList());
        System.out.println(hogwartsStudent1.sortLastName());



    }
}
