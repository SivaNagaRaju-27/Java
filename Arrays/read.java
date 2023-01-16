package Arrays;
import java.io.*;
public class read {
    int Read(String str)throws Exception{
        int n;
        var rd = new InputStreamReader(System.in);
        var br = new BufferedReader(rd);

        System.out.print(str+": ");
        n = Integer.parseInt(br.readLine());

        return n;
    }
}
