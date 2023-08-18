package Thursday_lab_17_aug;
//question no3
//Write a program to demonstrate the chained exception in Java
public class Demo_Chained_Exception
{

	public static void main(String[] args)
	{
														// TODO Auto-generated method stub
		try
        {
                Exception ae = new Exception("Exception");
                ae.initCause(new ArithmeticException("Cause of the ArithmeticException"));
                throw ae;
        }
        catch (Exception ae)							//catch block
        {
                System.out.println(ae);
                System.out.println(ae.getCause());
        }
        try												//try block
        {
                NumberFormatException ex = new NumberFormatException("NumberFormatException");
                ex.initCause(new NullPointerException("Cause of the NullPointerException"));
                throw ex;
        }
        catch(NumberFormatException ex)				//handling the exception using the catch block
        {
                System.out.println(ex);
                System.out.println(ex.getCause());
        }
	}

}
