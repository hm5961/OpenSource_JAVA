package chap3;

import java.util.Scanner;

public class prac04 {

	public static void main(String num[])
	{
		System.out.print("소문자 알파벳 하나를 입력하시오 >>");
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		char c = s.charAt(0);
		
		for( int i = c; i>=97 ; i--)
		{
			for( int j = 97; j<=i; j++)
			{
				char out = (char)j;
				System.out.print(out + " ");
			}
			System.out.println("");
		}
		
	}

}
