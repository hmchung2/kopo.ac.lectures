package kr.ac.kopo.day12;

public interface TV {

	/* public static final */ int MAX_VOLUME_SIZE = 50;
	int MIN_VOLUME_SIZE = 0;
	
	/* public abstract */ void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void soundUp();
	void soundDown();
	void mute();
	
	default void copyright() {
		System.out.println("모든 기술은 구현 됩니다.");
	}
	
}