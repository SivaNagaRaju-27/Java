package IO_M1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAProgram {
    public static void main(String args[]){
        String str;
        try(var br = new BufferedReader(new FileReader("./IO_M1/CopyFile.java"));
                var fw = new FileWriter("./IO_M1/copyCat.java")){
            while((str = br.readLine()) != null){
    
                str = str+"\n";
                fw.write(str);
            }
        }catch(IOException exc){
            System.out.println("IO-Error..."+exc);
        }
    }
}
