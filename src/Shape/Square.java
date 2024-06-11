package Shape;

public class Square implements Shape {

    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getArea(){
        double area = width * width;
        return area;
    }

    public String toString(){
        return "Square\n" +
                "Width: " + width + '\n' ;
                //"Area: " + getArea() + '\n';
    }

}
