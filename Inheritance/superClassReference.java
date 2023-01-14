package Inheritance;
class TwoDShape2 {
    private double width;
    private double height;

    TwoDShape2(){
        width = height = 0.0;
    }

    TwoDShape2(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape2(double x){
        width = height = x;
    }

    TwoDShape2(TwoDShape2 ob){
        width = ob.width;
        height = ob.height;
    }

    void showDim() {
        System.out.println("Width and height are "+ width +" and "+ height);
    }

    double getwidth() {return width;}
    double getheight() {return height;}
}

class Triangle2 extends TwoDShape2 {
    private String style;

    Triangle2() {
        super();
        style = "none";
    }

    Triangle2(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    Triangle2(double x) {
        super(x);
        style = "filled";
    }

    Triangle2(Triangle2 ob){
        super(ob);
        style = ob.style;
    }
    
    double area() {
        return getwidth() * getheight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is "+style);
    }
}

public class superClassReference {
    public static void main(String ars[]) {
        Triangle2 t1 = new Triangle2("Outlined", 10, 13);
        Triangle2 t2 = new Triangle2(t1);
        System.out.println("info for t1: ");
        t1.showStyle();
        t1.showDim();
        //t1.showColor();
        System.out.println("Area is "+ t1.area());
        System.out.println();



        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        //t2.showColor();
        System.out.println("Area is "+ t2.area());
        System.out.println();
    }
}
