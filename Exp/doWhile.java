package Exp;
public class doWhile {
    public static void main(String args[])
        throws java.io.IOException{
            char ch, ignore, answer = 'K';

            do {
                System.out.println("I'm thinking of a letter between A and Z.");
                System.out.print("Can you guess it: ");

                ch = (char) System.in.read();

                System.out.print("Discorded Characters: ");

                do {
                    ignore = (char) System.in.read();
                    if(ignore == '\n') System.out.println();
                    else System.out.print(ignore+",");
                } while(ignore != '\n');

                if(ch == answer) System.out.println("** Right **");
                else {
                    System.out.print("...Sorry, you're ");
                    if(ch < answer) System.out.println("too low");
                    else System.out.println("too high");
                    System.out.println("Try again!\n");
                }

                if(ch == answer) break;
            }while(ch != 1);
        }
}
