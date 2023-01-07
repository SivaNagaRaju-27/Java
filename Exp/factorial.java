package Exp;

import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        int n,i;
        long fact = 1;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number : ");
            n = sc.nextInt();
        }
        for(i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println("The Factorial of "+n+" is: "+fact);
    }
}
