package chap4;

public class ex4_4 {

	String title;
	String author;
	
	public ex4_4(String t) {
		title = t; author = "���ڹ̻�";
	}
	
	public ex4_4(String t, String a) {
		title = t; author = a;
	}
	
	public static void main(String [] args) 
	{
		ex4_4 littlePrince = new ex4_4("�����", "�������丮");
		ex4_4 loveStory = new ex4_4("������");
		
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}