package java1;
public class Add {
	
	public static void main(String[] args) {
		int b = 19, a=10;
			
		//Arithmetic operation;
		System.out.println(a + b);
		System.out.println(a - b); 
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);	
		
		//assignment operation;	 value will be updates as like a
		System.out.println(a += b);
		System.out.println(a -= b);
		System.out.println(a *= b);
		System.out.println(a /= b);
		System.out.println(a %= b);
		
		//relational operation;   ==, <=,>=,<,>
		System.out.println(a == b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		
		
		//logical operator; &&, ||, !   // only check  1st condition
		
		System.out.println(a>b && b>a);
		System.out.println(a>b || b>a);
		System.out.println(a != b);
		
		// bitwise operator check all condition if 1st condition is F then go to next condition
			
	}

}
