package Exp;
class staticDemo {
    int x;
    static int y;
    private static int z;

    int add(){
        z = 5;
        int sum;
        sum = x+y+z;
        System.out.println("x,y,z are "+x+","+y+","+z);
        return sum;
    }
}
public class StaticVar {
    public static void main(String args[]) {
        var ob1 = new staticDemo();
        var ob2 = new staticDemo();
        
        ob1.x = 10;
        ob2.x = 20;

        staticDemo.y = 30;
        //staticDemo.z = 40; Variable Not Visible Error...!
        System.out.println("x+y+Z = "+ob1.add());
        //ob1.y = 40;
        System.out.println("sum = "+ob2.add());
        staticDemo.y = 50;
        System.out.println("x+y+z = "+ob1.add());
        System.out.println("sum = "+ob2.add());
    }
}
