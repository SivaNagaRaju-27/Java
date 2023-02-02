package IO_M1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String args[]){
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream("./IO_M1/TEST.txt");
            fout = new FileOutputStream("./IO_M1/address.txt");

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            }while(i != -1);
        }catch(IOException exc) {
            System.out.println("IO Erro: "+exc);
        }finally{
            try{
                if(fin != null) fin.close();
            }catch(IOException exc){
                System.out.println("Error Closing Input File ");
            }
            try{
                if(fout != null) fout.close();
            }catch(IOException exc){
                System.out.println("Error Closing File");
            }
        }
    }
}
