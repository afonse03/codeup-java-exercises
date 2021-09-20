package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int count = 0;
        double totalGrade = 0;
        for (int grade : grades) {
            totalGrade += grade;
            count++;
        }
        return totalGrade / count;
    }

    public static void main(String[] args) {
        Student amanda = new Student("Amanda");

        amanda.addGrade(100);
        amanda.addGrade(70);
        amanda.addGrade(45);
        amanda.addGrade(90);

        System.out.println(amanda.getGradeAverage());
//        System.out.printf("The student %s has a grade average of %.2f " + student.getName(), student.getGradeAverage());

    }

}
