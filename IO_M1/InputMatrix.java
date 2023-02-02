package IO_M1;

import java.io.FileOutputStream;
import java.io.IOException;

public class InputMatrix {
    public static void main(String args[]){
        byte[][] b = new byte[9][5];
        int i = 0;
        try (var fout = new FileOutputStream("./IO_M1/Matfile.txt")){
            for(i=0; i<3; i++){
                System.out.println("Enter 3 Array Elements with Spaces separating them...");
                System.in.read(b[i]);
                fout.write(b[i]);
                fout.write('\n');
            }
        }catch(IOException exc){
            System.out.println("IOError...");
        }
    }
}
