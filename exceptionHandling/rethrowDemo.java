package exceptionHandling;

public class rethrowDemo {
    public static void main(String args[]) {
        try {
            Rethrow.genException();
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Fatal Erro - Program Terminated.");
        }
    }
}
