package java1;

import java.util.Scanner;

public class PositiveNo {

		public static void main(String[] args) {
			 
			Scanner input1 = new Scanner(System.in);
			
			System.out.println("enter Number : ");
			int no = input1.nextInt();
			
			if(no > 0)
			{
				System.out.println("NUMBER IS  POSITIVE : "+no);
			}
			else if(no == 0)
			{
				System.out.println("NUMBER IS ZERO : "+no);
			}
			else {
				System.out.println("NUMBER IS NIGAVTIVE : "+no);
			}
			
		}
}
