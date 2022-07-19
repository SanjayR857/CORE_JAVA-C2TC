package ExceptionTryCatch;

public class Demo6 {
	public static void main(String[] args) {
		
Demo6 d=new Demo6();
try {
	d.method1();
}
catch(ArithmeticException e) {
	System.out.println("ArithmeticException thrown by method1() method is caught in main()method");
}
	}
private void method1() {
	// TODO Auto-generated method stub
	try {
		System.out.println(100/0);
	}
	catch(NullPointerException nullpoint) {
		System.out.println("nullpointerException"+nullpoint);
	}
	System.out.println("we have an exception");
	
}

}
//ArithmeticException thrown by method1() method is caught in main()method