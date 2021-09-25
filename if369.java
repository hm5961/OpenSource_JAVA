package test2;

import java.util.Scanner;

public class if369 {

	public static void main(String num[])
	{
		System.out.print("1~99사이의 정수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		if(number < 1 || number > 99)
			scanner.close();
		
		int num2 = number / 10;
		int num1 = number % 10;
		
		
		if( num2 == 3 || num2 == 6 || num2 == 9 )
		{
			if( num1 == 3 || num1 == 6 || num1 == 9 )
				System.out.println("박수짝짝");
			else
				System.out.println("박수짝");
		}
		else 
			if( num1 == 3 || num1 == 6 || num1 == 9 )
				System.out.println("박수짝");
			else
				System.out.println("박수");

		scanner.close();		
		
	}
}
