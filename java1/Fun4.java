package java1;

import java.util.Scanner;

class area{
	int l1;
	int w1;

	void view() {
	System.out.println("area of ractangle : "+l1*w1);	}	
}

public class Fun4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area s1 = new area();
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter lenght : ");
		s1.l1 = sc.nextInt();
		System.out.print("enter width : ");
		s1.w1= sc.nextInt();
		
		//s1.areaRact(l,w);
		s1.view();
		
		System.out.println("continoue ");
		int ch = sc.nextInt();
		if(ch==0) {
			return;
		}
	
		
	}
}
}