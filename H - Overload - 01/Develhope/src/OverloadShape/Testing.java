package OverloadShape;

public class Testing {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape shape1 = new Shape(2);
        Shape shape2 = new Shape(5,2.5);
        Shape shape3 = new Shape(10,4.5,5.5);
        Shape shape4 = new Shape(15, 1.5,2.5,3.5);

        String shapeDefault = shape.getShapeDetails();
        String shapeCircle = shape1.getShapeDetails();
        String shapeSquare = shape2.getShapeDetails();
        String shapeRectangle = shape3.getShapeDetails();
        String shapeTriangle = shape4.getShapeDetails();

        System.out.println(shapeDefault + "\n");
        System.out.println(shapeCircle + "\n");
        System.out.println(shapeSquare + "\n");
        System.out.println(shapeRectangle + "\n");
        System.out.println(shapeTriangle);
    }
}
