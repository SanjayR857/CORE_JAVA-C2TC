import java.util.Scanner;

public class ForLoopSnippet1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//number of loop
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		char ch='A';
		for(int j=1;j<=i;j++) {
			System.out.print(ch++);
		}
		System.out.println();
	}
	
}
}
/*
4
A
AB
ABC
ABCD
*/