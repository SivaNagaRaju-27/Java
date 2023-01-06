package Exp;
import java.util.Scanner;
public class first {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            String s;
            System.out.print("Enter Your Name: ");
            s = sc.nextLine();
            System.out.print("Enter a Number: ");
            n = sc.nextInt();
            for(int i=0; i<n; i++){
                System.out.println("Hello mr."+s);
            }
        }
        
    }
}
