package JavadocExercise;

/**
 * Exercise to understanding Javadoc.
 * Create the ArithmeticOperators object
 * print in console the methods invocations
 * @author Alessandro Trupia
 * @version 1.0
 */
public class Tester {
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {

        ArithmeticOperators arithmeticOperators =  new ArithmeticOperators();

        System.out.println(arithmeticOperators.sum(1,1));
        System.out.println(arithmeticOperators.sub(2,1));
        System.out.println(arithmeticOperators.mul(2,2));
        System.out.println(arithmeticOperators.div(4,2));

    }
}
