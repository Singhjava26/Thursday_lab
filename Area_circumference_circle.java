import java.util.Scanner;

public class Area_circumference_circle           // TODO Auto-generated method stub
{

	public static void main(String[] args)
	{
	
		int r ;
		double area,circumference ,pi=3.14;
		
		System.out.println("Enter Radius of Circle : " );
		Scanner obj=new Scanner(System.in);
		
		r=obj.nextInt();
		                                        // Area of a circle is pi*radius*radius
		area=pi*r*r;
		                                        // Area of a circumference is 2*Pi*radius
		circumference=2*pi*r;
		
		System.out.println(" Area of the circle is: "+area );
		System.out.println(" Circumference of the circle is: "+circumference);
		
	}  
}
   
	

	


