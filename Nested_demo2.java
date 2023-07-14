
public class Nested_demo2
{

	public static void main(String[] args) 
	{
		

		drawLine();
	    drawBody();
	    drawLine();
	}
	    public static void drawLine() 
	    {
	    System.out.print("v");
	    for (int i = 1; i <= 5; i++)
	    {
	    System.out.print("v");
	    }
	    System.out.println("v");
	    }
	    public static void drawBody() 
	    {
	    for (int line = 1; line <= 3; line++) 
	    {
	    System.out.print("v");
	    for (int spaces = 1; spaces <= 5; spaces++)
	    {
	    System.out.print(" ");
	    }
	    System.out.println("v"); 
	    }
	    }


}
