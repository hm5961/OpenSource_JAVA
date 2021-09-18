package chap3;

import java.util.Random;
import java.util.Scanner;

public class prac16 {

	public static void main(String num[])
	
	{
	      Scanner scanner = new Scanner(System.in);
	      String rps[] = {"가위", "바위", "보"};
	      String user, com;
	
	      int n;
	      System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
	      Random random = new Random(); // 랜덤
			
	      do {
	    	  System.out.print("가위 바위 보! >> ");
	    	  user = scanner.next();
		         
		         if(user.equals("그만")) 
		        	 break;
		         
		         n = random.nextInt(3);
		         com = rps[n];
		         
		         if(user.equals("바위")) 
		         {
		            if(rps[n].equals("가위")) 
		            {
		               System.out.println("사용자 = " + user + " , 컴퓨터 = "+ com +", 사용자가 이겼습니다.");
		               continue;
		            }
		            else if(rps[n].equals("바위")) 
		            {
		               System.out.println("사용자 = " + user + " , 컴퓨터 = "+ com +", 비겼습니다.");
		               continue;
		            }
		            else if(rps[n].equals("보")) 
		            {
		               System.out.println("사용자 = "+ user +" , 컴퓨터 = " + com + ", 사용자가 졌습니다.");
		               continue;
		            }
		         }
		         
		         else if(user.equals("보")) 
		         {
			            if(rps[n].equals("바위"))
			            {
				           System.out.println("사용자 = " + user + " , 컴퓨터 = "+ com +", 사용자가 이겼습니다.");
			               continue;
			            }
			            else if(rps[n].equals("보"))
			            {
				           System.out.println("사용자 = " + user + " , 컴퓨터 = "+ com +", 비겼습니다.");
			               continue;
			            }
		            if(rps[n].equals("가위"))
		            {
			           System.out.println("사용자 = "+ user +" , 컴퓨터 = " + com + ", 사용자가 졌습니다.");
		               continue;
		            }
		         }
		         
		         else if(user.equals("가위")) 
		         {
			          if(rps[n].equals("보")) 
			            {
					           System.out.println("사용자 = " + user + " , 컴퓨터 = "+ com +", 사용자가 이겼습니다.");
			               continue;
			            }
		            if(rps[n].equals("가위")) 
		            {
				           System.out.println("사용자 = " + user + " , 컴퓨터 = "+ com +", 비겼습니다.");
		               continue;
		            }
		            else if(rps[n].equals("바위")) 
		            {
				           System.out.println("사용자 = "+ user +" , 컴퓨터 = " + com + ", 사용자가 졌습니다.");
		               continue;
		            }
		         }
		         
		         System.out.print("사용자 = " + user +" , 컴퓨터 = "+ com +" ");

	      }while(true);     
	      
	      System.out.println("게임을 종료합니다...");
	   }
}
