package kr.ac.kopo.day12;

public class LGTV {

	private boolean power;
	private int channelNo;
	private int volumeSize;

	public LGTV() {
		System.out.println("you just bought LG tv.");
		power = false;
		channelNo = 3;
		volumeSize = 6;
	}

	public void powerOn() {
		System.out.println("power on");
		power = true;
	}

	public void powerOff() {
		System.out.println("power down");
	}

	public void channelUP() {
		System.out.println("channel up");
	}

	public void channelDown() {
		System.out.println("channel down");
	}

	public void volumeUp() {
		System.out.println("volume up");
	}

	public void volumeDown() {
		System.out.println("volume down");
	}
}
