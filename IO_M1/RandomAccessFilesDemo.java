package IO_M1;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFilesDemo {
    public static void main(String args[]){
        double[] data = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25, 10.98, 23.54, 182.99, 200.2, 420.5, 500};
        double d;

        try (var raf = new RandomAccessFile("./IO_M1/rand.txt", "rw")){
            for(int i=0; i<data.length; i++){
                raf.writeDouble(data[i]);
            }
            raf.seek(0);
            d = raf.readDouble();
            System.out.println("First Value is "+d);

            raf.seek(8);
            d = raf.readDouble();
            System.out.println("Second Value is "+d);
            
            raf.seek(8*4);
            d = raf.readDouble();
            System.out.println("Fifth Value is "+d);
            
            System.out.println();

            System.out.print("Here is Every other Value: ");
            for(int i=5; i<data.length; i++){
                raf.seek(8*i);
                d = raf.readDouble();
                System.out.print(d+" ");
            }
        }catch(IOException exc){
            System.out.println("IO-Error...\n"+exc);
        }
    }
}
