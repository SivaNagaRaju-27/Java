package Exp;
class sample{
	public static void main(String args[]){
		int i = 0;
		char ch = (char)i;
		while(i <= 300){
			System.out.println("ASCII_Char("+i+") is: "+ch++);
			i++;
		}
	}
}