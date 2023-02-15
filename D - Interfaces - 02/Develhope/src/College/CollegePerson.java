package College;

/**
 * Questa classe rappresenta una persona che frequenta il college e ha un nome, un cognome e un ID.
 */
public class CollegePerson {

    /** Il nome della persona */
    public String name;

    /** Il cognome della persona */
    public String surname;

    /** L'ID della persona */
    public int id;

    /**
     * Metodo che indica che la persona sta andando al college.
     * Stampa il nome, il cognome e l'ID della persona.
     */
    public void goToCollege(){
        System.out.println("Name: " + name + "\nSurname: " +  surname + "\nNumber of id: " + id);
    }
}