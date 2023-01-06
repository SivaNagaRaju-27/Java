package Arrays;

import java.util.Scanner;
import java.io.IOException;
public class Array {
    static int ar[],n;
    static void read(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter size of the List: ");
            n = sc.nextInt();
            ar = new int[n];
            for(int i=0; i<n; i++){
                System.out.print("Enter Element-["+(i+1)+"]: ");
                ar[i] = sc.nextInt();
            }
        }
    }

    static void menu(){
        System.out.println("\n\t\t*****MENU*****\n");
        System.out.println("\t[1].Display");
        System.out.println("\t[2].Find Index");
        System.out.println("\t[3].Find Max");
        System.out.println("\t[4].Find Min");
        System.out.println("\t[5].Sort List");
        System.out.println("\t[q].Quit Process\n");
    }

    public static void main(String args[])throws IOException{
        char ch, ign;
        read();
        for( ; ; ){
            do {
                menu();
                System.out.print("Choose Your Option: ");
                ch = (char)System.in.read();

                do {
                    ign = (char)System.in.read();
                } while (ign != '\n');

                Functions fn = new Functions();
                switch(ch){
                    case '1': fn.show(ar, n);
                    break;
                    case '2': int index;
                            index = fn.findIndex(ar,n);
                            if(index == -1)
                                System.out.println("The Given Number is Not-Found in List..!");
                            else System.out.println("Number Found At The Index: "+index);
                    break;
                    case '3': int max;
                            max = fn.findMax(ar, n);
                            System.out.println("The Maximum Number in the list is "+max);
                    break;
                    case '4': int min;
                            min = fn.findMin(ar, n);
                            System.out.println("The Minimum Number in the list is "+min);
                    break;
                    case '5': int sList[] = new int[n];
                            sList = fn.sort(ar,n);
                            fn.show(sList,n);
                    break;
                }
            } while(ch < 1 | ch > 7 & ch == 'q');

            if(ch == 'q'){
                System.out.println("\t\tTerminating...!\n");
                break;
            }
            else System.out.println("You Selected an Invalid Option...!");
        }
    }
}