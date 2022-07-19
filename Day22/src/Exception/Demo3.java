package Exception;

public class Demo3 {
public static void main(String[] args) {
	System.out.println("First");
	System.out.println("Second");
	int [] MyArray=new int[]{1,2,3};
	print(MyArray);
	System.out.println("thrid line");
}
//exception
private static void print(int[] arr) {
	System.out.println(arr[3]);
	System.out.println("Fourth is displayed");
	
}
}
/*
First
second
Exception
*/