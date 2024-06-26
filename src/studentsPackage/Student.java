package studentsPackage;

import mainPackage.*;

public class Student extends Person {

    private int amountOfSubjects;
    private double gradePointAverage;
    private String career;
    private int semester;

    public Student(int amountOfSubjects, double gradePointAverage, String career, int semester, String name, String surname, int age) {
        super(name, surname, age);
        this.amountOfSubjects = amountOfSubjects;
        this.gradePointAverage = gradePointAverage;
        this.career = career;
        this.semester = semester;
    }

    @Override
    public String greet() {
        return super.greet() + "I'm a college student at UIS of " + career + " on my " + semester + " semester. I'm currently learning " + amountOfSubjects + " subjects.";
    }

}
