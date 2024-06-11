package Shape;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }

    public String toString(){
        return "Circle\n" +
                "Radius: " + radius + '\n' ;
                //"Area: " + getArea() + '\n' ;
    }


}
