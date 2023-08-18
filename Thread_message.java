//Q.1  Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor). The threads should display the messages continuously till the user presses ctrl+c.
//Files are Thread_message.java, Constructor_para_Threadmessage.java

package Thursday_lab_17_aug;
public class Thread_message extends Thread 
{
	public static void main(String[] args){
	}													// TODO Auto-generated method stub
		  private String message;
		    public Thread_message(String message) 
		    {
		        this.message = message;
		    }
		    @Override
		    public void run() 
		    {
		        try
		        {
		            while(true)
		            {
		                System.out.println(message);
		                Thread.sleep(1000); 					// Adjust the sleep time as needed
		            }
		        } 
		        catch (InterruptedException e) 
		        {
		        										// Thread was interrupted, which means the program is terminating
		        }
		    }
	

}
