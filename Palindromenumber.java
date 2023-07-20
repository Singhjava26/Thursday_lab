import java.util.Scanner;       //Palindromenumber:121,111,252,535.222.......


public class Palindromenumber
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	
	int number1=sc.nextInt();
	int temp=number1;
	int reverse=0,rem;
	while(temp !=0)
	{
		rem=temp%10;
		reverse=reverse*10+rem;
		temp=temp/10;
			
	}
	if(number1==reverse)
	{
		System.out.println(number1+" is palindrome number");
	}
	else
	{
		System.out.println(number1+"is not palindrome number");
	}

	}

}



































/*int a,number,b,tempt=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter any number: ");
number=s.nextInt();
b=number;
while(number>0)
{
a=number%10;
number=number/10;
Tempt=temp*10+a;
}
if(tempt==b)
{
System.out.println(number+"is Palindrome:");
}
else
{
System.out.println(number+"not Palindrome:");
}
}
}
*/






