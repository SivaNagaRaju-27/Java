package Exp;
import java.util.Scanner;
public class ArrayFunctions {
    public static void main(String args[]){
        try(Scanner input = new Scanner(System.in)){
            int nums[];
            int i,n;
            int min,max;

            System.out.print("Enter Size of the Array: ");
            n = input.nextInt();

            nums = new int[n];

            for(i=0; i<n; i++){
                System.out.print("Enter Element["+(i+1)+"]: ");
                nums[i] = input.nextInt();
            }

            Display disp = new Display();
            disp.Array(nums, n);

            Find find = new Find();
            min = find.min(nums,n);
            max = find.Max(nums,n);

            System.out.println("The Minimum Value is: "+min);
            System.out.println("The Maximum Value is: "+max);

            Sort sort = new Sort();
            sort.bubble(nums, n);
            disp.Array(nums, n);
        }
    }
}