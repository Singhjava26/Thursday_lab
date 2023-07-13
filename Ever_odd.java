import java.util.Scanner;

public class Ever_odd 
{

	public static void main(String[] args)
	{
														// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter any number: ");
	    int num = sc.nextInt();							//checking if else using ternary operator
	    
	    											//ternary operator syntax: condition ? expression1 : expression2
	    													// if condition is true, expression1 executes else expression2
	   
	    String evenOrOdd = (num % 2 == 0) ? "even number" : "odd number";
	    

	    System.out.println(num + " is an " + evenOrOdd);
	}

}
