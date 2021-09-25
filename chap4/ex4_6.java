package chap4;

class ex4_6 {

	int radius;
	public ex4_6(int radius) {
		
		this.radius = radius;
	}
	
	public double getArea() {
		
		return 3.14*radius*radius;
	}

	public class CircleArray {
	
		public static void main(String[] args) {
		
		ex4_6 [] c;
		c = new ex4_6[5];
		
		for(int i=0; i<c.length; i++)
			c[i] = new ex4_6(i);

		for(int i=0; i<c.length; i++)
			System.out.print((int)(c[i].getArea()) + " ");
		}
	}
}