package Arrays;
import exceptionHandling.*;
public class FixedQueue implements IntegerQ {
    int q[];
    int putLoc,getLoc;
    public FixedQueue(int size){
        q = new int[size];
        putLoc = getLoc = 0;
    }

    public void put(int x)throws QueueFullException{
        if(putLoc == q.length){
            throw new QueueFullException(q.length);
        }
        if(putLoc == q.length-1){
            System.out.println("-- Now Queue is at it's Maximum.");
        }
        q[putLoc++] = x;
    }

    public int get()throws QueueEmptyException{
        int temp;
        if(getLoc >= putLoc) {
            getLoc = putLoc = 0;
            throw new QueueEmptyException();
        }
        temp = q[getLoc];
        q[getLoc] = 0;
        getLoc++;
        return temp;
    }
}
