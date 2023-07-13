import java.util.Scanner;

public class Multiplication_table 
{

	public static void main(String[] args)
	{
												// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
			System.out.print("Enter number:");        
			int n=sc.nextInt();
			
		        for(int i=2; i <= 20; i++)
		        {
		            System.out.println(n+" * "+i+" = "+n*i);
		        }
	}

}
