package test2;

import java.util.Scanner;

public class if369 {

	public static void main(String num[])
	{
		System.out.print("1~99������ ������ �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		if(number < 1 || number > 99)
			scanner.close();
		
		int num2 = number / 10;
		int num1 = number % 10;
		
		
		if( num2 == 3 || num2 == 6 || num2 == 9 )
		{
			if( num1 == 3 || num1 == 6 || num1 == 9 )
				System.out.println("�ڼ�¦¦");
			else
				System.out.println("�ڼ�¦");
		}
		else 
			if( num1 == 3 || num1 == 6 || num1 == 9 )
				System.out.println("�ڼ�¦");
			else
				System.out.println("�ڼ�");

		scanner.close();		
		
	}
}
