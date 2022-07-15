package methodOverLoading;

public class Demo1 {
	public int  method(int a,int b) {
		return (a+b);
	}
	public int method(int a,int b,int c) {
		return (a+b+c);
	}
public static void main(String[] args) {
	Demo1 d=new Demo1();
	System.out.println(d.method(4, 9));
	System.out.println(d.method(3, 4, 10));
}
}
//output
//13
//17