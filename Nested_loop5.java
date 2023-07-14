import java.util.Scanner;

public class Nested_loop5
{

	public static void main(String[] args)
	{
		  int row;
	     
	      Scanner sc= new Scanner(System.in);
	      System.out.print("Enter no of row = ");
	      row=sc.nextInt();
	      int c, r;
	      int x = 1;
	     
	      int y = row * 2 - 1;
	        
	     
	      for (r = 1; r <= row; r++)
	      {
	       
	        for (c = 1; c <= row * 2; c++)
	        {
	        
	          if (c == x || c == y)
	          {
	            System.out.print("vipin");
	          }
	          else
	          {
	            System.out.print(" ");
	          }
	        }
	        
	        x++;
	       
	        y--;
	        System.out.println("");	
	      }

	}

}
