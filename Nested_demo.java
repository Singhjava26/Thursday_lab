
public class Nested_demo
{

	public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=5;i++)// Outer Loop
		{
			for(j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-i;j++) // Inner Loop
			{
				System.out.print("*");
			}
			System.out.println();
	

	     }
	}
}


