package Vehicles;

/**
 * La classe Tester rappresenta l'entry point del programma.
 * Questo programma crea un'istanza di un'auto e di una barca e le utilizza per eseguire alcune azioni.
 */
public class Tester {

    /**
     * Il metodo main() rappresenta il punto di ingresso del programma.
     * @param args un array di stringhe passate come argomenti da riga di comando.
     */
    public static void main(String[] args) {

        // Crea un'istanza di un'auto
        Car car = new Car(4, 2, 25.210);

        // Crea un'istanza di una barca
        Boat boat = new Boat("Boat", 120, 400);

        // Mostra i dettagli dell'auto
        car.showVehicleDetails();

        // Riproduce il suono dell'auto
        car.doVehicleSound();

        // Stampa una linea orizzontale di separazione
        System.out.println("---------------------------------------------------");

        // Mostra i dettagli della barca
        boat.showVehicleDetails();

        // Riproduce il suono della barca
        boat.doVehicleSound();

        // Stampa i dettagli della barca riguardanti peso e velocità
        boat.getBoatWeightAndSpeed();
    }
}
