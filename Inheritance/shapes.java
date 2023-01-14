package Inheritance;

abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() {return width;}
    double getHeight() {return height;}
    String getName() {return name;}

    void showDim() {
        System.out.println("Width and height are "+ width +" and "+ height);
    }

    abstract double area();
}

class Triangle extends TwoDShape {
    private String style;

    Triangle(){
        super();
        style = "none";
    }
    
    Triangle(String s, double w, double h) {
        super(w,h,"triangle");
        style = s;
    }

    Triangle(double x) {
        super(x, "triangle");
        style = "filled";
    }

    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is "+style);
    }
}

class Rectangle extends TwoDShape {
    Rectangle() {
        super();
    }

    Rectangle(double w, double h) {
        super(w,h,"rectangle");
    }

    Rectangle(double x){
        super(x,"Square");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}

public class shapes {
    public static void main(String args[]) {
        TwoDShape shapes[] = new TwoDShape[4];

        shapes[0] = new Triangle("Outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7.0);

        for(int i=0; i<shapes.length; i++) {
            System.out.println("Object is "+ shapes[i].getName());
            System.out.println("Area is "+ shapes[i].area());
            System.out.println();
        }
        //Triangle t1 = new Triangle();
        //Triangle t2 = new Triangle();

        /*t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "Filled";
        
        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "Outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());*/
    }
}
