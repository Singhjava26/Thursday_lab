package Thursday_lab_17_aug;
//questions no1
public class Constructor_para_Threadmessage 
{

	public static void main(String[] args)
	{
															// TODO Auto-generated method stub
		Thread_message thread1=new Thread_message("Thread 1: Hello!");
		Thread_message thread2=new Thread_message("Thread 2: Hi!");

	        thread1.start();
	        thread2.start();
	        												// Add a shutdown hook to handle Ctrl+C
	       /* Runtime.getRuntime().addShutdownHook(new Thread(() -> {
	            thread1.interrupt();
	            thread2.interrupt();
	            System.out.println("Program terminated.");
	        }));*/

	        try 
	        {
	        												// Wait for threads to finish
	            thread1.join();
	            thread2.join();
	        } 
	        catch(InterruptedException e)
	        {
	            e.printStackTrace();
	        }
	}

}
