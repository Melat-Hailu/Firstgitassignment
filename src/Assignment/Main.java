package Assignment;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.display("Yellow","circle ");
        circle.setRadius(34.89);
        circle.calculateArea();
        circle.calculatePerimeter();
        Rectangle rectangle = new Rectangle();
        rectangle.display("orange","rectangle");
        rectangle.setlengthandwidth(23.34,25.09);
        rectangle. calculateArea();
        rectangle. calculatePerimeter();
            Triangle triangle = new Triangle();
            triangle.display("green","triangle");
            triangle.setbaseandheight(12,20);
            triangle.calculateArea();
            triangle.calculatePerimeter(3.4,4.09);





    }
}
