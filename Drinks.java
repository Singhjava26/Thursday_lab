import java.util.Scanner;

public class Drinks extends Main_food_class
{

	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
	
		public void drinks() 
	{
	// TODO Auto-generated method stub
	//first lets declare our variable for prices of Starters items..	
		
		p="sprite";
		q= "orangejuice";
		r= "grapesoda";
		s= "greentea";
		t= "coffee";
		
		u = 180;
		v = 160;
		w = 150;
		x = 160;
		y = 150;
				
		//lets displaying our starter menu...
		//i've tried to make it look good:...
								
		System.out.println("********* DRINKS MENU **********"); 
		System.out.println("Select drinks");
		System.out.println("A: "+p +"\t\tRs."+u);
		System.out.println("B: "+q +"\t\tRs."+v);
		System.out.println("C: "+r +"\t\tRs."+w);
		System.out.println("D: "+s +"\t\tRs."+x);
		System.out.println("D: "+t +"\t\tRs."+y);
		
		
		//Main_food_class obj=new Main_food_class();
		select_menu_item();
						
	}

	
}
		
		
		




