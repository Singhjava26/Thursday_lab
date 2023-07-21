import java.util.Scanner;

public class Main_Course extends Main_food_class 
{
	
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) 
	{
		//first lets declare our variable for prices of Starters items..
		// TODO Auto-generated method stub
		
		p= "butterpaneer";
		q= "vegpulav";
		r= "rajmachawal";
		s= "dalmakhani";
		t= "vegbiryani";
		
		
		u = 200;
		v = 200;
		w = 200;
		x = 180;
		y = 150;
		

		
		//lets displaying our starter menu...
		//i've tried to make it look good:...
				
		System.out.println("********* MAIN COURCE *********"); 
		System.out.println("Select Main course");
		System.out.println("P: "+p +"\t\tRs."+u);
		System.out.println("Q: "+q +"\t\tRs."+v);
		System.out.println("R: "+r +"\t\t\tRs."+w);
		System.out.println("S: "+s +"\t\t\tRs."+x);
		System.out.println("T: "+t +"\t\t\tRs."+y);
		

		select_menu_item();
}

	

}


