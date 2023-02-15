package Vehicles;

/**
 * Questa classe rappresenta una barca che estende la classe Vehicle.
 */
public class Boat extends Vehicle {

    /**
     * La velocità massima in nodi della barca.
     */
    public double maxKnotsSpeed;

    /**
     * Il peso in chilogrammi della barca.
     */
    public int boatKilosWeight;

    /**
     * Costruisce una nuova istanza della classe Boat con il tipo di veicolo, la velocità massima e il peso specificati.
     *
     * @param type il tipo di veicolo
     * @param maxSpeed la velocità massima in nodi della barca
     * @param weight il peso in chilogrammi della barca
     */
    public Boat(String type, double maxSpeed, int weight) {
        this.type = type;
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    /**
     * Questo metodo mostra il peso in chilogrammi e la velocità massima in nodi della barca.
     */
    public void getBoatWeightAndSpeed() {
        System.out.println("Total kilos weight: " + boatKilosWeight + "\nMaximum knots speed: " + maxKnotsSpeed);
    }

    /**
     * Questo metodo implementa il suono della barca.
     */
    @Override
    public void doVehicleSound() {
        System.out.println("Boat sounds!");
    }
}