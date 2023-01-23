package java1;
//hybrid  :combination of single and mutiple but multiple not support java 

class a{
	int  roll = 2;
}
class b extends a{
	int roll =5;
}
class c extends a{
	void view() {
		System.out.println("class c extends b : " +roll);
	}
}
class d extends b{
	void view() {
		System.out.println("class d extends c : " +roll);
	}
}
//class d extends c{
//	void view() {
//		System.out.println("class d extends c : " +roll);
//	}

public class inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj2 = new c();
		d obj3 = new d();
		
		obj2.view();
		obj3.view();
	}
}
