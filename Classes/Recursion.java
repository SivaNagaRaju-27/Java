package Classes;

import java.util.Scanner;

class factorial {
    long fact;
    long fact(long x) {
        fact = 1;
        if(x == 0 | x == 1) {
            return 1;
        }else{
            return x*fact(x-1);
        }
    }
}
public class Recursion {
    public static void main(String args[]) {
        var f = new factorial();
        long n,fact;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            n = sc.nextInt();
        }
        fact = f.fact(n);
        System.out.println("The factorial of "+n+" is: "+fact);
    }
}
