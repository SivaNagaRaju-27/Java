package Inheritance;

class TwoDShape1 {
    private double width;
    private double height;

    TwoDShape1(){
        width = height = 0.0;
    }

    TwoDShape1(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape1(double x){
        width = height = x;
    }

    void showDim() {
        System.out.println("Width and height are "+ width +" and "+ height);
    }

    double getwidth() {return width;}
    double getheight() {return height;}
}

class Triangle1 extends TwoDShape1 {
    private String style;

    Triangle1() {
        super();
        style = "none";
    }

    Triangle1(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    Triangle1(double x) {
        super(x);
        style = "filled";
    }
    
    double area() {
        return getwidth() * getheight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is "+style);
    }
}

class ColorTriangle extends Triangle1 {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s,w,h);
        color = c;
    }

    String getColor() {return color;}
    void showColor() {
        System.out.println("Color is " + color);
    }
}

public class multiLevel {
    public static void main(String ars[]) {
        ColorTriangle t1 = new ColorTriangle("Blue", "Outlined", 10, 13);
        ColorTriangle t2 = new ColorTriangle("Red", "Filled", 13, 9);
        System.out.println("info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is "+ t1.area());
        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is "+ t2.area());
        System.out.println();
    }
}
