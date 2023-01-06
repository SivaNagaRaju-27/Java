package Exp;
//import java.util.Scanner;
public class Functions {

    void ShowMenu(){
        //System.out.println("[1].Read Array");
        System.out.println("[1].Display Array");
        System.out.println("[2].Find Index");
        System.out.println("[3].Sort Array");
        System.out.println("[q].Quit");
    }

    int find(int x, int list[], int n){
        int i;
        int flag = -1;
        for(i=0; i<n; i++){
            if(list[i] == x){
                flag = i;
                break;
            }
        }
        return flag;
    }

    /*void read(int list[], int n){
        try(Scanner sc = new Scanner(System.in)){
            int i;
            for(i=0; i<n; i++){
                System.out.print("Enter Element ["+(i+1)+"]: ");
                list[i] = sc.nextInt();
            }
        }
    }*/

    void Display(int list[], int n){
        int i;
        System.out.print("List = [");
        for(i=0; i<n; i++){
            if(i < n-1) System.out.print(list[i]+",");
            else System.out.println(list[i]+"]");
        }
    }

    int[] Sort(int list[], int n){
        int i,temp,j,list1[];
        list1 = new int[n];

        for(i = 0; i<n; i++) list1[i] = list[i];
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(list1[j] > list1[j+1]){
                    temp = list1[j];
                    list1[j] = list1[j+1];
                    list1[j+1] = temp;
                }
            }
        }
        System.out.println("Sorting Completed...");
        return list1;
    }
}
