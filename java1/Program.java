package java1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("start char no : ");
		char alpha1 = sc.next().charAt(0);
		System.out.print("end char no : ");
		char alpha2 = sc.next().charAt(0);
		
		for(char i=alpha1; i<=alpha2; i++)
		{
			System.out.print(" "+i+" ");
		}
		System.out.print("\n ");
	//int j=0;
   while(true)
   		{
	   System.out.print("\n ");
		System.out.println("1.Vowels");
		System.out.println("2.Constants");
		System.out.println("3.Exit");
		System.out.print("enter your chice: ");
   		
		   int ch=sc.nextInt();
			switch(ch) {	
			case 1 :	
				System.out.println("Vowels : ");
					for(char i=alpha1; i<=alpha2; i++)
					{	
						if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
							System.out.print(" "+i);
					}}
								break;
			case 2 :
				
				System.out.println(" Constant ");
					for(char i=alpha1; i<=alpha2; i++)
					{	
						if(i !='a' && i != 'e' && i != 'i' && i != 'o' && i != 'u') {
							System.out.print(" "+i);
					}
						}
							break;
	/*		case 3 : System.out.print("start int no : ");
					int n1= sc.nextInt();
					System.out.print("end int no : ");
					int n2= sc.nextInt();
				System.out.println(" Numbers ");
						for( int i=n1; i<=n2; i++)
						{	
							if(i >=0 && i<=9) {
								System.out.print(" "+i);
						}}
								break;	*/	
			case 3:return;
			
			default : System.out.println(" none of the above ");
	}
   	}
   }
}