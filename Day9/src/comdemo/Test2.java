package comdemo;
//in package
public class Test2 {
	
   public static void main(String[] args) {
	   //calling method
	Test1 t2=new Test1();
     t2.display1();
     t2.display2();
     t2.display4();
    // t1.display3();private method is not accessed
    
}
}
/* output
 hello java
calling default method 
calling protected method
*/