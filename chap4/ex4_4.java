package chap4;

public class ex4_4 {

	String title;
	String author;
	
	public ex4_4(String t) {
		title = t; author = "작자미상";
	}
	
	public ex4_4(String t, String a) {
		title = t; author = a;
	}
	
	public static void main(String [] args) 
	{
		ex4_4 littlePrince = new ex4_4("어린왕자", "생텍쥐페리");
		ex4_4 loveStory = new ex4_4("춘향전");
		
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}