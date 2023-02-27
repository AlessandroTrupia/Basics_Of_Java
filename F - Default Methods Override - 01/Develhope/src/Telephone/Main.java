package Telephone;

import java.io.PrintStream;
/**
 The Main class demonstrates the use of the Smartphone and SmartphonePrice classes.
 It creates two instances of Smartphone, sets their properties, and prints them to the console.
 It also demonstrates the cloning and equality checking of Smartphone objects.
 */
public class Main {
    public static void main(String[] args) {
        SmartphonePrice phonePriceProd01 = new SmartphonePrice(
                "Euros",
                110.10);
        SmartphonePrice phonePriceProd02 = new SmartphonePrice(
                "Euros",
                220.20);
        SmartphonePrice phonePriceRetail01 = new SmartphonePrice(
                "Euros",
                330.30);
        SmartphonePrice phonePriceRetail02 = new SmartphonePrice(
                "Euros",
                440.40);

        Smartphone smartphone01 = new Smartphone(
                "Samsung",
                "Galaxy",
                10,
                phonePriceProd01, phonePriceRetail01);
        Smartphone smartphone02 = new Smartphone(
                "Apple",
                "Iphone",
                20,
                phonePriceProd02, phonePriceRetail02);

        // print the smartphones to the console
        System.out.println("First Smartphone\n"+ smartphone01 +"\n");
        System.out.println("Second smartphone\n" + smartphone02 + "\n");

        try {
            // clone the second smartphone and print it to the console
            System.out.println("We are cloning the new smartphone by smartphone02\n");
            Smartphone copySmartphone02 = smartphone02.clone();
            System.out.println(copySmartphone02 + "\n");

            // check if the original and cloned smartphones are equal
            System.out.println("Is smartphone2 equal to copySmartphone02? " + smartphone02.equals(copySmartphone02));
        }catch (Exception exception){

            // handle any exception that might occur during cloning
            exception.printStackTrace();
            System.out.println("Dear user, there is an error, sorry about that.");
        }
    }
}
