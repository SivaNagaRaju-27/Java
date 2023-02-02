package IO_M1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryIOStreams {
    public static void main(String args[]){
        int i = 10;
        double d = 1023.56;
        boolean b = true;
        //String s = "The End!";

        try (var dout = new DataOutputStream(new FileOutputStream("testdata"))){
            System.out.println("Writing "+i);
            dout.writeInt(i);
            System.out.println("Writing "+d);
            dout.writeDouble(d);
            System.out.println("Writing "+b);
            dout.writeBoolean(b);
            //dout.writeChars(s);
        }catch(IOException exc){
            System.out.println("IOError...");
            //dout.writeChars(s);
            return;
        }

        try (var din = new DataInputStream(new FileInputStream("testdata"))){
            int x = din.readInt();
            System.out.println("We Read "+x);

            double y = din.readDouble();
            System.out.println("We Read "+y);

            boolean z = din.readBoolean();
            System.out.println("we Read "+z);

            char ch = din.readChar();
            System.out.println("We Read "+ch);

            /*byte[] by = new byte[10];
            for(i=0; i<10; i++){
                System.out.print("Enter A String: ");
                by = din.readNBytes(10);
            }

            System.out.println("Your String is...");
            for(i=0; i<10; i++){
                System.out.print((char)by[i]);
            }*/

            System.out.println();
        }catch(IOException exc){
            System.out.println("IOError...\n"+exc);
            return;
        }
    }
}
