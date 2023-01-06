package Strings;

public class StringMethods {
    public static void main(String args[]){
        String str1 = new String("Siva Naga Raju");
        String str2 = new String("siva Naga Raju");

        System.out.println("is Str1 == Str2: "+str1.equals(str2));
        System.out.println("Length of st1: "+str1.length());
        System.out.println("Character at 10: "+str1.charAt(10));
        System.out.println("Str1 compared to str2: "+str1.compareTo(str2));
        System.out.println("Index of Naga in str1: "+str1.indexOf("Naga"));

        String str3 = new String("Siva Naga Raju");
        String str4 = str1;

        System.out.println("str1 == str3: "+str1==str3);
        System.out.println("str1 == str4: "+str1==str4);
    }
}
