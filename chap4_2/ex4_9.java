package chap4;

public class ex4_9 {
	public static void main(String[] args) 
	{
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		a = null; // a�� null�� ����Ű�⿡ ������ a�� ����Ű�� good�� �������� ��
		d = c;
		c = null;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		//System.out.println(e); �ʱ�ȭ���� ���� string��� �Ҵ�
	}
}
