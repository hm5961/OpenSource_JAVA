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
		//aClass.b = 10; b�� private�� Sample���� ����Ǿ��� ������ �� Ŭ���������� ���� �Ұ��ϴ�
		aClass.c = 10;
		System.out.println(aClass.a);
		//System.out.println(aClass.b);
		System.out.println(aClass.c);
		}
}
