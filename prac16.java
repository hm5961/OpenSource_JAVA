package chap3;

import java.util.Random;
import java.util.Scanner;

public class prac16 {

	public static void main(String num[])
	
	{
	      Scanner scanner = new Scanner(System.in);
	      String rps[] = {"����", "����", "��"};
	      String user, com;
	
	      int n;
	      System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
	      Random random = new Random(); // ����
			
	      do {
	    	  System.out.print("���� ���� ��! >> ");
	    	  user = scanner.next();
		         
		         if(user.equals("�׸�")) 
		        	 break;
		         
		         n = random.nextInt(3);
		         com = rps[n];
		         
		         if(user.equals("����")) 
		         {
		            if(rps[n].equals("����")) 
		            {
		               System.out.println("����� = " + user + " , ��ǻ�� = "+ com +", ����ڰ� �̰���ϴ�.");
		               continue;
		            }
		            else if(rps[n].equals("����")) 
		            {
		               System.out.println("����� = " + user + " , ��ǻ�� = "+ com +", �����ϴ�.");
		               continue;
		            }
		            else if(rps[n].equals("��")) 
		            {
		               System.out.println("����� = "+ user +" , ��ǻ�� = " + com + ", ����ڰ� �����ϴ�.");
		               continue;
		            }
		         }
		         
		         else if(user.equals("��")) 
		         {
			            if(rps[n].equals("����"))
			            {
				           System.out.println("����� = " + user + " , ��ǻ�� = "+ com +", ����ڰ� �̰���ϴ�.");
			               continue;
			            }
			            else if(rps[n].equals("��"))
			            {
				           System.out.println("����� = " + user + " , ��ǻ�� = "+ com +", �����ϴ�.");
			               continue;
			            }
		            if(rps[n].equals("����"))
		            {
			           System.out.println("����� = "+ user +" , ��ǻ�� = " + com + ", ����ڰ� �����ϴ�.");
		               continue;
		            }
		         }
		         
		         else if(user.equals("����")) 
		         {
			          if(rps[n].equals("��")) 
			            {
					           System.out.println("����� = " + user + " , ��ǻ�� = "+ com +", ����ڰ� �̰���ϴ�.");
			               continue;
			            }
		            if(rps[n].equals("����")) 
		            {
				           System.out.println("����� = " + user + " , ��ǻ�� = "+ com +", �����ϴ�.");
		               continue;
		            }
		            else if(rps[n].equals("����")) 
		            {
				           System.out.println("����� = "+ user +" , ��ǻ�� = " + com + ", ����ڰ� �����ϴ�.");
		               continue;
		            }
		         }
		         
		         System.out.print("����� = " + user +" , ��ǻ�� = "+ com +" ");

	      }while(true);     
	      
	      System.out.println("������ �����մϴ�...");
	   }
}
