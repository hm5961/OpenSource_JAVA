package test2;

import java.util.Scanner;

public class circulator02 {
	
	public static void main(String num[])
	{
		System.out.print("num1 op num2>>");
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt(); // �������� �Ǽ��� ǥ���� �϶� ������ ��Ŭ�������� �Ǽ��� ���� �Ұ�
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
				System.out.print("/ 0 �Ұ�");
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
					System.out.print("/ 0 �Ұ�");
				else
					res = num1 / num2;
			}
		default:
			System.out.print("�Է¿���");
			scanner.close();
	}
		System.out.print("/ 0 �Ұ�");

		scanner.close();
	}
}
