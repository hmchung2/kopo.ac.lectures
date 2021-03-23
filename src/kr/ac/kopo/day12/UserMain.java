package kr.ac.kopo.day12;
import java.util.ArrayList;
import java.util.List;

public class UserMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		
		TV tv = new SamsungTV();
//		TV tv = new LGTV();
		
		tv.powerOn();
		tv.channelDown();
		tv.soundUp();
		tv.channelUp();
		tv.soundDown();
		tv.mute();
		tv.mute();
		tv.mute();
		tv.soundUp();
		tv.mute();
		tv.powerOff();
		
		SamsungTV sam = (SamsungTV) tv;
		sam.test();
		
	
	}
}
