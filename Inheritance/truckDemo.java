package Inheritance;

class vehicle{
    int passengers;
    private int fuelcap;
    private int mpg;

    vehicle(int p, int f, int mpg) {
        passengers = p;
        fuelcap = f;
        this.mpg = mpg;
    }

    int range(){
        return fuelcap*mpg;
    }

    double fuelNeeded(int miles){
        return (double) miles/mpg;
    }

    int getPassengers() { return passengers; }
    int getFuelcap() { return fuelcap; }
    int getMpg() { return mpg; }
}

class Truck extends vehicle {
    private int cargocap;
    Truck(int p, int f, int m, int c) {
        super(p,f,m);
        cargocap = c;
    }

    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }
}
public class truckDemo {
    public static void main(String args[]){
        Truck semi = new Truck(2,200,7,44000);
        Truck pickup = new Truck(3,28,15,2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);
        System.out.println("Semi Truck can carry "+semi.getCargo() + " pounds.");
        System.out.println("To go "+ dist + " miles semi needs "+ gallons +" gallons of fuel.\n");
        
        gallons = pickup.fuelNeeded(dist);
        System.out.println("Pickup Truck can carry "+pickup.getCargo() + " pounds.");
        System.out.println("To go "+ dist + " miles Pickup needs "+ gallons +" gallons of fuel.\n");
    }
}
