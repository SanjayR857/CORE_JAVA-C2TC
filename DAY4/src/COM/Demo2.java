package COM;
// to create object two or more and calling it 
public class Demo2 {
//instance variable
	int a;
	public static void main(String[] args) {
		//object creating
		Demo2 d1=new Demo2();
		Demo2 d2=new Demo2();
		//calling
		d1.a=24;
		System.out.println(d1.a);
		System.out.println(d2.a);
	}
}
