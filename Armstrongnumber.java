import java.util.Scanner;   //Armstrongnumber:0,1,153,370,371,407,1634.....

public class Armstrongnumber 
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	
	int number=sc.nextInt();
	int t1=number;
	int length=0;
	while(t1 !=0)
	{
		length=length+1;
		t1=t1/10;
	}
	
	int t2=number;
	int arm=0;
	while(t2 !=0)
	{
		int mul=1;
		int rem = t2%10;
		for(int i=1;i<=length;i++)
		{
			mul=mul*rem;
		}
		arm=arm+mul;
		t2=t2/10;
	}
	if(arm==number)
	{
		System.out.println("is armstrong number:");
	}
	else
	{
		System.out.println("is not armstrong number:");
	}
	
		

	}

}










































/*Scanner sc =new Scanner(System.in);
System.out.println("Enter a Number:");

int cube=0,remainder,check; 
int number=sc.nextInt();
check=number;
int original=number;
while(number>0)  
{ 
	
remainder=number%10;  
number=number/10;  
cube=cube+(remainder*remainder*remainder);

}  

if(check==cube)  
System.out.println(original+" Is Armstrong number"); 

else  
   System.out.println(original+" Is Not Armstrong number");  
*/