import java.util.Scanner;

public class Greatest 
{

	public static void main(String[] args) 
	{
		                                     // TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number ");
		int number1 = scan.nextInt();
		
		System.out.println("Enter second number ");
		int number2 = scan.nextInt();
		
		System.out.println("Enter third number ");
		int number3 = scan.nextInt();
		
		if(number1>number2 && number1>number3)
		{
			System.out.println(number1+ " is the greatest");
			
		}else if(number2>number1 && number2>number3)
			
		{
			System.out.println(number2+ " is the greatest");
		}else
		{
			System.out.println(number3+ " is the greatest");
	    }
	}
}


