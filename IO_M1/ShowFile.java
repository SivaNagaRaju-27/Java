package IO_M1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    /**
     * @param args
     */
    public static void main(String args[]){
        int i;
        FileInputStream fin;

        if(args.length != 1){
            System.out.println("Usage: ShowFile File");
        }

        try{
            fin = new FileInputStream("./IO_M1/TEST.txt");
        }
        catch(FileNotFoundException exc){
            System.out.println("File Not Found");
            return;
        }

        try{
            do{
                i = fin.read();
                if(i != -1) System.out.print((char)i);
            }while(i != -1);
        }catch(IOException exc){
            System.out.println("Error Reading File");
        }finally{
            try{
                fin.close();
            }catch(IOException exc){
                System.out.println("Error Closing The File...");
            }
        }
    }
}
