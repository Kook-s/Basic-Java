package chapter09;

public class Anonymous {
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("Tv를 켭니다");
		}

		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("Tv를 끕니다");
		}
	};

	void method() {
	}
}
