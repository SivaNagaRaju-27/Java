package Arrays;
import java.util.*;

class sort{
    static void qsort(int list[]) {
        qs(list, 0, list.length-1);
    }

    private static void qs(int list[], int p, int r){
        int i,j,x,temp;

        i = p;
        j = r;
        x = list[(p+r)/2];

        do {
            while((list[i]<x) && (i < r)) i++;
            while((x<list[j]) && (j > p)) j--;

            if(i <= j) {
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            }
        }while(i <= j);

        if(p < j) qs(list, p, j);
        if(i < r) qs(list, i, r);
    }

    static void check(int list[]){
        int i,flag = -1;
        System.out.println();
        for(i=0; i<list.length-1; i++){
            if(list[i] > list[i+1]){
                flag = 1;
                break;
            }
        }

        if(flag == 1){
            System.out.println("This Array is Not Sorted....! terminated ar "+i);
            return;
        }
        else System.out.println("This Array is Well Sorted...!");
    }
}
public class SortDemo {
    public static void main(String args[]){
        int list[],i,n;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Size of the List: ");
            n = sc.nextInt();   
        }
        list = new int[n];
        Random rand = new Random();
        for(i=0; i<n; i++){
            list[i] = rand.nextInt(1000);
        }
        var fn = new Functions();
        fn.show(list, n);
        System.out.println("After Sorting....");
        sort.qsort(list);
        fn.show(list, n);

        sort.check(list);
    }
}
