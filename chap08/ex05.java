package chap8;

import java.io.*;

public class ex05 {
	public static void main(String[] args) {
		byte b[] = { 7, 51, 3, 4, -1, 24 };
		try {
			FileOutputStream fout = new FileOutputStream("D:\\eclipse\\chap8\\src\\chap8\\test.out");
			for (int i = 0; i < b.length; i++)
				fout.write(b[i]); // �迭 b�� ���̳ʸ��� �״�� ���
			fout.close();
		} catch (IOException e) {
			System.out.println("D:\\eclipse\\chap8\\src\\chap8\\test.out�� ������ ���������ϴ�. ��θ��� Ȯ���� �ּ���");
			return;
		}
		System.out.println("D:\\eclipse\\chap8\\src\\chap8\\test.out�� �����Ͽ����ϴ�.");
	}

}
