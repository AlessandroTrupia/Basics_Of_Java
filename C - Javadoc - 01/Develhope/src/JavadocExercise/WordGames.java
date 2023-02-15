package JavadocExercise;

/**
 * Exercise to understanding Javadoc.
 * Using two String methods that takes parameter as input and returns the strings.
 * @author Alessandro Trupia
 * @version 1.0
 */
public class WordGames {
    /**
     * @param word as a string parameter
     * @return String word
     */
    public String addHelloWord (String word){
        return word;
    }

    /**
     * @param name as a string parameter
     * @param surname as a string parameter 
     * @return concatenation of name and surname
     */
    public String getFullName(String name, String surname){
        return name + " " + surname;
    }
}
