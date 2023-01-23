package java1;

import java.util.Scanner;

public class Fun2 {
	static int add(int a, int b) {
		return a+b;
	}
	static int sub(int a, int b) {
		return a-b;}
	static int div(int a, int b) {
		return a/b;}
	
	static void evenodd(int a) {
		if(a%2==0) {
			System.out.println("even no : "+a);
		}else {
			System.out.println("odd no :"+a);
		}
	}
	static void series(int a) {
		int i=0;
		System.out.print("even no : ");
		for(i=1; i<=a; i++) {
			if(i%2==0) {
				System.out.print(" "+i+" ");
			}
		}
		System.out.println("\n");
			System.out.print("odd no : ");
			for(i=1; i<=a; i++) {
			if(i%2!=0) {
				System.out.print(" "+i+" ");
			}
		}	
	}
	
	static void tables(int a)
	{
		int i=0;
		for(i=1; i<=a; i++) {             
			for(int j=1; j<=a; j++)
			
				System.out.print(j*i+"\t");
			System.out.print("\n ");
			}
		System.out.print("\n ");	
		}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter 1st value : ");
		int x=sc.nextInt();
		System.out.print("enter 2nd value : ");
		int y=sc.nextInt();
		
		while(true) {
			System.out.println("\n");
		System.out.println("1.addition ");
		System.out.println("2.Substraction ");
		System.out.println("3.division ");
		System.out.println("4.eve odd ");
		System.out.println("5.print serires ");
		System.out.println("6.tables");

		
		System.out.println("enter your choice : ");
		
		int ch=sc.nextInt();
		if(ch==1) { int j=add(x,y);
				System.out.print("addition is : "+j);
		}
		if(ch==2) {sub(x,y);
				System.out.print("substraction is : "+(x-y));
		}	
		if(ch==3) { div(x,y);
				System.out.print("division is : "+(x/y));
		}
		if(ch==4) {
			evenodd(x);
		}
		if(ch==5) {
			series(x);
		}
		if(ch==6) {
			tables(x);
		}

		
		}
		}

	}
