package Classes;
public class VehicleDemo1 {
    public static void main(String args[]){
        int range1,range2;

        Vehicle AMG_gls = new Vehicle();
        Vehicle AMG_gtr = new Vehicle();

        AMG_gls.passengers = 4;
        AMG_gls.fuelcap = 20;
        AMG_gls.mpg = 16;

        AMG_gtr.passengers = 2;
        AMG_gtr.fuelcap = 15;
        AMG_gtr.mpg = 12;

        range1 = AMG_gls.fuelcap * AMG_gls.mpg;
        range2 = AMG_gtr.fuelcap * AMG_gtr.mpg;

        System.out.println("The AMG_GLS has a capacity of "+4);
        System.out.println("With a range of "+range1);

        System.out.println("The AMG_GTR has a capacity of "+2);
        System.out.println("With a range of "+range2);
    }
}
