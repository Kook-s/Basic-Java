package chapter06.car;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setSpeed(50);
		
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재속도: "+myCar.getSpeed());
		
	}

}
