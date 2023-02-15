package College;

/**
 * Questa classe rappresenta una classe di prova per testare le classi `Professor`, `Assistant` e `Student`.
 */
public class Testing {
    public static void main(String[] args) {

        // Creazione di un nuovo professore con il nome, il cognome, l'ID e la materia specificati
        Professor professor = new Professor(
                "Raffaello",
                "Sanzio",
                20910,
                "Philosophy");

        // Creazione di un nuovo assistente con il nome, il cognome, l'ID e lo stato del dottorato di ricerca specificati
        Assistant assistant = new Assistant(
                "Michelangelo",
                "Buonaroti",
                50192,
                true);

        // Creazione di un nuovo studente con il nome, il cognome, l'ID e l'anno accademico specificati
        Student student = new Student(
                "Leonardo",
                "Da Vinci",
                11111,
                5);

        // Stampa del messaggio che indica che il professore sta andando al college
        professor.goToCollege();

        // Stampa del messaggio che indica che il professore sta insegnando agli studenti
        professor.teachToOtherPeople();

        // Stampa di un separatore per distinguere le diverse sezioni dell'output
        System.out.println("---------------------------------------------------------------------------------------------");

        // Stampa del messaggio che indica che l'assistente sta andando al college
        assistant.goToCollege();

        // Stampa del messaggio che indica che l'assistente sta insegnando agli studenti
        assistant.teachToOtherPeople();

        // Stampa del messaggio che indica che l'assistente sta studiando a casa
        assistant.studyAtHome();

        // Stampa di un separatore per distinguere le diverse sezioni dell'output
        System.out.println("---------------------------------------------------------------------------------------------");

        // Stampa del messaggio che indica che lo studente sta andando al college
        student.goToCollege();

        // Stampa del messaggio che indica che lo studente sta studiando a casa
        student.studyAtHome();
    }
}