package assignment0315;

import java.util.Scanner;

/*
 * ������ �Ӱ���� ���̴� ���α׷��� �ۼ��Ͻÿ�
 *  ���̽�ũ�� � �����Ҳ��� ? : 4(�Է�)
 *  *** 1��° ���̽�ũ�� �������� �Է� ***
 *  ���̽�ũ���� : ����(�Է�)
 *  ���̽�ũ�� ���� : 800 (�Է�)
 *  
 *  *** 2��° ���̽�ũ�� �������� �Է� ***
 *  ���̽�ũ���� : �����(�Է�)
 *  ���̽�ũ�� ���� : 1500 (�Է�)
 *  
 *   *** 3��° ���̽�ũ�� �������� �Է� ***
 *  ���̽�ũ���� : ������(�Է�)
 *  ���̽�ũ�� ���� : 2000 (�Է�)
 *  
 *   *** 4��° ���̽�ũ�� �������� �Է� ***
 *  ���̽�ũ���� : �޷γ�(�Է�)
 *  ���̽�ũ�� ���� : 800 (�Է�)
 *  
 *  <�� 4���� ���̽�ũ�� �������� ���>
 *  ��ȣ ���̽�ũ���� ���̽�ũ������
 *  1    ����     800
 *  2    �����   1500
 *  3    ������     2000
 *  4    �޷γ�     800
 *  
 *  
 */

public class Assignment0315Q1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int len = 2;
		IceCream[] iceArrCreams = new IceCream[len];

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String name;
		int price;
		for (int i = 0; i < len; i++) {
			iceArrCreams[i] = new IceCream();
			System.out.print("���̽�ũ���� : ");
			name = sc.next();
			System.out.print("���̽�ũ�� ���� : ");
			price = sc2.nextInt();
			iceArrCreams[i].name = name;
			iceArrCreams[i].price = price;

		}
	
		System.out.println("<�� 4���� ���̽�ũ�� �������� ���>");
		System.out.printf("%1s%15s%10s", "��ȣ", "���̽�ũ����", "����");

		System.out.println();
		for (int i = 0; i < iceArrCreams.length; i++) {
			System.out.printf("%d", i + 1);
			System.out.printf("%15s", iceArrCreams[i].name );
			System.out.printf("%15d" , iceArrCreams[i].price);
			System.out.println();
		}
	}
}

class IceCream {
	String name;
	int price;
}
