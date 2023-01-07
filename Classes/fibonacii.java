package Classes;

import java.util.Scanner;

class repeat {
    int f1=1,f2=1,f3,x,count=0;
    void fib(){
        f3 = f1+f2;
        if(f3 <= x){
            if(count<1){
                System.out.print(f1+" "+f2+" ");
                count++;
                fib();
            }else{
                System.out.print(f3+" ");
                f1 = f2;
                f2 = f3;
                fib();
            }
        }
        return;
    }
}

public class fibonacii {
    public static void main(String args[]) {
        int n;
        var ob = new repeat();
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the limit: ");
            n = sc.nextInt();
        }
        ob.x = n;
        ob.fib();
    }
}
