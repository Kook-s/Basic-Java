package chapter08.myclass;

import chapter08.television.Audio;
import chapter08.television.RemoteControl;
import chapter08.television.Television;

public class MyClass {
	RemoteControl rc = new Television();

	MyClass() {
	}

	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
	}

	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}

	void methodB(RemoteControl rc) {

		rc.turnOn();
		rc.setVolume(5);
	}
}
