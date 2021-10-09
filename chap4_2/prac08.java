package chap4_2;

import java.util.Scanner;

public class prac08 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String input;
		int n, i, j;
		System.out.print("인원수>>");
		n = scanner.nextInt();
		Phone arr[]=new Phone[n];
		
		for(i = 0; i < arr.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			arr[i]=new Phone(name,tel);
		}	
		System.out.println("저장되었습니다...");
		
		while(true){
			j = 0;
			System.out.print("검색할 이름>>");
			input = scanner.next();
			
			if(input.equals("그만"))
				break;
			
			for(i = 0; i < arr.length; i++) {
				if(input.equals(arr[i].name)) {
					System.out.println( arr[i].name + "의 번호는 " + arr[i].tel + " 입니다.");
					j = 1;
				}
			}
			if( j == 0 )
				System.out.println( input + " 이 없습니다.");
		}
		scanner.close();	
	}
}

class Phone{
	
	String name;
	String tel;
	
	Phone( String name, String tel )
	{
		this.name = name;
		this.tel = tel;
	}
	
}

