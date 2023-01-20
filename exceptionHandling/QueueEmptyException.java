package exceptionHandling;

public class QueueEmptyException extends Exception {
    public String toString(){
        return "\n\tQueue is Empty!";
    }
}
