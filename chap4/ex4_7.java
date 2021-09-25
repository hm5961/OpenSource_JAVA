package chap4;

import java.util.Scanner;
class ex4_7 {
	
	String title, author;

	public ex4_7(String title, String author) 
	{
	
		this.title = title;
		this.author = author;
	}
	
	
	public class BookArray {
		public static void main(String[] args) 
		{
			ex4_7 [] book = new ex4_7[2]; // 
			Scanner scanner = new Scanner(System.in);
			
			for(int i=0; i<book.length; i++) {
				System.out.print("제목>>");
				String title = scanner.nextLine();
				System.out.print("저자>>");
				String author = scanner.nextLine();
				book[i] = new ex4_7(title, author); 
		}
	
		for(int i=0; i<book.length; i++)
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		
		scanner.close();
		}
	}
}
