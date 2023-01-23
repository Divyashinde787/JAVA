package java1;

class newClass1{
	newClass1(){
		System.out.println("i am constructor");
	}
	newClass1(int a){
		System.out.println(a);
	}
}

public class Constructorss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newClass1 obj = new newClass1();
		newClass1 obj2 = new newClass1(90);	
		

	}

}
