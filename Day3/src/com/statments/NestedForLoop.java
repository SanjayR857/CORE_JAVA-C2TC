package com.statments;

public class NestedForLoop {
public static void main(String[] args) {
	for(int i=0;i<=3;i++) {
		for(int j=1;j<=3;j++) {
			System.out.println(i+" "+j);
		}
	}
}
}
/*output
0 1
0 2
0 3
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3*/
