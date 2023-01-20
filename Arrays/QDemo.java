package Arrays;
import java.io.*;

import exceptionHandling.QueueEmptyException;
import exceptionHandling.QueueFullException;
public class QDemo {
    public static void main(String args[])throws Exception {
        int flag = -1;
        var br = new BufferedReader(new InputStreamReader(System.in));
        var fq = new FixedQueue(10);
        var cq = new circularQueue(10);
        var dq = new dynamicQueue(10);
        IntegerQ ob;

        String str;
        System.out.println("\n\t[1].Fixed Linear Queue.");
        System.out.println("\t[2].Fixed Circular Queue.");
        System.out.println("\t[3].Dynamic Queue.");
        System.out.print("Choose Your Option: ");
        str = br.readLine();

        switch(str){
            case "1": ob = fq;
            break;
            case "2": ob = cq;
            break;
            case "3": ob = dq;
            break;
            default: ob = fq;
        }

        for(;;){
            System.out.println("\n\t[1].Insert Into Queue.");
            System.out.println("\t[2].Get Next Integer.");
            System.out.println("\t[3].Get All Values In The Queue.");
            System.out.println("\t[q].To Quit.");
            System.out.print("Choose Your Option: ");
            str = br.readLine();

            switch(str){
                case "1": int x;
                    System.out.print("Enter a Value: ");
                    x = Integer.parseInt(br.readLine());
                    try{
                        ob.put(x);
                    }catch(QueueFullException exc){
                        System.out.println(exc);
                    }
                    System.out.println();
                break;

                case "2": 
                    try{
                        int y = ob.get();
                        if(y != -99999)System.out.println("The Next Element is: "+y);
                    }
                    catch(QueueEmptyException exc){
                        System.out.println(exc);
                    }
                    System.out.println();
                break;

                case "3": 
                    int z;
                    System.out.print("The Queue contents are: ");
                    try{
                        for(; ; ){
                            z = ob.get();
                            if(z != -99999) System.out.print(z+" ");
                            else break;
                        }
                    }catch(QueueEmptyException exc){
                        System.out.println(exc);
                    }
                    System.out.println();
                break;

                case "q": flag = 1;
                break;

                default: System.out.println("Invalid Option..! Try Again.");
            }

            if(flag == 1){
                System.out.println("You Choose To Quit...!");
                break;
            }
        }
    }
}
