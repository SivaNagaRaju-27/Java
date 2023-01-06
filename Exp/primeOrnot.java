package Exp;

import java.util.Scanner;
public class primeOrnot {
	public static void main(String args[]) {
		int i,n,flag = -1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a Number: ");
			n = sc.nextInt();
		}
		if(n > 1) {
			for(i=2; i<n; i++){
				if(n%i == 0){
					System.out.println("The Number "+n+" is not a Prime Number");
					flag = 1;
					break;
				}
			}
			if(flag != 1)
				System.out.println("The Number "+n+" is a Prime Number");
		}
	}
}
