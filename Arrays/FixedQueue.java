package Arrays;

public class FixedQueue implements IntegerQ {
    int q[];
    int putLoc,getLoc;
    public FixedQueue(int size){
        q = new int[size];
        putLoc = getLoc = 0;
    }

    public void put(int x){
        if(putLoc == q.length) {
            System.out.println(" -- Queue is full...! Can't put this value into Queue.");
            return;
        }
        if(putLoc == q.length-1){
            System.out.println(" -- Queue is full...");
        }
        q[putLoc++] = x;
    }

    public int get(){
        int temp;
        if(getLoc >= putLoc) {
            System.out.println(" -- Queue is empty...");
            getLoc = putLoc = 0;
            return -99999;
        }
        temp = q[getLoc];
        q[getLoc] = 0;
        getLoc++;
        return temp;
    }
}
