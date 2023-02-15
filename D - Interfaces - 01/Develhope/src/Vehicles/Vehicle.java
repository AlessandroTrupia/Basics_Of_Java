package Vehicles;

/**
 * Questa è una classe astratta che rappresenta un veicolo.
 */
public abstract class Vehicle {

    /**
     * Il tipo di veicolo.
     */
    public String type;

    /**
     * Il numero di ruote del veicolo.
     */
    public int numberOfWheels;

    /**
     * Questo metodo mostra i dettagli del veicolo.
     */
    public void showVehicleDetails() {
        System.out.println("Type of vehicle: " + type + "\nNumbers of wheels: " + numberOfWheels);
    }

    /**
     * Questo metodo astratto deve essere implementato dalle sottoclassi per produrre un suono del veicolo.
     */
    public abstract void doVehicleSound();
}