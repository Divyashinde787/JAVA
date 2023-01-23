package java1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number : ");
		int srt= sc.nextInt();
		System.out.println("enter end number : ");
		int end= sc.nextInt();
		
		System.out.print("even : ");
		for(int i=srt; i<end; i++) {	
			
			if(i%2 == 0)
			{
				System.out.print (" "+i+ " ");
			}		
			}
		System.out.print("\n");
		System.out.print("odd : ");
		
			for(int j=srt; j<end; j++) {
				if(j%2 != 0)
			 {
				System.out.print(" "+j+ " ");
			}
			
		}	
			
		}
	}

