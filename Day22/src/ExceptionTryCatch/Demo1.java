package ExceptionTryCatch;

public class Demo1 {
public static void main(String[] args) {
	int x=10;
	int y=0;
	try {
		int z=x/y;
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
//java.lang.ArithmeticException: / by zero