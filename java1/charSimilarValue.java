package java1;

import java.util.Scanner;

public class charSimilarValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] arr=new char[10];
		char[] arr2=new char[10];
		int i=0,flag=0;
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter stored no : ");
		int val= sc.nextInt();
			
		for(i=0; i<val; i++) {
		arr[i] = sc.next().charAt(0);
		}
		for(i=0; i<val; i++) {
			System.out.print(" "+arr[i]+" ");
		}
		System.out.println("\n");
		
		for(i=0; i<val; i++) {
			arr2[i] = sc.next().charAt(0);
			}
			for(i=0; i<val; i++) {
				System.out.print(" "+arr2[i]+ " ");
			}
			System.out.println("\n");
			
			for(i=0; i<val; i++) {
				if(arr[i]==arr2[i]) {
					 flag++;       // 1 2 		
				}
			}
			if(flag==3) {
	System.out.println("array value same");
	}
	else {
	System.out.println("array are diff");
	}				
}}
