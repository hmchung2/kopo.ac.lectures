package kr.ac.kopo.day18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMain {

	public static void main(String[] args) throws Exception {
		String msg;
		ServerSocket server = new ServerSocket(10001);
		System.out.println("EchoServer 실행시작.....");
		Socket client = server.accept();

		System.out.println("접속한 클라이언트 정보 : " + client.getInetAddress().getHostAddress());

		// 클라이언트에서 전송한 데이터를 수신 객체
		InputStream is = client.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		// 수신한 데이터를 클라이언트에 재전송할 객체
		OutputStream os = client.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		PrintWriter pw = new PrintWriter(osw);

		while (true) {
			msg = br.readLine();
			if (msg == null) {
				System.out.println("서버를 종료 합니다.");
				client.close();
				server.close();

				System.exit(0);
			}
			System.out.println("클라이언트가 보낸 메시지  : " + msg);
			pw.println("메시지 잘 받았습니다.");
			pw.flush();

		}
	}
}
