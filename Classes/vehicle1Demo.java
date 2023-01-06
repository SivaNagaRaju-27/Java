package Classes;
public class vehicle1Demo {
    public static void main(String args[]){
        vehicle1 AMG_gls = new vehicle1();
        vehicle1 AMG_gtr = new vehicle1();

        AMG_gls.passengers = 4;
        AMG_gls.fuelcap = 20;
        AMG_gls.mpg = 16;
        System.out.println("AMG_GLS have the Capacity of "+AMG_gls.passengers);
        AMG_gls.range();

        AMG_gtr.passengers = 2;
        AMG_gtr.fuelcap = 15;
        AMG_gtr.mpg = 12;
        System.out.println("AMG_GTR have the Capacity of "+AMG_gtr.passengers);
        AMG_gtr.range();
    }
}
