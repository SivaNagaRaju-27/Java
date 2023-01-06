package Exp;
public class doWhile1 {
    public static void main(String args[]) throws java.io.IOException{
        char ch,a = '0';
        A: {
            System.out.print("Guess the Character: ");
            ch = (char)System.in.read();
            if(ch != 'K') System.out.print("Discarded Characters are: "+ch+",");
            do {
                ch = (char)System.in.read();
                if(ch == '\n') System.out.println();
                else {
                    if(ch == 'K'){
                        a = ch;
                    }
                    else System.out.print(ch+",");
                }
            }while(ch != '\n');

            if(a != 'K'){
                break A;
            }

        }

        System.out.println("Hurray "+a+" is the Correct Guess!");
    }
}
