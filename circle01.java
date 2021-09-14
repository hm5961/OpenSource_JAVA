package test2;

import java.util.Scanner;

public class circle01 {	
	
	public static void main(String num[])
	{
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		Scanner scanner1 = new Scanner(System.in);

		int x1 = scanner1.nextInt();
		int y1 = scanner1.nextInt();
		int r1 = scanner1.nextInt();

		System.out.print("두번째 원의 중심과 반지름 입력>>");
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
			System.out.print("두 원은 겹치지 않는다.");
		else
			System.out.print("두 원은 서로 겹친다.");
	}
}