package java1;
	import java.util.Scanner;

	public class ArrayExmp2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.print("enter numbers to stored  : ");  //5
			int no = sc.nextInt();  
			
			System.out.println("enter elements of array : "); // 1, 2, 3, 4, 5
			int[] arr = new int[10];            
			
			for(int i=0; i<no; i++)  
			{  
			arr[i] = sc.nextInt();		
			}	
			for(int i=0; i<no; i++)  
			{  
			System.out.println(arr[i]);
			}
		}

	}
