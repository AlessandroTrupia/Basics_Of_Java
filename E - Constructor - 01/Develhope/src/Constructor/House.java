package Constructor;

/**
 * The `House` class represents a residential building.
 */
public class House {

    /**
     * The address of the house.
     */
    public String address;

    /**
     * The number of floors in the house.
     */
    public int numberOfFloors;

    /**
     * Creates a new `House` instance with the specified address and number of floors.
     * @param address the address of the house
     * @param numberOfFloors the number of floors in the house
     */
    public House(String address, int numberOfFloors) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
    }
}
