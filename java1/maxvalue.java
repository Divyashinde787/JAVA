package java1;

import java.util.Scanner;

public class maxvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("enter 1st no : ");
		int no1 = sc1.nextInt();
		
		System.out.print("enter 2nd no : ");
		int no2 = sc1.nextInt();
		
		System.out.print("enter 3rd no : ");       // 30>10 = 1st  <3rd 
		
		int no3 = sc1.nextInt();
		
		if((no1 == no2) ||(no1 == no3) || (no2 == no3))
		{
			System.out.println("--Number are equal--");
		}
		
		if((no1 > no2) && (no1 > no3)){
			System.out.println("1st number is greater than 2nd n 3rd  number : "+no1);
		}
		else if((no2>no1) && (no2>no3)) {
			System.out.println("2nd number is greater than 1st n 3rd  number : "+no1);		
		}	
		else if((no3>no1) && (no3>no2))
		{
			System.out.println("3rd number is greter than 1st n 2nd : "+no3);
		}
		else {
			System.out.println("non of the above");
		}

	}

}
