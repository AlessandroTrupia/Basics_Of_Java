package JavadocExercise;

/**
 * Create the new object WordGames
 * print in console the methods invocations
 * @author Alessandro Trupia
 * @version 1.0
 */
public class Tester {
    /**
     * @param args main method
     */
    public static void main(String[] args) {

        WordGames wordGames = new WordGames();

        System.out.println(wordGames.addHelloWord("Hello"));
        System.out.println(wordGames.getFullName("Alessandro","Trupia"));

    }
}
