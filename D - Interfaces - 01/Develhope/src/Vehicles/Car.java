package Vehicles;

/**
 * Questa classe rappresenta una macchina che estende la classe Vehicle.
 */
public class Car extends Vehicle {

    /**
     * Il numero di porte della macchina.
     */
    public int numberOfDoors;

    /**
     * Il prezzo della macchina.
     */
    public double carPrice;

    /**
     * Costruisce una nuova istanza della classe Car con il numero di ruote, il numero di porte e il prezzo specificati.
     *
     * @param wheels il numero di ruote della macchina
     * @param doors il numero di porte della macchina
     * @param price il prezzo della macchina
     */
    public Car(int wheels, int doors, double price) {
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    /**
     * Questo metodo mostra i dettagli della macchina, incluso il numero di porte.
     */
    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Number of doors: " + numberOfDoors);
    }

    /**
     * Questo metodo implementa il suono della macchina.
     */
    @Override
    public void doVehicleSound() {
        System.out.println("Car sounds!");
    }
}