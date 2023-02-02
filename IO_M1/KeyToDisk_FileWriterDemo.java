package IO_M1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyToDisk_FileWriterDemo {
    public static void main(String args[]){
        String str;
        var br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text ('stop' to quit).");
        try(FileWriter fw = new FileWriter("./IO_M1/Matfile.txt")){
            do{
                System.out.print(": ");
                str = br.readLine();
                if(str.compareTo("stop") == 0) break;

                str = str+"\r\n";
                fw.write(str);
            } while(str.compareTo("stop") != 0);
        }catch(IOException exc){
            System.out.println("IO-Error: "+exc);
        }

        try(var fr = new FileReader("./IO_M1/Matfile.txt");
                var br1 = new BufferedReader(fr)){
            while((str = br1.readLine()) != null){
                System.out.println(str);
            }
        }catch(IOException exc){
            System.out.println("IO-Error..."+exc);
        }
    }
}
