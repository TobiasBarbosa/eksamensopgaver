package Shape;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapeList = new ArrayList<>();

        Shape circle1 = new Circle(5.6);
        Shape circle2 = new Circle(200.75);
        Shape square1 = new Square(7.9);
        Shape square2 = new Square(758.4);
        Circle circle3 = new Circle(6);

        shapeList.add(circle1);
        shapeList.add(circle2);
        shapeList.add(square1);
        shapeList.add(square2);

        //((Shape) circle3).getArea();

        for (Shape shape : shapeList){
            if(shape instanceof Circle){
                System.out.println("Circle");
            } else if(shape instanceof Square){
                System.out.println("Square");
            }
            double area = shape.getArea();
            System.out.println("Area: " + area + '\n');
        }






    }
}
