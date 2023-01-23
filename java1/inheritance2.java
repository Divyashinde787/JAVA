package java1;
//Multilevel : sun inherits property of father class & father class inherits some property of grandfather class
class animals{
		String name ="bmw";
}

class dog1 extends animals{
	void view1(){
		
System.out.println("dog class 1 : " +name);
}
}
class dog2 extends dog1{
	void view(){
		String name ="Activa";
	System.out.println("dog class 2 "+name);
}
}
public class inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dog1 obj1 = new dog1();
		dog2 obj2 = new dog2();
	
		obj2.view();
		obj2.view1();
		
	}

}
