package Arrays;

public class circularQueue implements IntegerQ {
    int q[];
    int getLoc,putLoc,check;
    public circularQueue(int size){
        q = new int[size];
        getLoc = putLoc = check = 0;
    }

    public void put(int x){
        if(putLoc == q.length){
            if(getLoc == 0){
                System.out.println("-- Queue is Full! Can't Put This Value into Queue.");
                putLoc = 0;
                return;
            }
            putLoc = 0;
        }
        if((putLoc == q.length-1 && check == putLoc) | (putLoc+1 == getLoc)){
            System.out.print("With "+x+" in the Queue ");
            System.out.println("-- Queue if Full.");
        }

        if(putLoc == getLoc && check != 0){
            System.out.println("-- Queue is Full! Can't Put This Value into Queue.");
            return;
        }

        q[putLoc++] = x;
        check++;
    }

    public int get(){
        if(check == 0){
            System.out.println("--Queue is empty.");
            return -99999;
        }

        int x = q[getLoc++];
        check--;
        if(getLoc == q.length) getLoc = 0;
        return x;
    }
}
