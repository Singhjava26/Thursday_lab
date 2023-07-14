
public class Nested_demo4
{
	public static void main(String[] args)
	{
		int number = 5;
	    int i, j;
	     
	    // Outer loop
	    for(i = number; i >= 1; i--)
	    {
	         
	        // Inner loop 
	        for(j = i; j < number; j++)
	        {
	            System.out.print(" ");
	        }
	        
	        for(j = 1; j <= (2 * i - 1); j++)
	        {
	            System.out.print("*");
	        }
	         
	       
	        System.out.println("");	
	    }

	}

}
