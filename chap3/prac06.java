package chap3;

import java.util.Scanner;

public class prac06 {

	public static void main(String num[])
	{
		System.out.print("�ݾ��� �Է��Ͻÿ� >>");
		Scanner scanner = new Scanner(System.in);
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int i = scanner.nextInt();
		
		for( int p = 0; p <= 7; p++ )
		{
			if( i / unit[p] != 0 )
				System.out.println( unit[p] + "�� ¥�� : " + i / unit[p] + "��");
			i -= (i / unit[p])*unit[p];
		}
		
	}
}
