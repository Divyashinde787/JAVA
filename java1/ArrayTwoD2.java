package java1;

import java.util.Scanner;

public class ArrayTwoD2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			int[] arr = new int[10];
			int limit, count=0, no,cnt=0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the limit : ");
			limit =sc.nextInt();
			
			for(int i=0; i<limit; i++) {
			arr[i]=sc.nextInt();
			
			}
			for(int i=0; i<limit; i++) {
				System.out.println(arr[i]);
				}
			System.out.println("enter the repeated value : ");
			no =sc.nextInt();
			for(int i=0; i<limit; i++) {
				if(no==arr[i]) {
				count++;
				}
			}	System.out.println("count of similar number: "+count);
			
			
			
			for(int i=0; i<limit; i++) {  //1  1  1  8  0 
				                          //0  1  2  3  4
				if(arr[i]==arr[i+1]) {
				cnt++;                   //1  1   1  
				}
			}	System.out.println("count of similar number: "+cnt);
		}


}
