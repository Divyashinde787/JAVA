package java1;
class newClass{
	String name;
	int RollNo;
	int per;
	
	public void add(String x,int y,int z) {
		name=x;
		RollNo=y; 
		per = z;
	}
	public void view() {
	System.out.println("name : "+name+" roll no : "+RollNo+" pers : "+per);}
}


public class Fun3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newClass s1 = new newClass();
		newClass s2 = new newClass();
				
		s1.add("divya",4,70);
		s2.add("puja",8,70);

		s1.view();
		s2.view();
 
	}

}
