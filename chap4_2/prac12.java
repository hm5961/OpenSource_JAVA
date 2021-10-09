package chap4_2;

import java.util.Scanner;

public class prac12 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		int menu, seat_a, seat_b;
		String name;
		
		while(true)
		{
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			menu = scanner.nextInt();
			
			switch(menu)
			{
				case 1:
				{
					System.out.print("좌석구분 S(1) A(2) B(3)>>");
					seat_a = scanner.nextInt();
					switch(seat_a)
					{
						case 1:
						{
							seat.show_s();
							System.out.print("이름>>");
							name = scanner.next();
							System.out.print("번호>>");
							seat_b = scanner.nextInt();
							seat.add_s(seat_b, name);
							break;
						}
						
						case 2:
						{
							seat.show_a();
							System.out.print("이름>>");
							name = scanner.next();
							System.out.print("번호>>");
							seat_b = scanner.nextInt();
							seat.add_a(seat_b, name);
							break;
						}
						
						case 3:
						{
							seat.show_b();
							System.out.print("이름>>");
							name = scanner.next();
							System.out.print("번호>>");
							seat_b = scanner.nextInt();
							seat.add_b(seat_b, name);
							break;
						}
						default:
						{
							System.out.println("다시 입력해주세요.");
						}
						break;
						
					}
					break;
				}
				case 2:
				{
					seat.show_s();
					seat.show_a();
					seat.show_b();
					System.out.println("<<<조회를 완료하였습니다.>>>");
					break;
				}
				case 3:
				{			
					System.out.print("좌석 S:1, A:2, B:3>>");
					seat_a = scanner.nextInt();
					
					switch(seat_a)
					{
						case 1:
						{
							seat.show_s();
							System.out.print("이름>>");
							name = scanner.next();
							seat.del_s(name);
							break;
						}
					
						case 2:
						{
							seat.show_a();
							System.out.print("이름>>");
							name = scanner.next();
							seat.del_a(name);
							break;
						}
					
						case 3:
						{
							seat.show_b();
							System.out.print("이름>>");
							name = scanner.next();
							seat.del_b(name);
							break;
						}
						default:
						{
							System.out.println("다시 입력해주세요.");
						}
					
					}
					break;
				}
				default:
					System.out.println("다시 입력해주세요.");
				case 4:
					break;
				
			}
			
		}
		
	}
}

class seat
{
	public static String[] S = new String[10];
	public static String[] A = new String[10];
	public static String[] B = new String[10];
	
	private static boolean isStringEmpty(String string) {
		return string == null || string.isEmpty();
	}
	
	static void show_s()
	{
		System.out.print("S>>");
		for( int i = 0; i < S.length; i++ )
		{
			if( isStringEmpty(S[i]) )
				System.out.print(" --- ");
			else
				System.out.print(" " + S[i] + " ");
		}
		System.out.println("");
	}	
	


	static void show_a()
	{
		System.out.print("A>>");
		for( int i = 0; i < A.length; i++ )
		{
			if( isStringEmpty(A[i]) )
				System.out.print(" --- ");
			else
				System.out.print(" " + A[i] + " ");
		}
		System.out.println("");
	}	
	
	static void show_b()
	{
		System.out.print("B>>");
		for( int i = 0; i < B.length; i++ )
		{
			if( isStringEmpty(B[i]) )
				System.out.print(" --- ");
			else
				System.out.print(" " + B[i] + " ");
		}
		System.out.println("");
	}
	
	
	static void add_s(int num, String name)
	{
		if( !isStringEmpty(S[num-1]) )
			System.out.println("예매된 자석입니다.");
		else
			S[num-1] = name;
	}	
	
	static void add_a(int num, String name)
	{
		if( !isStringEmpty(A[num-1]) )
			System.out.println("예매된 자석입니다.");
		else
			A[num-1] = name;
	}
	
	static void add_b(int num, String name)
	{
		if( !isStringEmpty(B[num-1]) )
			System.out.println("예매된 자석입니다.");
		else
			B[num-1] = name;
	}
	
	
	static void del_s(String name)
	{
		for( int i = 0; i < S.length; i++ ) 
		{
			if( !isStringEmpty(S[i]) )
			{
				if ( S[i].equals(name))
				{
					S[i] = null;
					return;
				}
			}
		}
		System.out.println (" 입력하신 이름이 존재하지 않습니다. ");
	}	
	
	static void del_a(String name)
	{
		for( int i = 0; i < A.length; i++ ) 
		{
			if( !isStringEmpty(A[i]) )
			{
				if ( A[i].equals(name))
				{
					A[i] = null;
					return;
				}
			}
		}
		System.out.println (" 입력하신 이름이 존재하지 않습니다. ");
	}
	
	static void del_b(String name)
	{
		for( int i = 0; i < B.length; i++ ) 
		{
			if( !isStringEmpty(B[i]) )
			{
				if ( B[i].equals(name))
				{
					B[i] = null;
					return;
				}
			}
		}
		System.out.println (" 입력하신 이름이 존재하지 않습니다. ");
	}
}