package Arrays;

import java.util.Scanner;
public class Functions {
    void show(int ar[], int n){
        int i = 0;

        System.out.print("List = [");

        while(i < n){
            if(i < n-1) System.out.print(ar[i]+",");
            else System.out.println(ar[i]+"]");              
        }
    }

    int findIndex(int ar[], int n){
        int index = -1,i,k;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a Number: ");
            k = sc.nextInt();
        }

        for(i=0; i<n; i++){
            if(ar[i] == k){
                index = i;
                break;
            }
        }

        return index;
    }

    int findMax(int ar[], int n){
        int m=ar[0],i;
        for(i=1; i<n; i++){
            if(ar[i] > m) m = ar[i];
        }
        return m;
    }

    int findMin(int ar[], int n){
        int m=ar[0],i;
        for(i=1; i<n; i++){
            if(ar[i] < m) m = ar[i];
        }
        return m;
    }

    int[] sort(int ar[], int n){
        int i,j,temp;
        int ar1[] = new int[n];

        for(i=0; i<n; i++){
            ar1[i] = ar[i];
        }
        
        for(i=0; i<n-1; i++){
            for(j=0; j<n-i-1; j++){
                if(ar1[j] > ar1[j+1]){
                    temp = ar1[j];
                    ar1[j] = ar1[j+1];
                    ar1[j+1] = temp;
                }
            }
        }
        return ar;
    }
}