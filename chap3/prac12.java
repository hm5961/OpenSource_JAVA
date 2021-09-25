package chap3;

import java.util.Scanner;

public class prac12 {

	public static void main(String num[])
	{
	      int sum=0;
	      
	      for(int i=0; i<num.length; i++) 
	      {   
	    	 try{
	            sum += Integer.parseInt(num[i]);
	         }
	         
	    	 catch(NumberFormatException e) 
	         {
	            continue;
	         }
	      }
	      System.out.println(sum);

	}
}
