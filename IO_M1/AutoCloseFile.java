package IO_M1;

import java.io.FileInputStream;
import java.io.IOException;

public class AutoCloseFile {
    public static void main(String args[]){
        int i;
        System.out.println("\nMy address is...");
        try(FileInputStream  fin= new FileInputStream("./IO_M1/address.txt")){
            do{
                i = fin.read();
                if(i != -1) System.out.print((char)i);
            }while(i != -1);
        }catch(IOException exc){
            System.out.println("IO Error: "+exc);
        } 
    }
}
