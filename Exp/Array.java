package Exp;
import java.util.Scanner;
public class Array {
    public static void main(String args[]) throws java.io.IOException{
        try(Scanner sc = new Scanner(System.in)){
            char ch,ign;
            int n, list[], temp[];

            Functions a = new Functions();

            System.out.print("Enter The Size of Your List: ");
            n = sc.nextInt();
            list = new int[n];
            for(int i=0; i<n; i++){
                System.out.print("Enter Element ["+(i+1)+"]: ");
                list[i] = sc.nextInt();
            }
            
            a.ShowMenu();
            for(;;){
                do {
                    System.out.print("Choose An Option: ");
                    ch = (char) System.in.read();
    
                    do {
                        ign =(char) System.in.read();
                    } while(ign != '\n');
    
                    switch(ch){
                        case '1': a.Display(list,n);
                        break;
                        case '2': System.out.print("Enter an Element: ");
                                    int p = sc.nextInt();
                                    int x = a.find(p, list, n);
                                    if(x==-1) System.out.println("The Element "+p+" is Not Found In the List.");
                                    else System.out.println("The Element "+p+" found at Index "+x);
                        break;
                        case '3': temp = new int[n];
                                    temp = a.Sort(list,n);
                                    System.out.print("Sort.");
                                    a.Display(temp, n);
                        break;
                        case 'q': System.out.println("Choose To Quit....");
                        break;
                        default : System.out.println("The Given Option is Not Valid...");
                        break;
                    }
                } while(ch < '1' | ch > '3' & ch != 'q');
    
                if(ch == 'q'){
                    System.out.println("Thank You");
                    break;
                }
                System.out.println("\n");
            }
        }
    }
}
