package Exp;
import java.util.Scanner;
public class CharArithDemo {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            char ch = 'X';
            int n,i = 0;
            System.out.print("Enter a Number: ");
            n = sc.nextInt();
            while(i < n){
                System.out.println("The Character is : "+ch++);
                i++;
            }
            ch = 125;
            System.out.println("Ch is : "+ch);
        }
    }
}