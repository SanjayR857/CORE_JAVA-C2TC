package Exception;

public class Demo1 {
public static void main(String[] args) {
	int x=10;
	int y=0;
	System.out.println("Welcome");
	int z=x/y;//error
	System.out.println(z);
}
}
/*
Welocme
Exception in thread "main" java.lang.ArithmeticException: / by zero
at Exception.Demo1.main(Demo1.java:8)
*/