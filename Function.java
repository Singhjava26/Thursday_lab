/* Write a program using the function and display the output:
		1.Factorial
		2.Prime no from 1 to 1000
		3.Reverse of the no */
public class Function
{

	public static void main(String[] args)
	{
		
			factorial();
			System.out.println("Prime numbers between 1 and 1000:");
	        for (int i = 1; i <= 1000; i++) 
	        {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
																				//check_prime(500);
	       //Reverse of a number
	        int numToReverse=123456;
	        int reversedNum=reverseNumber(numToReverse);
	        System.out.println("\nReverse of "+numToReverse+" is: "+reversedNum);
		}
		public static void factorial()
		{
			int num=8,fact=1;
			while(num>0)
			{
				fact=fact*num;
				num--;
			}
			System.out.println("The Factorial is: "+fact);
		}

		// Function to check if a number is prime
		public static boolean isPrime(int num)
		{
			if(num<=1)
			{
				return false;
		    }
		    for(int i=2;i<=Math.sqrt(num);i++)
		    {
		    	if (num%i==0)
		    	{
		    		return false;
		    	}
		    }
		    return true;
		 }
		
		
		// Function to reverse a number
	    public static int reverseNumber(int num)
	    {
	        int reversedNum=0;
	        while(num!=0) 
	        {
	            int digit=num%10;
	            reversedNum=reversedNum*10+digit;
	            num=num/10;
	        }
	        return reversedNum;
	    }



	}


