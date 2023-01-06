package Exp;
public class Display {
    void Array(int ar[], int n){
        System.out.print("List = [");
        for(int i=0; i<n; i++){
            if(i<n-1){
                System.out.print(ar[i]+",");
            }else{
                System.out.println(ar[i]+"]");
            }
        }
    }
}
