package java1;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter number of student  : ");  //3
		int no = sc.nextInt(); 
		
		int[] rollNo= new int[10];
		String[] name= new String[10];
		int[] per= new int[10];
		int no1=0;
		int count=0;
		int i=0;
		
while(true)	{	
		System.out.println("1. insert");
		System.out.println("2. display");
		System.out.println("3. count");
		System.out.println("4. update");
		System.out.println("5. Search");
		System.out.println("6. Exits");
		System.out.println("enter your ch: ");
			
		int ch=sc.nextInt();	
	
switch(ch) {
	  case 1:	
		 
			for(i=0; i<no; i++) {
				 System.out.println("enter Student Roll NO : ");
				rollNo[i]=sc.nextInt();
				System.out.println("enter Student name : ");
				name[i] = sc.next();
				System.out.println("enter Student per : ");
				per[i] = sc.nextInt();
				count++;
				}
			break;
			
	  case 2: 
		  System.out.println("students information  are : ");
		  for(i=0; i<no; i++) {
		  System.out.print("Roll Number : "+rollNo[i]+"\n ");
		  System.out.print(" Name : "+name[i]);
		  System.out.println("\n"+"percentage is : "+per[i]);
		  }
	    	System.out.print(" \n");	
			break;
			
	  case 3:	System.out.println("total numbers of student are : "+count);
	  			break;

		case 4:
			System.out.print("which student data you want to update enter roll no: : ");  //2
				no1 = sc.nextInt();      
				
			for(i=0; i<=no; i++) {
			if(no1==rollNo[i]) {
			System.out.println("Student Roll NO : ");
			rollNo[i]=sc.nextInt();
			System.out.println("Student name : ");
			name[i] = sc.next();
			System.out.println("Student per : ");
			per[i] = sc.nextInt();
				}
			}
		break;	
		case 5: System.out.print("Search student data enter roll no : ");  //2
				no1 = sc.nextInt();      
		
				for(i=0; i<no; i++) {
					if(no1==rollNo[i]) {
			System.out.print("Roll Number : "+rollNo[i]+"\n ");
			  System.out.print(" Name : "+name[i]);
			  System.out.println("\n"+"percentage is : "+per[i]);
			
		}
				}
				
		case 6: return;
		default: System.out.println("none of the above");
		
		}	
	
	}

}}
