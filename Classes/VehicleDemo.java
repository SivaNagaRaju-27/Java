package Classes;
public class VehicleDemo {
    public static void main(String args[]){
        int range;
        Vehicle miniVan = new Vehicle();
        //miniVan.passengers = 6;
        miniVan.fuelcap = 16;
        miniVan.mpg = 28;

        range = miniVan.fuelcap * miniVan.mpg;

        System.out.println("The MiniVan has a capacity of "+miniVan.passengers);
        System.out.println("With a Range of "+range);
    }
}