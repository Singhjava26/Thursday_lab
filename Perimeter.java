/*Q.1: Write a class with the name Perimeter using function overload that computes the perimeter of a square, a rectangle and a circle.
Formula:
Perimeter of a square=4*s
Perimeter of a rectangle=2*(l+b)
Perimeter of a circle=2*(22/7)*r*/

package thursday_lab_24th_aug;

import java.util.Scanner;

public class Perimeter
{
	// Calculate perimete of a square
	   public double perimeter(double s)
	   {
	        double p = 4 * s;
	        return p;
	    }
	   
	// Calculate perimeter of a rectangle
	    public double perimeter(double l, double b) 
	    {
	        double p = 2 * (l + b);
	        return p;
	    }
	    
	 // Calculate perimeter of a circle
	    public double perimeter(int c, double pi, double r) 
	    {
	        double p = c * pi * r;
	        return p;
	    }
	    
	    public static void main(String args[])						
	    									// TODO Auto-generated method stub
	    {
	        Scanner sc = new Scanner(System.in);
	        Perimeter obj = new Perimeter();
	        
	        System.out.print("Enter side of square: ");
	        double side = sc.nextDouble();
	        System.out.println("Perimeter of square is = " + obj.perimeter(side));
	        
	        System.out.print("Enter length of rectangle: ");
	        double l = sc.nextDouble();
	        System.out.print("Enter breadth of rectangle: ");
	        double b = sc.nextDouble();
	        System.out.println("Perimeter of rectangle is = " + obj.perimeter(l, b));
	        
	        System.out.print("Enter radius of circle: ");
	        double r = sc.nextDouble();
	        System.out.println("Perimeter of circle is= " + obj.perimeter(2, (22/7), r));

	    }
}
