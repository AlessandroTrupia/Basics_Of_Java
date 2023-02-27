package GenericsWildcards;

import java.util.ArrayList;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        List<Double> individualMarksListLisa  = new ArrayList<>();
        individualMarksListLisa.add(10.5);
        individualMarksListLisa.add(7.5);

        List<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(10);
        projectMarksListJeremy.add(5);

        System.out.println("Lisa mark average: " + Student.getAverageMark(individualMarksListLisa));
        System.out.println("Mark mark average: " + Student.getAverageMark(projectMarksListJeremy));


        List<Student> listOfStudents = new ArrayList();
        Student lisa = new Student(
                "Lisa",
                "Watson",
                14.25);

        Student mark = new Student(
                "Mark",
                "Smith",
                12.5);

        listOfStudents.add(lisa);
        listOfStudents.add(mark);

        System.out.println();
        System.out.println(listOfStudents.get(0));
        System.out.println();
        System.out.println(listOfStudents.get(1));
    }
}
