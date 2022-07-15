package methodOverRiding;

public class Bank {
int getinterest() {
	return 0;
}
 class Axis extends Bank{
	int getinterest() {
		return 8;
	}
}
 class SBI extends Bank{
		int getinterest() {
			return 9;
		}
	}
}
class CICI extends Bank{
	int getinterest() {
			return 7;
		}
	}

