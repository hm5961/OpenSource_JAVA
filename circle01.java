package test2;

import java.util.Scanner;

public class circle01 {	
	
	public static void main(String num[])
	{
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		Scanner scanner1 = new Scanner(System.in);

		int x1 = scanner1.nextInt();
		int y1 = scanner1.nextInt();
		int r1 = scanner1.nextInt();

		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		Scanner scanner2 = new Scanner(System.in);

		int x2 = scanner1.nextInt();
		int y2 = scanner1.nextInt();
		int r2 = scanner1.nextInt();
	
		int x = x1 - x2;
		int y = y1 - y2;
		int r = r1 + r2;
		r *= r;
		int res = x*x + y*y;
		
		if( res >= r)
			System.out.print("�� ���� ��ġ�� �ʴ´�.");
		else
			System.out.print("�� ���� ���� ��ģ��.");
	}
}