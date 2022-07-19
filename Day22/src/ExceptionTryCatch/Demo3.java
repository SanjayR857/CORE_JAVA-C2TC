package ExceptionTryCatch;

public class Demo3 {
public static void main(String[] args) {
	System.out.println("first");
	System.out.println("second");
	try {
		int [] MyArray =new int[] {1,2,3};
		print(MyArray);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("the array not have fourth element");
	}
	System.out.println("Third element");
}

private static void print(int[] arr) {
	// TODO Auto-generated method stub
	System.out.println(arr[3]);
	
}
}
/*
 first
second
the array not have fourth element
Third element
*/
