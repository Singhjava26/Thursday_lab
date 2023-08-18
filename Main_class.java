package Thursday_lab_17_aug;
//question no4
public class Main_class 
{

	public static void main(String[] args)
	{														// TODO Auto-generated method stub
		 try
	        {
			 User_defined firstInstance = User_defined.getInstance();
	            System.out.println("First instance created successfully.");
	            
	            								// the following lines will demonstrate the custom exception
	            User_defined secondInstance = User_defined.getInstance();
	            System.out.println("Second instance created successfully.");
	        }
	        catch (User_define_exception e)
	        {
	            System.out.println("Exception: " + e.getMessage());
	        }
	}

}
