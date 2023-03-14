package chapter07.cellphone;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String modle,String color, int channel) {
		this.modle = modle;
		this.color = color;
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 DMB 방송 수신을 시작합니다.");		
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널 "+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
