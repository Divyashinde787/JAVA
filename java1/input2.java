package java1;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("enter 1st string : ");
		String b = input.nextLine();
		System.out.println("1st string is :"+b);
		System.out.println("enter 2nd string : ");
		String e = input.next();
		// nextLine() print full sentance  , next() print only 1st word = scan string
		
		System.out.println("2nd string is : "+e);
		System.out.println("concate two string are: "+(b+" "+e));
		
		System.out.println("enter 1st int : ");
		int f = input.nextInt();
		System.out.println("1st int is :"+f);
		System.out.println("concate two string are: "+(b+" "+f));
		
		
		System.out.println("enter 1st float : ");
		float c = input.nextFloat();
		System.out.println("1st float is :"+c);
			
		System.out.println("enter 1st char : ");
		char a = input.next().charAt(0);		
		System.out.println("1st char is :"+a);
			
	}

}
