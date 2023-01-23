package java1;
//single inheritance
class Animal{    
	
	String name="brownie";
}
class dog extends Animal{
//class derived extends base
	void view() {
	System.out.println(name);
	}
}
public class fun5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog obj =  new dog();
		
		
		obj.view();
		
	}

}
