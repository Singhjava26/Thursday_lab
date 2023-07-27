
public class Palindrome_object 
{
																	// TODO Auto-generated method stub
	public static void main(String[] args)
	{
		Palindrome_object obj1= new Palindrome_object(); 
		swapping sc=new swapping();
		
		obj1.greatest();											//Calling the function from acting parent class array_operation
		obj1.smallest();											
		obj1.ascending();											
		obj1.descending();											
		obj1.pal_value();											//Calling the function for user input from the Base class for Palindrome 
		obj1.rev();
		
		sc.swapNumbers();																

	}

}
