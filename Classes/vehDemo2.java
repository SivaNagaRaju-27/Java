package Classes;
import java.util.Scanner;

public class vehDemo2 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int range;
            int dist;
            double gallons;

            System.out.print("Enter the Distance: ");
            dist = sc.nextInt();
    
            veh AMG_gls = new veh(16,22);
            veh AMG_gtr = new veh(12,14);
    
            //AMG_gls.passengers = 4;
            //AMG_gls.fuelcap = 20;
            //AMG_gls.mpg = 16;
    
            //AMG_gtr.passengers = 2;
            //AMG_gtr.fuelcap = 15;
            //AMG_gtr.mpg = 12;
    
            range = AMG_gls.range();
            gallons = AMG_gls.fuelneeded(dist);
    
            System.out.println("The AMG_GLS has a capacity of "+AMG_gls.passengers);
            System.out.println("With a range of "+range);
            System.out.println("We Need "+gallons+" gallons of Fuel for the trip");
    
            range = AMG_gtr.range();
            gallons = AMG_gtr.fuelneeded(dist);
    
            System.out.println("The AMG_GTR has a capacity of "+AMG_gtr.passengers);
            System.out.println("With a range of "+range);
            System.out.println("We Need "+gallons+" gallons of Fuel for the trip");
        }
    }
}
