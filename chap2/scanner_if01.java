package test2;

import java.util.Scanner;

public class scanner_if01 {

	public static void main(String num[])
	{
		System.out.print("정수 3개 입력>>");
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if(num1 > num2 )
		{
			if(num1 > num3)
			{
				if( num2 > num3)
				{
					System.out.println("중간값은"+num2);
				}
				else if ( num2 < num3)
				{
					System.out.println("중간값은"+num3);
				}
			}
			else if(num1 < num3)
			{
				System.out.println("중간값은"+num1);
			}
		}
		else if(num1 < num2)
		{
			if(num2 > num3)
			{
				if( num1 > num3)
				{
					System.out.println("중간값은"+num1);
				}
				else if ( num1 < num3)
				{
					System.out.println("중간값은"+num3);
				}
			}
			else if(num2 < num3)
			{
				System.out.println("중간값은"+num2);
			}
		}
	}
}
