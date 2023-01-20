package exceptionHandling;

import java.io.IOException;

public class throwsDemo {
    public static char prompts(String str)throws java.io.IOException{
        System.out.println(str+": ");
        return (char) System.in.read();
    }

    public static void main(String args[]) {
        char ch;
        int x;
        try{
            ch = prompts("Enter a Character");
        }catch(IOException exc){
            ch = 'X';
            System.out.println("IOException Occured...");
        }
        x = (int) ch;
        System.out.println("ch and x "+ch+" and "+x);
    }
}
