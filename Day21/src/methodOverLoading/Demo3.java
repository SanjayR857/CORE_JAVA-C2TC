package methodOverLoading;

public class Demo3 {
	public void method(int a,int b) {
		System.out.println("call a and b");
	}
	public void method(int b,int a) {
		System.out.println("call b and a");
	}
public static void main(String[] args) {
	Demo3 obj=new Demo3();
	obj.method(3,6);
	
}
}
//error