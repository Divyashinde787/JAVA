package java1;


public class Fun {

	static int fun1(int x,int y) {            //def fun
		
		return x+y;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=5,c=12,d=50,e,f;
		
		System.out.println("i am main mtd ");
		
		e= fun1(a,b);
		System.out.println("addition : "+e);

		
		f= fun1(c,d);            //call function
		System.out.println("addition : "+f);
		
		System.out.println(fun1(e,f));     
	}
	
	

}
