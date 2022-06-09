package comdemo2;

import comdemo.Test1;

// outside package with inher

public class Test3 extends Test1 {
public static void main(String[] args) {
	Test1 t3=new Test1();
	t3.display1();
	t3.display4();
}
}
/* output
hello java 
calling protected method
*/