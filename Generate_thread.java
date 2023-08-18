package Thursday_lab_17_aug;
//question no2
public class Generate_thread

{
	public static void main(String[] args) 
	{
													// TODO Auto-generated method stub
		 int fibonacciTerms = 20;
		 
		 	Fibonacci_series_thread Fibonacci_series_thread = new Fibonacci_series_thread(fibonacciTerms);
	        Reverse_numbers Reverse_numbers  = new Reverse_numbers ();
	        
	        Fibonacci_series_thread.start();
	        											//This will call the run function of thread1 which is FibonacciThread
	        try
	        {
	        	Fibonacci_series_thread.sleep(1000);	//Giving the sleep or delay time for executing the complete Fibonacci series
			}
	        catch (InterruptedException e)
	        {
				e.printStackTrace();
			}
	        
	        Reverse_numbers.start();			//This will call the run function of thread1 which is Reverse_numbers
	}
}


