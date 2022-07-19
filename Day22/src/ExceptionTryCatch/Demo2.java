package ExceptionTryCatch;
import java.util.*;
public class Demo2 {
public static void main(String[] args) {
	int x=20;
	int y=0;
	try {
		int z=x/y;
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
