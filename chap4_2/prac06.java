package chap4_2;

import java.util.Scanner;

public class prac06 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Circle c[] = new Circle[3];

		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");

			double x = scanner.nextDouble();
			double y = scanner.nextDouble();

			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}

		double max = 0;
		
		for (int i = 0; i < c.length; i++)
			if (max < c[i].area())
				max = c[i].area();

		for (int i = 0; i < c.length; i++)
			if (max == c[i].area()) {
				System.out.print("가장 면적인 큰 원은 ");
				c[i].show();
			}

		scanner.close();
	}
}

class Circle {
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius) {
		this.x = x; 
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}

	public int area() {
		return radius*radius;
	}
}
