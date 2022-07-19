package ExceptionTryCatch;

public class Demo7 {

public static void main(String[] args) {
	try {
		int data=30/3;
		System.out.println(data);
	}
	catch(NullPointerException e) {
		System.out.println("Exception "+e);
	}
	finally{
		System.out.println("finaaly block always executed ");
	}
}
}
/*
10
finaaly block always executed 
*/