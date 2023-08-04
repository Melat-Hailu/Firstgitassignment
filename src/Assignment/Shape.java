package Assignment;

public class Shape {
    private String COLOUR;
    private String nameofShape;

    public  void display (String colour,String nameofShape ){

        this.COLOUR=colour;
        this.nameofShape=nameofShape;
        System.out.println("THE COLOUR OF THE SHAPE IS  "+  COLOUR);
        System.out.println("THE NAME OF THE SHAPE  "+ nameofShape);

    }

}
