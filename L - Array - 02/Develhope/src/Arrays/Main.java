package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] aliceToDos = {"Coding","Reading","Learning"};
        String[] bobToDos  = {"Reading","Coding","Learning","Sleeping"};
        String[] timToDos = {"Reading","Learning","Coding"};

        if (Arrays.equals(aliceToDos,bobToDos)){
            System.out.println("Alice array is equal to Bob array");
        }else {
            System.out.println("Alice array isn't equal to Bob array");
        }

        if (Arrays.equals(aliceToDos,timToDos)){
            System.out.println("Alice array is equal to Tim array");
        }else {
            System.out.println("Alice array isn't equal to Tim array");
        }

        System.out.println();
        if (aliceToDos.length == bobToDos.length){
            System.out.println("Alice's array Is having the same length of Bob's array");
        }else {
            System.out.println("Alice's array don't have the same length of Bob's array");
        }

        if (aliceToDos.length == timToDos.length){
            System.out.println("Alice's array Is having the same length of Tim's array");
        }else {
            System.out.println("Alice's array don't have the same length of Tim's array");
        }

        System.out.println();
        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);
        System.out.println("Is Alice having the same tasks of Bob? " + Arrays.equals(aliceToDos,bobToDos));
        System.out.println("Is Alice having the same tasks of Tim? " + Arrays.equals(aliceToDos,timToDos));
    }
}
