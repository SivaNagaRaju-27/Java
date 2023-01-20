package exceptionHandling;

public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int x){
        size = x;
    }

    public String toString(){
        return "\n\tQueue is Full! Maximum Size is "+size;
    }
}
