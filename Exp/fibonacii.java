package Exp;

import java.util.Scanner;

public class fibonacii {
    public static void main(String args[]){
        int n,i,f1=1,f2=1,f3;
        try(var sc = new Scanner(System.in)) {
            System.out.print("Enter a value: ");
            n = sc.nextInt();
        }
        for(i=0; i<n; i++){
            f3 = f1+f2;
            if(i==0){
                System.out.print(f1+" ");
            }else if(i==1){
                System.out.print(f2+" ");
            }else{
                System.out.print(f3+" ");
                f1 = f2;
                f2 = f3;
            }
        }
        System.out.println();
    }
}
