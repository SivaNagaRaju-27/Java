package Strings;

public class clDemo{
	public static void main(String args[]){
		int i=0;
		System.out.println("The length of args is : "+args.length);
		System.out.println("They are: ");
		for(String str: args){
			System.out.println("arg["+i+"]: "+str);
			i++;
		}
	}
}
