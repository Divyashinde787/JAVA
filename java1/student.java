package java1;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * name
		 * 6 subject  mark input
		 * calculate percentage
		 * fail class, pass class, 2nd class, 1st class,  distiction
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name of student : ");
		String name=sc.nextLine();
		
		System.out.print("enter marks maths : ");
		int math = sc.nextInt();
		System.out.print("enter marks m1 : ");
		int m1 = sc.nextInt();
		System.out.print("enter marks m2  : ");
		int m2 = sc.nextInt();
		System.out.print("enter marks m3 : ");
		int m3 = sc.nextInt();
		System.out.print("enter marks da : ");
		int da = sc.nextInt();
		System.out.print("enter marks ds  : ");
		int ds = sc.nextInt();
		
		int per = ((math + m1 + m2+m3+da+ds)/6);
		System.out.println("percentage  : "+per);
		
	
		if(math <40 || m1<40 || m2<40 || m3<40 || da<40 || ds<40) {
			System.out.println("if one sub is back all result is down");
		}	
		
		else if(per >= 75) {
			System.out.println(" distiction");
		}
		else if(per >= 60) {
			System.out.println("1st class");
		}
		else if(per >= 50){
			System.out.println("2nd class");
		}
		else if (per >= 40){
			System.out.println("only pass");		
		}
		else {
			System.out.println("fail");
		}
	}

}
