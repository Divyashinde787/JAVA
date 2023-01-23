package java1;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);   // create object =input
		
		System.out.println("enter 1st value : ");
		int a = input.nextInt();
		
		System.out.println("enter 2nd value : ");
		int b = input.nextInt();
			
		System.out.println(" a = "+a);
		System.out.println(" b1 = "+b);
		System.out.println(" add ="+(a + b));
		System.out.println("sub is : "+(a-b));
		System.out.println("mul is : "+(a*b));
		System.out.println("div is : "+(a/b));

		
	}

}
