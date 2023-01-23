package java1;

import java.util.Scanner;

public class ArrayDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter numbers to stored  : ");  //5
		int no = sc.nextInt();  
		
		System.out.println("enter elements of array : "); 
		int[] n1= new int[10];
		
		for(int i=0; i<no; i++) {
			n1[i] = sc.nextInt();	
		}
		System.out.print("elements are : ");
		for(int i=0; i<no; i++) {
			System.out.print(" "+n1[i]);	
			}
		System.out.print(" \n");	
		
while(true)	{	
		System.out.println("1. div by two");
		System.out.println("2. div by five");
		System.out.println("3. exits");
	System.out.println("enter your ch: ");
	
	int cnt=0;
	int ch=sc.nextInt();
switch(ch) {
case 1 :System.out.println("divisible by 2 : ");
		for(int i=0; i<no; i++) {
		if(n1[i]%2 ==0) {
		System.out.println(" "+n1[i]);
		cnt++;
		}
		}
		System.out.println("count "+cnt);
		break;
		
case 2 :System.out.println("divisible by 5 : ");
	for(int i=0; i<no; i++) {
	if(n1[i]%5 ==0) {
	System.out.println(""+n1[i]);
	cnt++;
	}
	}System.out.println("count "+cnt);
	break;

case 3: return;

default: System.out.println("none");
		
	}	
	}
	}
}
