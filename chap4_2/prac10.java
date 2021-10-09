package chap4_2;

import java.util.Scanner;

public class prac10 {
	
	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("한글 단어 검색 프로그램입니다.");

		String input;
		
		
		while(true){
			System.out.print("한글 단어?");
			input = scanner.next();
			
			if(input.equals("그만"))
				break;
			if( Dictionary.kor2Eng(input) == "0")
				System.out.println( input + "는 저의 사전에 없습니다.");
			else
				System.out.println( input + "은 " + Dictionary.kor2Eng(input));
			
			}
		}
}
	

class Dictionary {
	
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word))
				return eng[i];
		}
		return "0";
	}
}