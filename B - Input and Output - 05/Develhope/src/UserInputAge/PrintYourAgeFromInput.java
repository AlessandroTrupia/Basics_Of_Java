package UserInputAge;

import java.util.Scanner;

public class PrintYourAgeFromInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter you age:");
        int age = input.nextInt();
        System.out.printf("your age is: " + age,"%f");
        input.close();
    }
}
