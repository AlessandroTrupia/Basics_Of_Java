package College;

/**
 * Questa classe rappresenta un professore che lavora al college e ha un nome, un cognome, un ID e una materia insegnata.
 * Implementa l'interfaccia `TeachingPerson`, indicando che ha la capacità di insegnare ad altre persone.
 */
public class Professor extends CollegePerson implements TeachingPerson{

    /** La materia insegnata dal professore */
    public String teachingSubject;

    /**
     * Costruttore che crea un nuovo oggetto `Professor` con il nome, il cognome, l'ID e la materia insegnata specificati.
     * @param name Il nome del professore.
     * @param surname Il cognome del professore.
     * @param id L'ID del professore.
     * @param subject La materia insegnata dal professore.
     */
    public Professor(String name, String surname, int id, String subject){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.teachingSubject = subject;
    }

    /**
     * Implementazione del metodo `teachToOtherPeople` dell'interfaccia `TeachingPerson`.
     * Stampa un messaggio che indica che il professore sta insegnando agli studenti.
     */
    @Override
    public void teachToOtherPeople() {
        System.out.println("I'm the professor and i'm teaching students.");
    }
}