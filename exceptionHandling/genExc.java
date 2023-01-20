package exceptionHandling;

public class genExc {
    static void excp(){
        int[] x = new int[4];
        try{
            x[5] = 10;
        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("The Error is Handled...");
        }
    }
}
