package FinalKeyword;

public class Finalmethod {
final void run() {
	System.out.println("bike is running");
}
}
class Honda extends Finalmethod{
	/*void run() {
		System.out.println("Honda bike running faster");error
	}*/
	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();
	}
}
