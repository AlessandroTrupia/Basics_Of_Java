package GenericClass;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> firstElement = new GenericClass<Integer>();
        GenericClass<Integer> secondElement = new GenericClass<Integer>();

        GenericClass<String> thirdElement  = new GenericClass<String >();
        GenericClass<String> fourthElement = new GenericClass<String >();

        firstElement.setT(12);
        secondElement.setT(13);

        thirdElement.setT("This is a string");
        fourthElement.setT("This is a string");

        boolean firstEqualsSecond = GenericClass.isEqual(firstElement, secondElement);
        System.out.println("First element is equal to second element? " + firstEqualsSecond);

        boolean thirdEqualsFourth = GenericClass.isEqual(thirdElement, fourthElement);
        System.out.println("Third element is equal to fourth element? " + thirdEqualsFourth);
    }
}
/*i generics sono un meccanismo che permette di scrivere classi, interfacce e metodi in modo tale che possano essere
parametrizzati con uno o più tipi, senza specificare a priori di che tipo esattamente si tratti.
In altre parole, i generics consentono di creare codice riutilizzabile e flessibile che può operare su differenti tipi di oggetti.
come in questo caso operiamo su un Integer e String
*/