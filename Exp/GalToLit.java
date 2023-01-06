package Exp;
import java.util.Scanner;
public class GalToLit {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            double gallons;
            double liters;

            System.out.println("Enter the No.of Gallons: ");
            gallons = sc.nextDouble();
            liters = gallons * 3.7854;

            System.out.println(gallons + " gallons is " + liters + " liters. ");
        }
    }
}