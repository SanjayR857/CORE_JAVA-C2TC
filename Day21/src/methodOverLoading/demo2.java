package methodOverLoading;

public class demo2 {
	public void display(int a,int b) {
		System.out.println("int data type");
	}
	public void display(double a,double b) {
		System.out.println("double data type");
	}
	
public static void main(String[] args) {
	demo2 d=new demo2();
	d.display(3.4, 3.3);
	d.display(34, 3);
}
}
/*
double data type
int data type
*/