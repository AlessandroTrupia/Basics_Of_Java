package Static;

public class Tester {
    public static void main(String[] args) {
        Employee employee01 = new Employee(
                "Leonardo",
                "Da Vinci",
                "Street of the artist 123");
        Employee employee02 = new Employee(
                "Michelangelo",
                "Buonarroti",
                "Street of the painter 789");

        Badge badge1 = new Badge(employee01,"");
        Badge badge2 = new Badge(employee02,"");

        badge1.showBadgeDetails();
        System.out.println();
        badge2.showBadgeDetails();
    }
}
