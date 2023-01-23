package java1;
import java.util.Scanner;

public class array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter string 1: ");
		String str1= sc.nextLine();
		
	//	System.out.println("enter string 2: ");
		//String str2= sc.nextLine();
		
//	if(str1.equals(str2))
//	{
//		System.out.println("equals");
//	}
//	else {
//		System.out.println("not equals");
//	}
	//total string mtd: 28
	/*System.out.println(str1.length());
	System.out.println(str1.toUpperCase()); 
	System.out.println(str1.toLowerCase());
	System.out.println(str2.charAt(3));        //give index
	System.out.println(str1.indexOf("i"));      //position
	System.out.println(str1.concat(str2));
	System.out.println(str1.trim()); */
	
	System.out.println(str1.replaceFirst("khan", "puja"));
	//System.out.println(str1.compareTo(str2));
	System.out.println(str1);
	//System.out.println(str2);
	System.out.println(str1.subSequence(5, 12));
	System.out.println();

	
	}
}