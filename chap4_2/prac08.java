package chap4_2;

import java.util.Scanner;

public class prac08 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String input;
		int n, i, j;
		System.out.print("�ο���>>");
		n = scanner.nextInt();
		Phone arr[]=new Phone[n];
		
		for(i = 0; i < arr.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = scanner.next();
			String tel = scanner.next();
			arr[i]=new Phone(name,tel);
		}	
		System.out.println("����Ǿ����ϴ�...");
		
		while(true){
			j = 0;
			System.out.print("�˻��� �̸�>>");
			input = scanner.next();
			
			if(input.equals("�׸�"))
				break;
			
			for(i = 0; i < arr.length; i++) {
				if(input.equals(arr[i].name)) {
					System.out.println( arr[i].name + "�� ��ȣ�� " + arr[i].tel + " �Դϴ�.");
					j = 1;
				}
			}
			if( j == 0 )
				System.out.println( input + " �� �����ϴ�.");
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

