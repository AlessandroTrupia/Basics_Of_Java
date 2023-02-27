/**
 * Represents a teacher with a name.
 */
public class Teacher {

    /**
     * The name of the teacher.
     */
    public String teacherName;

    /**
     * Creates a new Teacher object.
     */
    public Teacher() {
        System.out.println("Creation of object Teacher");
    }

    /**
     * Assigns a grade to the given student.
     *
     * @param alum the student to assign the grade to
     * @param finalGrade the grade to assign to the student
     * @return the grade assigned to the student
     */
    public int assignGrade(Student alum, int finalGrade){

        return alum.grade = finalGrade;
    }
}
