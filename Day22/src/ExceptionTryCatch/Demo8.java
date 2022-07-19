package ExceptionTryCatch;

public class Demo8 {
public static void main(String[] args) {
	try {
		int num=200/0;
		System.out.print(num);
	}
	catch(Exception e) {
		System.out.println("number is not divide by zero");
	}
	finally {
		System.out.println("Finally block");
	}
	System.out.println(" after trycatch method and finaaly");
}
}
