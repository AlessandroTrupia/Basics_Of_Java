package College;

/**
 * Questa classe rappresenta uno studente che frequenta il college e ha un nome, un cognome, un ID e un anno accademico.
 * Implementa l'interfaccia `LearningPersonI`, indicando che ha la capacità di studiare a casa.
 */
public class Student extends CollegePerson implements LearningPersonI{

    /** L'anno accademico dello studente */
    public int academicYear;

    /**
     * Costruttore che crea un nuovo oggetto `Student` con il nome, il cognome, l'ID e l'anno accademico specificati.
     * @param name Il nome dello studente.
     * @param surname Il cognome dello studente.
     * @param id L'ID dello studente.
     * @param year L'anno accademico dello studente.
     */
    public Student(String name, String surname, int id, int year){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.academicYear = year;
    }

    /**
     * Implementazione del metodo `studyAtHome` dell'interfaccia `LearningPersonI`.
     * Stampa un messaggio che indica che lo studente sta studiando a casa.
     */
    @Override
    public void studyAtHome() {
        System.out.println(
                "I am a student and I study at home.");
    }
}