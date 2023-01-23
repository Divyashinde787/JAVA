package java1;

import java.util.Scanner;

public class electricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter units");
		int units = sc.nextInt();
				
		int cal =0;
		
		
		if(units>=200) {
			cal= ((100*8)+(100*10) +(units-200)*12);
			System.out.println("add is : "+cal);			
		}
		else if(units >= 100) {
			cal = 100*8;
			//System.out.println("mul by 8 : "+cal);
			int b1= units-100;
			//System.out.println(" b1 : "+b1);
			int b2=  b1*10;
			//System.out.println("mul by 10 : "+b2);
			int add = cal+b2;
			System.out.println("add : "+add);
			
		}
		else {
			cal= units*8;
			System.out.println("units are bellow 100 : "+cal);
		}
	
	}
  }  // 110 = 100*8  , 10*10
