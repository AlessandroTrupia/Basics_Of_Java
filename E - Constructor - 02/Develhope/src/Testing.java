/**
 * Provides a main method to test the Student and Teacher classes.
 */
public class Testing {
    public static void main(String[] args) {

        Student student = new Student("Leonard");
        Student student1 = new Student("Tim");

        Teacher teacher = new Teacher();
        teacher.teacherName = "Prof. Martin";

        teacher.assignGrade(student,4);
        teacher.assignGrade(student1,5);

        student.getStudentDetails();
        student1.getStudentDetails();
    }
}
