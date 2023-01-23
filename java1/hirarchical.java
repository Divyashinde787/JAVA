package java1;

//hirarcical : one base class can inherits multiple derived class

class animal2{
	String name= "belacow";
	
}
class dogs1 extends animal2{
	void view() {
		System.out.println("dog class 1 : " +name);
	}
}
class dogs2 extends animal2{
	void view() {
		System.out.println("dog class 2 : " +name);
	}
}
class dogs3 extends animal2{
	void view() {
		System.out.println("dog class 3 : " +name);
	}
}
public class hirarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dogs1 obj1 = new dogs1();
		dogs2 obj2 = new dogs2();
		dogs3 obj3 = new dogs3();
	
		obj1.view();
		obj2.view();
		obj3.view();

	}

}
