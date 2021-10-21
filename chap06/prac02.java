package chap6;

public class prac02 {
	private int x, y, radius;
	
	public prac02(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle("+x+","+y+")������"+radius;
	}
	
	public boolean equals(Object obj) {
		prac02 p = (prac02)obj;
		if(p.x == x && p.y == y) //�߽��� ������ ���� ���̴�.
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		prac02 a = new prac02(2, 3, 5);
		prac02 b = new prac02(2, 3, 30);
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		if(a.equals(b))
			System.out.println("���� ��");
		else 
			System.out.println("���� �ٸ� ��");
	}
}