package test2;

import java.util.Scanner;

public class circulator02 {
	
	public static void main(String num[])
	{
		System.out.print("num1 op num2>>");
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt(); // 문제에서 실수형 표현을 하라 했지만 이클립스에서 실수형 연산 불가
		String op = scanner.next();
		int num2 = scanner.nextInt();
		int res = 0;
		
		if(op.equals("+"))
			res = num1 + num2;
		if(op.equals("-"))
			res = num1 - num2;
		if(op.equals("*"))
			res = num1 * num2;
		if(op.equals("/")) {
			if(num2 == 0)
				System.out.print("/ 0 불가");
			res = num1 / num2;
		}
		switch(op) {
		case "+":
			res = num1 + num2;
		break;
		case "-":
			res = num1 - num2;
		case "*":
			res = num1 * num2;
		case "/":
			if(op.equals("/")) {
				if(num2 == 0)
					System.out.print("/ 0 불가");
				else
					res = num1 / num2;
			}
		default:
			System.out.print("입력오류");
			scanner.close();
	}
		System.out.print("/ 0 불가");

		scanner.close();
	}
}
