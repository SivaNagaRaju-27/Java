package IO_M1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {
    public static void main(String args[])throws IOException{
        char ch;
        char[] ar = new char[20];
        int i = 0;
        var br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Characters, Period to quit.");

        do{
            ch = (char) br.read();
            ar[i] = ch;
            System.out.print(ch);
            i++;
        } while(ch != '.');

        System.out.println();

        for(i=0; ar[i] != '.'; i++){
            System.out.print(ar[i]);
        }
    }
}
