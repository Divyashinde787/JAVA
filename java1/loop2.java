package java1;

import java.util.Scanner;

public class loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no : ");
		int no = sc.nextInt();    //2
		
		int i=1;
			
			while(i<=10) {
			System.out.println(""+i*no);
			i++;
		}

	}

}
