package java1;

import java.util.Scanner;

public class ExchangeVlaue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2,val;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter str1: ");   
		 str1 = sc.nextLine();
		
		System.out.println("enter str2: ");      
		str2 = sc.nextLine();
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("after swap");
		
		val = str1;    //divya
		str1=str2;      //gauri   
		str2 = val;
		System.out.println(str1);
		
		System.out.println(str2);
		System.out.println(str1);
	}
}
