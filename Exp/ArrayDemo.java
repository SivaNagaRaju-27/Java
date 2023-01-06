package Exp;
public class ArrayDemo {
    public static void main(String args[]){
        int ar[] = new int[20];
        System.out.print("Array Elements: ");
        for(int i=0; i<20; i++){
            ar[i] = i+1;
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}
