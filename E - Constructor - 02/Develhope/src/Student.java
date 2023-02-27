/**
 * The `Student` class represents a student object with a name and a grade.
 */
public class Student {

    /**
     * The name of the student.
     */
    public String name;

    /**
     * The grade of the student.
     */
    public int grade;

    /**
     * Creates a new `Student` object with the given name.
     * @param studentName the name of the student
     */
    public Student(String studentName) {
        System.out.println("Creation of object Student");
        this.name = studentName;
    }

    /**
     * Prints the details of the student to the console.
     */
    public void getStudentDetails(){

        System.out.println("\nStudent name: " + name + " \nStudent grade: " + grade);
    }
}
