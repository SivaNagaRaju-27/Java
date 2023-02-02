package IO_M1;

import java.io.IOException;

public class ReadBytes {
    public static void main(String args[]) throws IOException{
        byte[] x = new byte[12];

        System.out.print("Enter Some Characters: ");
        System.in.read(x);
        System.out.println("The recieved Data is.");
        for(int i=0; i<x.length; i++){
            System.out.write(x[i]);
        }
    }
}
