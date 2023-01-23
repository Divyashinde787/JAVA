package java1;

public class ArrayTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		
		int arr[][]= {{1, 2, 3},{4,5,6},{7,8,9}};
		
		for(i=0;i<3; i++) {
			for(j=0;j<3;j++) {
				System.out.print(" "+arr[i][j]);	
			}
			System.out.println("\n");
		}
		
		

	}

}
