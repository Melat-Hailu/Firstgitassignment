package Assignment;

public class Rectangle extends Shape {
    private  double length;
    private  double width;
    private  double theArea;
    private  double thePerimeter;
    public  void display (String colour , String nameOfshape)
    {
        super.display(colour,nameOfshape);
    }

    public void setlengthandwidth(double x, double y)
    {
        length=x;
        width=y;
    }
    public void calculateArea (){
        theArea=length*width;
        System.out.println(" THE AREA OF THE  RECTANGLE = "+theArea);
    }
    public void calculatePerimeter()
    {
        this.thePerimeter=2*(length*width);
        System.out.println(" THE PERIMETER OF THE RECTANGLE = " +thePerimeter);
    }
    public  double  getTheArea()
    {
        return theArea;
    }
    public double getThePerimeter()
    {
        return  thePerimeter;
    }









}
