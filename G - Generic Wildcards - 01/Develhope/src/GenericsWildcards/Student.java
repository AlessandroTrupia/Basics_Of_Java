package GenericsWildcards;

import java.util.List;
/**
 The Student class represents a student with a name, surname, and marks average.
 */
public class Student {
    public String studentName;
    public String studentSurname;
    double marksAverage;

    /**
     Constructs a new Student object with the specified name, surname, and marks average.
     @param studentName the name of the student.
     @param studentSurname the surname of the student.
     @param marksAverage the average of the student's marks.
     */
    public Student(String studentName, String studentSurname, double marksAverage) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.marksAverage = marksAverage;
    }

    /**
     Calculates the average of the marks in the given list.
     @param listOfMarks a list of marks represented as numbers.
     @return the average of the marks in the list.
     */
    public static double getAverageMark(List<? extends Number> listOfMarks) {
        listOfMarks.get(0).doubleValue();
        listOfMarks.get(1).doubleValue();
        return listOfMarks.get(0).doubleValue()+listOfMarks.get(1).doubleValue()/2;
    }

    /**
     Returns a string representation of the student, including their name, surname, and marks average.
     @return a string representation of the student.
     */
    @Override
    public String toString() {
        return "Student details: \n" +
                "studentName = " + studentName + "\n" +
                "studentSurname = '" + studentSurname + "\n" +
                "marksAverage = " + marksAverage;
    }
}
