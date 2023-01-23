package java1;

import java.util.Scanner;

public class ArrayExmp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("enter numbers to stored  : ");  //5
		int no1 = sc.nextInt();
		
		System.out.println("enter name of student : ");

		String[] n1 = new String[10];
		
		for(int i=0; i<no1; i++) {
			n1[i]= sc.nextLine();	
		}
		for(int i=0; i<no1; i++) {
			System.out.println("students name are : "+n1[i]);		
		}
		

	}

}
