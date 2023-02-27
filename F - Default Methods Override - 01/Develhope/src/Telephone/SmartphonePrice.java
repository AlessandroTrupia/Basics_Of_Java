package Telephone;

import java.util.Objects;

/**
 * The `SmartphonePrice` class represents the price of a smartphone.
 * It contains information about the price type (e.g. retail, wholesale)
 * and the price in euros.
 */
public class SmartphonePrice implements Cloneable {

    /** The type of the price */
    public String priceType;

    /** The price in euros */
    public double priceInEuros;

    /**
     * Creates a new `SmartphonePrice` object with the given price type and price in euros.
     *
     * @param priceType the type of the price (e.g. retail, wholesale)
     * @param priceInEuros the price in euros
     */
    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    /**
     * Creates and returns a new `SmartphonePrice` object that is a copy of this object.
     *
     * @return a copy of this object
     * @throws CloneNotSupportedException if cloning is not supported
     */
    @Override
    protected SmartphonePrice clone() throws CloneNotSupportedException {
        SmartphonePrice smartphonePrice = (SmartphonePrice) super.clone();
        return smartphonePrice;
    }

    /**
     * Returns a string representation of this `SmartphonePrice` object.
     *
     * @return a string representation of this object
     */
    @Override
    public String toString() {
        return "SmartphonePrice " +
                "priceType = " + priceType + "\n" +
                "priceInEuros = " + priceInEuros;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o the object to compare
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    /**
     * Returns a hash code value for this `SmartphonePrice` object.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}
