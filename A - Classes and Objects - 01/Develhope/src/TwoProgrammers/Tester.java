package TwoProgrammers;

public class Tester {

    public static void main(String[] args) {

        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();

        programmer1.name = "Alessandro";
        programmer1.age = 28;
        programmer1.wearsGlasses = false;

        programmer2.name = "Fabrizio";
        programmer2.age = 27;
        programmer2.wearsGlasses = true;

        programmer1.drinkCoffe();
        programmer1.printDetails();

        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}
