package Exp;
public class Find {
    int min(int ar[], int n){
        int min = ar[0];
        for(int i=1; i<n; i++){
            if(ar[i] < min) min = ar[i];
        }
        return min;
    }

    int Max(int ar[], int n){
        int max = ar[0];
        for(int i=1; i<n; i++){
            if(ar[i] > max) max = ar[i];
        }
        return max;
    }
}
