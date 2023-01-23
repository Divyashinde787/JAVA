package java1;

import java.util.Scanner;

public class ArrayExmp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter numbers to stored  : ");  //5
		int no1 = sc.nextInt();
		
	//	System.out.println("enter name of student : ");
		char[] name= new char[10];
		
//		for(char i=0; i<no1; i++) {
//			name[i] =sc.next().charAt(0);		
//		}
//		for(char i=0; i<no1; i++) {
//		System.out.println("name of students are : "+name[i]);	
		System.out.println("1. insert");
		System.out.println("2. display");
		System.out.println("3. ");
		int ch=sc.nextInt();	
	
	switch(ch) {	
		case 1:
			System.out.println("enter name of student : ");
			 name= new char[10];
			for(char i=0; i<no1; i++) {
		 name[i] =sc.next().charAt(0);}
			
		case 2: for(char i=0; i<no1; i++) {
			System.out.println("name of students are : "+name[i]);	
		}
	}}

}
