package chapter06;

public class Car {
	int gas;
	int speed;

	int getSpeed() {
		return speed;
	}

	void keyTurnOn() {
		System.out.println("\n키를 돌립니다.");
	}

	void setGas(int gas) {

		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}

	void run() {
		
		for (int i = 10; i <= 50; i += 10) {
			speed = i;
			System.out.println("달립니다.(시속:" + speed + "km/h)");

		}

		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량" + gas + ")");
				return;
			}
		}
	}
}

//public class Car {
//	int speed;
//
//	int getSpeed() {
//		return speed;
//	}
//
//	void keyTurnOn() {
//		System.out.println("키를 돌립니다.");
//	}
//
//	void run() {
//		for (int i = 10; i <= 50; i += 10) {
//			speed = i;
//			System.out.println("달립니다.(시속:" + speed + "km/h)");
//
//		}
//
//	}
//}
