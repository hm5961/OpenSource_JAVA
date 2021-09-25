package chap3;

import java.util.Scanner;
import java.util.Random;

public class prac08 {

	public static void main(String num[])
	{
		System.out.print("정수 몇개? ");
		Scanner scanner = new Scanner(System.in);
		int inum = scanner.nextInt();
		
		int arr[] = new int[100];
		
		Random random = new Random();
		
		for( int i = 0; i<inum; i++) 
		{
            arr[i] = random.nextInt(100)+1;
            
            
            for( int j = 0; j < i; j++)
            {
            	if( arr[i] == arr[j] && i != 0)
            	{
            		i--;
            		break;
            	}
            		
            }
		}

        for(int k = 0; k < inum ; k++)
        {
        	if(k % 10 == 0 && k != 0)
            	System.out.println("");
        	System.out.print(arr[k] + " ");
        	
        }
		
	}
	
}
