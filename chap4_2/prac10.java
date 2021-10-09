package chap4_2;

import java.util.Scanner;

public class prac10 {
	
	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("�ѱ� �ܾ� �˻� ���α׷��Դϴ�.");

		String input;
		
		
		while(true){
			System.out.print("�ѱ� �ܾ�?");
			input = scanner.next();
			
			if(input.equals("�׸�"))
				break;
			if( Dictionary.kor2Eng(input) == "0")
				System.out.println( input + "�� ���� ������ �����ϴ�.");
			else
				System.out.println( input + "�� " + Dictionary.kor2Eng(input));
			
			}
		}
}
	

class Dictionary {
	
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word))
				return eng[i];
		}
		return "0";
	}
}