package methodOverRiding;

import methodOverRiding.Bank.*;

public class User {
public static void main(String[] args) {
	Axis a=new Axis();
	SBI s=new SBI();
	CICI c=new CICI();
	System.out.println("Axis bank interest is "+a.getinterest());
	System.out.println("sbi bank interest is "+s.getinterest());
	System.out.println("CICI bank interest is "+c.getinterest());
}
}
