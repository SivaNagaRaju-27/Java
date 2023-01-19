package Arrays;

public class dynamicQueue implements IntegerQ {
    private int q[];
    private int putLoc,getLoc;

    public dynamicQueue(int size) {
        q = new int[size];
        putLoc = getLoc = 0;
    }

    public void put(int x){
        if(putLoc == q.length){
            int[] t = new int[q.length * 2];

            for(int i=0; i<q.length; i++){
                t[i] = q[i];
            }

            q = t;
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
