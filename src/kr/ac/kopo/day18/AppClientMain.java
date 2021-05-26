package kr.ac.kopo.day18;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class AppClientMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Socket socket = new Socket("localhost", 10000);
		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		String msg = dis.readUTF();
		System.out.println(msg);

		socket.close();

	}
}
