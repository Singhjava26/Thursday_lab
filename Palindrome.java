
public class Palindrome extends Array_oprations
{

	public static void main(String[] args) 
	{
		
		public void rev()
		{
			temp=num;
			while(num>0)
			{
				r=num%10;
				rev=rev*10+r;
				num=num/10;
			}			
			System.out.println("The reverse number is: "+rev);
			if(temp==rev) 												//If the reverse number is same as input it is palindrome number
			{
				System.out.println("Number is Palindrome.");
			}
			else 
			{
				System.out.println("Number is not Palindrome.");
			}
		
	}

}
}

	


