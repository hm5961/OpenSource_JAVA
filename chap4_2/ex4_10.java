package chap4;

class Sample {
	public int a;
	private int b;
	int c;
	}

public class ex4_10 {
	
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		//aClass.b = 10; b가 private로 Sample에서 선언되었기 때문에 이 클래스에서는 접근 불가하다
		aClass.c = 10;
		System.out.println(aClass.a);
		//System.out.println(aClass.b);
		System.out.println(aClass.c);
		}
}
