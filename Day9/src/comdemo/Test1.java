package comdemo;
// in class 
public class Test1 {
	//public method
public void display1() {
	System.out.println("hello java");
}
//default method
void display2() {
	System.out.println("calling default method");
}
//private method
private void display3() {
	System.out.println("calling private method ");
}
//protected method
protected void display4() {
	System.out.println("calling protected method");
}
public static void main(String[] args) {
	//object creating
	Test1 t1=new Test1();
	//calling methods
	t1.display1();
	t1.display2();
	t1.display3();
	t1.display4();
	
}
}
/* output
  hello java
calling default method
calling private method 
calling protected method
*/