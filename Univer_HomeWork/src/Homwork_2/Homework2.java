package Homwork_2;
class GasolineCar {
	private int gasolineGauge;

	public GasolineCar(int gasolineGauge) {
		this.gasolineGauge = gasolineGauge;
	}

	public void showGasolineGauge() {
		System.out.println("가솔린 양: " + gasolineGauge);
	}
}

class ElectricCar extends GasolineCar {
	private int electricGauge;

	public ElectricCar(int electricGauge, int gasolineGauge) {
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}

	public void showElectricGauge() {
		System.out.println("전기 양: " + electricGauge);
	}
}

class WaterCar extends ElectricCar {
	private int waterGauge;

	public WaterCar(int gasolineGauge, int electricGauge, int waterGauge) {
		super(electricGauge, gasolineGauge);
		this.waterGauge = waterGauge;
	}

	public void showCurrentGauge() {
		showGasolineGauge();
		showElectricGauge();
		System.out.println("물 양: " + waterGauge);
	}
}

public class Homework2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterCar car = new WaterCar(5, 3, 2);
		car.showCurrentGauge();
	}
}
