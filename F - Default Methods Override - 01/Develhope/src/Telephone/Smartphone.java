package Telephone;

import java.util.Objects;

/**
 * The Smartphone class represents a mobile device with various properties including brand name,
 * model name, battery capacity, and producer/retail prices.
 * It also implements Cloneable to enable copying of objects.
 */
public class Smartphone implements Cloneable {

    /**
     * The brand name of the smartphone.
     */
    public String brandName;

    /**
     * The model name of the smartphone.
     */
    public String modelName;

    /**
     * The battery capacity of the smartphone in mAh.
     */
    public int batterymAh;

    /**
     * The producer price of the smartphone.
     */
    public SmartphonePrice producerPrice;

    /**
     * The retail price of the smartphone.
     */
    public SmartphonePrice retailPrice;

    /**
     * Constructs a Smartphone object with the specified brand name, model name, battery capacity,
     * producer price, and retail price.
     *
     * @param brand   The brand name of the smartphone.
     * @param model   The model name of the smartphone.
     * @param battery The battery capacity of the smartphone in mAh.
     * @param prodP   The producer price of the smartphone.
     * @param retailP The retail price of the smartphone.
     */
    public Smartphone(String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP) {
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }

    /**
     * Returns a String representation of the Smartphone object.
     *
     * @return A String representation of the Smartphone object.
     */
    @Override
    public String toString() {
        return "Smartphone " +
                "branName = " + brandName + "\n" +
                "modelName = " + modelName + "\n" +
                "batterymAh = " + batterymAh + "\n" +
                "producerPrice = " + producerPrice + "\n" +
                "retailPrice = " + retailPrice;
    }

    /**
     * Compares the Smartphone object to the specified object to check for equality.
     *
     * @param o The object to compare to.
     * @return true if the specified object is equal to the Smartphone object, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone smartphone = (Smartphone) o;
        return batterymAh == smartphone.batterymAh && Objects.equals(brandName, smartphone.brandName)
                && Objects.equals(modelName, smartphone.modelName)
                && Objects.equals(producerPrice, smartphone.producerPrice)
                && Objects.equals(retailPrice, smartphone.retailPrice);
    }

    /**
     * Returns a hash code for the Smartphone object.
     *
     * @return A hash code for the Smartphone object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    /**
     * Returns a clone of the Smartphone object.
     *
     * @return A clone of the Smartphone object.
     * @throws CloneNotSupportedException if cloning is not supported.
     */
    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = this.producerPrice;
        clonedSmartphone.retailPrice = this.retailPrice;
        return clonedSmartphone;
    }
}
