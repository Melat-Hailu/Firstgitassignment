package Assignment;

public class Triangle extends Shape {
    private double base;
    private  double height;

    private double theArea;
    private double thePerimeter;

    public void display (String COLOUR ,String NAMEOFSHAPE )
    {
        super.display(COLOUR,NAMEOFSHAPE);
    }
    public void setbaseandheight ( double m ,  double n)
    {
        base=m;
        height=n;
    }
    public double  getHeight()
    {
        return  height;
    }
    public void calculateArea()
    {
       this.theArea  =0.5*(base*height);
        System.out.println("THE AREA OF THE TRIANGLE = " + theArea);
    }
    public  void calculatePerimeter (double side1, double side2)
    {
        this.thePerimeter=side1+side2+base;
        System.out.println("  THE PERIMETER OF THE =" + thePerimeter);
    }










}
