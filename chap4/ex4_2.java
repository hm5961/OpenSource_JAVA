package chap4;

import java.util.Scanner;

public class ex4_2 {
	
	int width;
	int height;
	
	public int getArea()
	{
		return width * height;
	}
	
	public static void main(String[] args)
	{
		ex4_2 rect = new ex4_2();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("�簢���� ������ " + rect.getArea());
		
		scanner.close();
	}
	
}