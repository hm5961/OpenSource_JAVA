package test2;

public class arrayout {
	public static void main(String num[])
	{
		int n [][] = {{1}, {1,2,3},{1},{1,2,3,4},{1,2}};
		
		for( int p[] : n)
		{
			for (int q : p)
			{
				System.out.print(q + " ");
			}
			System.out.println("");
		}
	}
}