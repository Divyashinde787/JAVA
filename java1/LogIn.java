package java1;

import java.util.Scanner;

public class LogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String Uname;
		String password;
		for(int i=0; i<3;i++) {

		System.out.println("enter username: ");     //admin
		 Uname = sc.nextLine();
		
		System.out.println("enter password: ");      //admin123
		password = sc.nextLine();		
		
//		if(Uname.equals("admin") && password.equals("admin123")) {
//			System.out.println("login succes");
//			break;
//		}
//		else {	
//			System.out.println("invalid");
//		}
	
		if(Uname=="admin" && password == "admin123") {
			System.out.println("login succes");
			break;
		}else {
			System.out.println("invalid");
		}
		
		}	
	}
}

