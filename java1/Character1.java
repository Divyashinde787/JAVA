package java1;

import java.util.Scanner;

public class Character1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter character or numbers or special characters: ");
		char let = sc.next().charAt(0);
		
		if((let>='A') && (let<='Z'))
		{
			System.out.println("letter is capital");
		}
		else if((let>='a') && (let<='z')) {
			System.out.println("letter is small");
		}	
		else if((let >='1') && (let <='9'))
		{
			System.out.print(" is numbers");
		}
		else if(let == '0')
		{
			System.out.println("Number is zero");
		}
		else if(let == ' ')
		{
			System.out.println("is space");

		}
		else {
			System.out.println("special characters");
		}
	}
}
