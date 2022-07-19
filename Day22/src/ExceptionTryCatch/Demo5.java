package ExceptionTryCatch;

import java.io.FileInputStream;

public class Demo5 {
public static void main(String[] args) {
	Demo5 d=new Demo5();
	d.checkFileNotFound();
}

private void checkFileNotFound() {
	try {
		FileInputStream In=new FileInputStream("input.tex");
		System.out.println("input not found");
	}
	catch(Exception e) {
		System.out.println(e+"FileNotFound in class");
	}
	
}
}
//java.io.FileNotFoundException: input.tex
//(The system cannot find the file specified)FileNotFound in class