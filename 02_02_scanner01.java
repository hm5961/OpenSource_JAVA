package test2;

import java.util.Scanner;


public class scanner01 {

	public static void main(String num[])
	{
		System.out.print("2자리수 정수 입력>>");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		int num2 = number / 10;
		int num1 = number % 10;
		
		if(num1==num2)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else 
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
	}
}
