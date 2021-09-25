package test2;

import java.util.Scanner;

public class ifsquare01 {
	
	public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2) 
	{
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
			return true; 	
		else 
			return false;
	}
	
	public static void main(String num[])
	{
		System.out.print("x1 x2 y1 y2>>");
		Scanner scanner = new Scanner(System.in);

		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int oh = 100;
		int th = 200;
		
		if (inRect(x1,y1,oh,oh,th,th) || inRect(x2,y2,oh,oh,th,th) || inRect(x1,y2,oh,oh,th,th) || inRect(x2,y1,oh,oh,th,th)) // 한 점이라도 겹치는 경우
			System.out.println("충돌합니다"); 
		else if ((inRect(x1,y1,oh,oh,th,th)) && inRect(x2,y2,oh,oh,th,th) && inRect(x2,y1,oh,oh,th,th) && inRect(x1,y2,oh,oh,th,th)) // 인풋이 100 200 100 200인경우
			System.out.println("충돌합니다"); 
		else if ((inRect(oh,oh,x1,y1,x2,y2)) && inRect(oh,th,x1,y1,x2,y2) && inRect(th,oh,x1,y1,x2,y2) && inRect(th,th,x1,y1,x2,y2)) // (100,100)~(200,200)내에 인풋값이 있는 경우
			System.out.println("충돌합니다"); 
		else 
			System.out.println("충돌하지않습니다");
	}		
}
