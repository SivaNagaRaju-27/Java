package IO_M1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLineDemo {
    public static void main(String[] args){
        String s;
        try{
            var br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Lines of text.");
            System.out.println("Enter quit to quit.");
            do{
                s = br.readLine();
                System.out.println(s);
            }while (!s.equals("quit"));
        }catch(IOException exc){
            System.out.println("IO-Error..."+exc);
        }
    }
}
