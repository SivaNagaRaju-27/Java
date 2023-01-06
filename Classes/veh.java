package Classes;
public class veh {
    int passengers;
    int fuelcap;
    int mpg;

    int range(){
        return fuelcap*mpg;
    }

    double fuelneeded(int dist){
        return (double) dist/mpg;
    }

    veh(int i, int j){
        mpg = i;
        fuelcap = j; 
    }
}
