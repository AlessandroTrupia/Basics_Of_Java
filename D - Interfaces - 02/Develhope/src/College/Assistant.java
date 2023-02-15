package College;

/**
 * Questa classe rappresenta un assistente che lavora al college e ha un nome, un cognome, un ID e uno stato che indica se sta cercando di diventare un dottorato di ricerca.
 * Implementa sia l'interfaccia `TeachingPerson`, che indica che ha la capacità di insegnare ad altre persone, che l'interfaccia `LearningPersonI`, che indica che ha la capacità di studiare a casa.
 */
public class Assistant extends CollegePerson implements TeachingPerson, LearningPersonI{

    /** Indica se l'assistente sta cercando di diventare un dottorato di ricerca */
    public boolean isGoingToBeAphD;

    /**
     * Costruttore che crea un nuovo oggetto `Assistant` con il nome, il cognome, l'ID e lo stato del dottorato di ricerca specificati.
     * @param name Il nome dell'assistente.
     * @param surname Il cognome dell'assistente.
     * @param id L'ID dell'assistente.
     * @param willBeAPhD Lo stato del dottorato di ricerca dell'assistente.
     */
    public Assistant (String name, String surname, int id, boolean willBeAPhD){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.isGoingToBeAphD = willBeAPhD;
    }

    /**
     * Implementazione del metodo `studyAtHome` dell'interfaccia `LearningPersonI`.
     * Stampa un messaggio che indica che l'assistente sta studiando a casa.
     */
    @Override
    public void studyAtHome() {
        System.out.println("I'm the assistant to professor and I'm studying at home.");
    }

    /**
     * Implementazione del metodo `teachToOtherPeople` dell'interfaccia `TeachingPerson`.
     * Stampa un messaggio che indica che l'assistente sta insegnando agli studenti.
     */
    @Override
    public void teachToOtherPeople() {
        System.out.println("I am the professor's assistant and i teach students..");
    }
}