package Exp;
import java.io.IOException;
public class ClassHelpDemo {
    public static void main(String args[]) throws IOException{
        char choise, ignore;
        HelpClass hlp = new HelpClass();
        for(;;){
            do{
                hlp.showMenu();
                choise = (char)System.in.read();
                do{
                    ignore = (char)System.in.read();
                }while(ignore != '\n');
            }while(!hlp.isValid(choise));

            if(choise == 'q') break;
            System.out.println("\n");

            hlp.helpOn(choise);
        }
    }
}
