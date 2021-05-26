package kr.ac.kopo.day18;

import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) throws Exception {

		URL urlObj = new URL(
				"https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=java");

		System.out.println("프로토콜 : " + urlObj.getProtocol());
		System.out.println("호스트명 : " + urlObj.getHost());
		System.out.println("포트 : " + urlObj.getPort());
		System.out.println("경로 :  " + urlObj.getPath());
		System.out.println("쿼리 : " + urlObj.getQuery());

		System.out.println("================================================");
		InputStream is = urlObj.openStream();
		InputStreamReader isr = new InputStreamReader(is, "utf-8");
		FileWriter fw = new FileWriter("iodata/url.txt");

		while (true) {
			int c = isr.read();
			if (c == -1)
				break;
			fw.write(c);
		}
		System.out.println("================================================");

// 여기 connection 에서 getInputStream 을 통한 스트림도 위 인풋스트림과 동일 하다.
//		URLConnection uc = urlObj.openConnection();
//		OutputStream os = uc.getOutputStream();
//		OutputStreamWriter ow = new OutputStreamWriter(os);

	}
}
