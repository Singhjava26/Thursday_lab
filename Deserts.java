import java.util.Scanner;

public class Deserts extends Main_food_class {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
	}
		// TODO Auto-generated method stub
		//first lets declare our variable for prices of Starters items..	
		
		//lets display	Deserts menus with price
		public void desert() {
			p = "applepie";
			q = "pudding";
			r = "cheesecake";
			s = "chocolate brownie";
			t = "cream caremel";

			u = 180;
			v = 160;
			w = 190;
			x = 160;
			y = 190;

			System.out.println("********* DESERTS MENU **********");
			System.out.println("Select deserts");
			System.out.println("P: "+p +"\t\tRs."+u);
			System.out.println("Q: "+q +"\t\tRs."+v);
			System.out.println("R: "+r +"\t\tRs."+w);
			System.out.println("S: "+s +"\t\tRs."+x);
			System.out.println("T: "+t +"\t\tRs."+y);


			select_menu_item();

		}

		

}
