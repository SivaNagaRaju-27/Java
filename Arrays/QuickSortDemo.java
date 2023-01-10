package Arrays;
import java.util.*;

class sorting{
    int parCount;
    int sortCount;
    int ar[];
    sorting(int x[]){
        ar = x;

    }
    void partition(int p, int r){
        parCount++;
        if(p >= r) return;
        else{
            int i,j,x,temp;
            x = ar[r];
            i = p-1;
    
            for(j=p; j<r; j++){
                if(ar[j] <= x){
                    i++;
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }

            temp = ar[i+1];
            ar[i+1] = ar[r];
            ar[r] = temp;
            quickSort(i+1,p,r);
        } 
    }

    void quickSort(int l,int p,int r){
        sortCount++;
        partition(p,l-1);
        partition(l+1,r);
    }
}

public class QuickSortDemo {
    public static void main(String args[]){
        int n;
        int ar[];
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter size of the List: ");
            n = sc.nextInt();
            ar = new int[n];
            for(int i=0; i<n; i++){
                System.out.print("Enter Element-["+(i+1)+"]: ");
                ar[i] = sc.nextInt();
            }
        }
        System.out.println("Your Array...");
        var ob = new Functions();
        ob.show(ar, n);
        var ob1 = new sorting(ar);
        ob1.partition(0, n-1);
        System.out.println("After Sorting...");
        ob.show(ar, n);

        System.out.println();
        System.out.println("Method Partition() is Accessed "+ob1.parCount+" times");
        System.out.println("Method quickSort() is Accessed "+ob1.sortCount+" times");

    }
}
