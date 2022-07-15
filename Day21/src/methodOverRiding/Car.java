package methodOverRiding;

public class Car {
void run() {
	System.out.println("Car running safely");
}
public class Bike extends Car{
	@Override
	void run() {
		System.out.println("Bike running safely");
	}
	public static void main(String[] args) {
	 Bike B=new Bike();
		B.run();
	}
}
}
