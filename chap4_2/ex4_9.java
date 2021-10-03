package chap4;

public class ex4_9 {
	public static void main(String[] args) 
	{
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		a = null; // a가 null을 가르키기에 기존에 a가 가르키던 good이 가비지가 됨
		d = c;
		c = null;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		//System.out.println(e); 초기화되지 않은 string출력 불능
	}
}
