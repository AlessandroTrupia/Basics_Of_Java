package Constructor;

/**
 * The `Main` class is the entry point of the program.
 */
public class Main {

    /**
     * The main method creates two `House` instances and prints out their address and number of floors.
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        House house1 = new House(
                "The White House - 1600 Pennsylvania Avenue, Washington, D.C.",
                2);

        House house2 = new House(
                "Sherlock Holmes - 221B Baker St., London.",
                1);

        System.out.println("House Address: " + house1.address + "\nNumber of floors: " + house1.numberOfFloors);
        System.out.println("House Address: " + house2.address + "\nNumber of floors: " + house2.numberOfFloors);
    }
}
