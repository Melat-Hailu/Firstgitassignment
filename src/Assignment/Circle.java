package Assignment;

public class Circle extends Shape {

    private   double  radius;
    private static  final double PI = 3.14;
    private double theArea;
    private double thePerimeter;

    public  void display (String colour,String nameofShape ){
        super.display(colour,nameofShape);
    }

    public  void setRadius ( double   x )
    {
        radius=x;
    }
    public void calculateArea ()
    {
        this.theArea = (Math.pow(radius, 2)) * PI;
        System.out.println("THE AREA OF THE CIRCLE ="+ theArea);
    }
    public double getArea ()
    {
        return theArea;
    }
    public void calculatePerimeter ()
    {
        thePerimeter=(2*PI)*radius;
        System.out.println(" THE PERIMETER OF THE CIRCLE ="+ thePerimeter);
    }



    }








