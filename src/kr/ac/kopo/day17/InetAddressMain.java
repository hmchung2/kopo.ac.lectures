package kr.ac.kopo.day17;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {

	public static void main(String[] args) {
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println("로컬호스트 : " + localhost.getHostName());
			System.out.println("로컬호스트 : " + localhost.getHostAddress());
			System.out.println("로컬호스트 : " + localhost);

			InetAddress addr = InetAddress.getByName("www.hanati.co.kr");
			System.out.println("하나금융티아이 : " + addr);

			InetAddress[] addrs = InetAddress.getAllByName("www.naver.com");
			System.out.println("-----------네이버 아이피 주소----------");
			for (InetAddress address : addrs) {
				System.out.println(address);
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
