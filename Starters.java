import java.util.Scanner;

public class Starters extends Main_food_class
{
	
	
	static Scanner sc1=new Scanner(System.in);
	

	public static void main(String[] args) 
	{
		//first lets declare our variable for prices of Starters items..	
		// TODO Auto-generated method stub
	}	
		public void starter() {
			
		
		p= "paneertikka";
		q= "paneerkebab";
		r= "dahikebab";
		s= "khandhvi";
		t= "rajmakebab";
		
		
		u = 200;
		v = 200;
		w = 200;
		x = 200;
		y = 180;
		
		//lets displaying our starter menu...
		//i've tried to make it look good:...
		
		System.out.println("********* STARTERS MENU **********"); 
		System.out.println("Select Starter");
		System.out.println("P: "+p +"\t\tRs."+u);
		System.out.println("Q: "+q +"\t\tRs."+v);
		System.out.println("R: "+r +"\t\tRs."+w);
		System.out.println("S: "+s +"\t\tRs."+x);
		System.out.println("T: "+t+"\t\tRs."+y);

		//Main_food_class input=new Main_food_class();
		select_menu_item();
		
		
		
	}

		
}

