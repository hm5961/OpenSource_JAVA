package chap6;

public class prac02 {
	private int x, y, radius;
	
	public prac02(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle("+x+","+y+")반지름"+radius;
	}
	
	public boolean equals(Object obj) {
		prac02 p = (prac02)obj;
		if(p.x == x && p.y == y) //중심이 같으면 같은 원이다.
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		prac02 a = new prac02(2, 3, 5);
		prac02 b = new prac02(2, 3, 30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b))
			System.out.println("같은 원");
		else 
			System.out.println("서로 다른 원");
	}
}