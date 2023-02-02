package IO_M1;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args){
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 10;
        double d = 275.88;

        pw.println("Using a PrntWriter.");
        pw.println(i);
        pw.println(d);

        pw.println(i+" + "+d+" is "+ (i+d));
    }
}
