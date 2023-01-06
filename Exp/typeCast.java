package Exp;
public class typeCast {
    public static void main(String args[]){
        byte b = 10;
        int n;
        n = b*b;//Automatically converted in to int
        b = (byte)(b*b);//Casting is required since the expression will return an int object
        System.out.println("b and n are "+b+" and "+n);
        char ch = 'X';
        n = ch+ch;
        ch = (char)(ch+ch);
        System.out.println("n and ch are "+n+" and "+ch);
    }
}
