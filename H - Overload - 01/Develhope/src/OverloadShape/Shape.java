package OverloadShape;

public class Shape {
    public String shapeName;
    public double numberOfEdges;
    public Shape() {
        System.out.println("Creation of shape");
        shapeName = "Undefined";
    }
    public Shape (double radius) {
        System.out.println("Creation of new shape");
        this.shapeName = "Circle";
    }
    public Shape (int edges, double edgeLength) {
        System.out.println("Creation of new shape");
        this.shapeName = "Square";
        this.numberOfEdges = edges;
    }
    public Shape (int edges, double e1, double e2) {
        System.out.println("Creation of new shape");
        this.shapeName = "Rectangle";
        this.numberOfEdges = edges;
    }
    public Shape (int edges, double e1, double e2,double e3) {
        System.out.println("Creation of new shape\n");
        this.shapeName = "Triangle";
        this.numberOfEdges = edges;
    }
    public String getShapeDetails(){
        return "The " + shapeName + " value is " + numberOfEdges;
    }
}
/* l'overload (o sovraccarico) è una tecnica che consente di definire più di una versione di un metodo o di un costruttore
 con lo stesso nome all'interno di una stessa classe. Queste diverse versioni si distinguono tra loro per il numero,
 il tipo o l'ordine dei parametri che accettano.

L'overload è utile quando si ha la necessità di creare metodi o costruttori che svolgono la stessa operazione ma con differenti input.
In questo modo, il programmatore può fornire un'interfaccia più intuitiva e flessibile per l'utilizzo delle sue classi.
*/