package java1;

import java.util.Scanner;

public class conditional_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("enter user age : ");
		int age = input1.nextInt();
		
		if(age >= 18)
		{
			System.out.println("user can vote sucessfully");
		}
		else {
			System.out.println("user can't vote");
		}
		
	}

}
