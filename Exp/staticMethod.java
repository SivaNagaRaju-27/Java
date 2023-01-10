package Exp;

class staticMethDemo{
    int x;
    static int y;

    static{
        System.out.println("Inside Static block");
    }

    int meth(){
        x = y*10;
        return x;
    }

    static int mult(int z){
        int mul = y*z;
        //mul = mul+x; cannot make a static reference to x...!
        //mul = mul+meth();         same here           ...!
        return mul;
    }
}

public class staticMethod {
    public static void main(String args[]) {
        System.out.println("inside Main block");
        //var ob = new staticMethDemo();
        staticMethDemo.y = 5;
        System.out.println("Hello");
        System.out.println("Multiplication is "+staticMethDemo.mult(10));
        System.out.println("Multiplication is "+staticMethDemo.mult(100));
    }
}
