package Exp;
public class switchExp1 {
    public static void main(String args[]) throws java.io.IOException{
        char n;
        String s = "Nothing";
        System.out.print("Enter a Number: ");
        n = (char)System.in.read();
        System.out.println("n is "+n);
        switch(n){
            case '0': s = "Zero";
            break;
            case '1': s = "One";
            break;
            case '2': s = "Two";
            break;
            case '3': s = "Three";
            break;
            case '4': s = "Four";
            break;
            case '5': s = "Five";
            break;
            case '6': s = "Six";
            break;
            case '7': s = "Seven";
            break;
            case '8': s = "Eight";
            break;
            case '9': s = "Nine";
            break;
            default : System.out.println("Not The quite Input that I anticipated!....");
        }
        System.out.println("The Digt You Enterd is "+s);
    }
}