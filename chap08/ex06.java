package chap8;

import java.io.*;

public class ex06 {
	public static void main(String[] args) {
		byte b[] = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("D:\\eclipse\\chap8\\src\\chap8\\test.out");
			int n = 0, c;
			while ((c = fin.read()) != -1) {
				b[n] = (byte) c;
				n++;
			}
			System.out.println("D:\\eclipse\\chap8\\src\\chap8\\test.out���� ���� �迭�� ����մϴ�.");
			for (int i = 0; i < b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
		} catch (IOException e) {
			System.out.println("D:\\eclipse\\chap8\\src\\chap8\\test.out���� ���� ���߽��ϴ�. ��θ��� üũ�غ�����");
		}
	}
}
