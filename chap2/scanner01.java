package test2;

import java.util.Scanner;


public class scanner01 {

	public static void main(String num[])
	{
		System.out.print("2�ڸ��� ���� �Է�>>");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		int num2 = number / 10;
		int num1 = number % 10;
		
		if(num1==num2)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else 
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
	}
}
