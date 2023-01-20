package exceptionHandling;

public class excDemo1 {
    public static void main(String args[]){
        int[] ar = new int[5];
        try{
            for(int i=0; i<10; i++){
                ar[i] = i*2+10;
                System.out.println("Exception Not at Occured... i = "+i);
            }
        }
        catch(NumberFormatException exc){
            System.out.println("Index Out-Of-Bounds...");
        }
        System.out.println("The Trail Was Ended...");
    }
}
