package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String carBrands [] = {"Ferrai","Lamborghini","Toyota","Mercedes","BMW"};

        System.out.println(carBrands.length);

        System.out.println(carBrands[2]);

        Integer primeNumbers[] = new Integer[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;
        System.out.println(Arrays.toString(primeNumbers));
    }
}
