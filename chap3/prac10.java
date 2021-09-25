package chap3;

import java.util.Random;

public class prac10 {

	public static void main(String num[])
	{	
		int arr[][] = new int[4][4]; // 정수 배열 저장
		int arrcnt = 0;
		
		int i,j;
		Random random = new Random(); // 랜덤
		
		while(arrcnt < 10)
		{
			i = random.nextInt(4);
			j = random.nextInt(4);
			
			if(arr[i][j] == 0)
			{
				arr[i][j] = random.nextInt(9)+1;
				arrcnt++;
			}
		}

        for(int k = 0; k < 4 ; k++)
        {
        	for(int l = 0; l < 4; l++)
        	{
            	if(l % 4 == 0 && k != 0)
                	System.out.println("");
            	System.out.print(arr[k][l] + " ");
        	}
        }
	}
}
