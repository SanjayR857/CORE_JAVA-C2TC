package ExceptionTryCatch;

public class Demo4 {
public static void main(String[] args) {
	try {
		int [] arr= {1,2,3,4};
		System.out.println(arr[5]);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
