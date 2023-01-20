package exceptionHandling;

public class excDemo2 {
    public static void main(String args[]){
        try{
            genExc.excp();
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("The Exception is "+exc);
        }
        System.out.println("Understood...");
    }
}
