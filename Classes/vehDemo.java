package Classes;
public class vehDemo {
    public static void main(String arga[]){

        veh AMG_gls = new veh(0,0);
        veh AMG_gtr = new veh(0,0);

        AMG_gls.passengers = 4;
        AMG_gls.fuelcap = 20;
        AMG_gls.mpg = 16;

        AMG_gtr.passengers = 2;
        AMG_gtr.fuelcap = 15;
        AMG_gtr.mpg = 12;

        System.out.println("The AMG_GLS has a capacity of "+4);
        System.out.println("With a range of "+AMG_gls.range());

        System.out.println("The AMG_GTR has a capacity of "+2);
        System.out.println("With a range of "+AMG_gtr.range());
    }
}
