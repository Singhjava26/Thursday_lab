import java.util.Scanner;

public class Operators 
{

	public static void main(String[] args)
													// TODO Auto-generated method stub
	{
		char operator;
	    Double number1, number2 ;

	    // create an of Scanner class
	    Scanner input = new Scanner(System.in);

	    // To display operators
	    System.out.println("Arithmetic operator: +, -, *,/,%");
	    System.out.println("Assignment operator:=,+=,-=,*=,/=,%=");
	    System.out.println("Relational operator:==,!=,>,<,>=,<= ");
	    System.out.println("Logical operator:&&,||,! ");
	    System.out.println("Unary operator:+,-,++,--,!");
	    System.out.println("Bitwise:~,<<,>>,>>>,&,^");
	    operator = input.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    number1 = input.nextDouble();

	    System.out.println("Enter second number");
	    number2 = input.nextDouble();

	    switch (operator) {

	                                               // performs arithmetic operators
	      case 1:
	        
	        System.out.println("+,-,*,/,%");
	        break;

	                                              // performs assignment operators
	      case 2:
	       
	        System.out.println("=,+=,-=,*=,/=,%=");
	        break;

	                                             // performs relational operators
	      case 3:
	       
	        System.out.println("==,!=,>,<,>=,<=");
	        break;

	                                             // performs logical operators
	      case 4:
	       
	        System.out.println("&&,||,!");
	        break;
	        
	                                            // performs unary operators
	      case 5:
	       
	        System.out.println("+,-,++,--,!");
	        break;
	        
	                                            // performs bitwise operators
	      case 6:
	       
	        System.out.println("~,<<,>>,>>>,&,^");
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
		}
}
	       
	
		

	


													
			

