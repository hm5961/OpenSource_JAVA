package chap3;

import java.util.Scanner;

public class prac14 {
	
	public static void main(String num[])
	{
	      Scanner scanner = new Scanner(System.in);
	      String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
	      int score[]  = {95, 88, 76, 62, 55};
	      
	      String name="";
	      int i;
	      
	      while(true) 
	      {
	         System.out.print("���� �̸� >> ");
	         name = scanner.next();
	         
	         if( name.equals("�׸�") )
	        	 break;
	         
	         for(i=0; i<course.length; i++) 
	         {
	            if(course[i].equals(name)) {
	               System.out.println(course[i]+"�� ������ "+score[i]);
	               break;
	            }
	         }
	         
	         if(i == course.length) {
	            System.out.println("���� �����Դϴ�.");
	         }
	      }
	  }
}
