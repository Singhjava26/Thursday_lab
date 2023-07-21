import java.util.Scanner;

public class Main_food_class 
{

	public static void main(String[] args)
	{
		
	}
	
          //  lets declare  variable here for all class..

		static String p,q,r,s,t;
		static int u,v,w,x,y, sum=0;

           // static integers u,v,w,x,y,;

		static Scanner sc = new Scanner(System.in);


		public static void main1(String[] args) 
		{

               // main method to perform all operation

		System.out.println("\n\n>>>>>>>>>>>>>>>>> WELCOME TO NIRVANA <<<<<<<<<<<<<<<<<<<<<\n\n");
			Main_food_class obj = new Main_food_class();
			obj.select_menu();
		}



	     // function for select menu...
		public void select_menu() {
			System.out.println("Menu card\n ");
			System.out.println("\n1: Starter \n2: Main_Course \n3: Deserts \n:4 Drinks");
			System.out.println("\nEnter number from list you want: ");
			int s = sc.nextInt();

			switch(s){
				case 1 :{
					Starters st = new Starters();
					st.starter();
					break;
				}

				case 2 :{
					Main_Course mc = new Main_Course ();
					mc.Course();
					break;
				}

				case 3 :{
					Deserts des = new Deserts();
					des.desert();
					break;
				}

				case 4 :{
					Drinks dri = new Drinks();
					dri.drinks();
					break;
				}

				default:{
					System.out.println("!!!Please choose number from list...\n");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<< XXXXX >>>>>>>>>>>>>>>>>>>>>>");
					select_menu();
				}

			}
		}




            //	for select items from menu...
		public static void select_menu_item() {

			int items;
			char select;

			System.out.println("\nHow many items you want from the menu: ");
			items = sc.nextInt();

			System.out.println("\nSelect items (Note: type p,q,r,s,t...): ");

			while(items>0) {
				select = sc.next().charAt(0);
				if(select == 'p' || select == 'P'){
					System.out.println("p: "+ p);
					 sum+=u;
                 //					 sumu = sum;
				}
				else if(select == 'q' || select=='Q') {
					System.out.println("q: "+ q);
					sum+=v;
//					sumv = sum;
				}
				else if(select == 'r' || select=='R') {
					System.out.println("r: "+ r);
					sum+=w;
//					sumw = sum;
				}
				else if(select == 's' || select=='S') {
					System.out.println("s: "+ s);
					sum+=x;
//					sumx = sum;
				}
				else if(select == 't' || select=='T') {
					System.out.println("t: "+ t);
					sum+=y;
//					sumy = sum;
				}
				
				
				else {
					System.out.println("Sorry, this item not availabe....");
				}


				items--;
			}


			System.out.println("\nItems added..\n");
			System.out.println("|<<<<<<<<<<<<<<<<<<<<< XXXXXX >>>>>>>>>>>>>>>>>>>>>>|");
			System.out.println("\nAmount is: "+sum);
			System.out.println("|<<<<<<<<<<<<<<<<< XXXXXX >>>>>>>>>>>>>>>>>>>>>>>>>>|");

			repeat();


		}




                //	for repeating process ...
		public static void repeat() {
			System.out.println("Do you want anything else...(y / n)");

			char repeat = sc.next().charAt(0);

			if(repeat == 'y' || repeat == 'Y') {
				Main_food_class obj = new Main_food_class();
				obj.select_menu();
			}
			else {
				System.out.println("\n\n<<<<<<<<<<<<<<<< THANK YOU SEE YOU NEXT TIME... >>>>>>>>>>>>>>>>");
				System.out.println("The total Amount is: "+"Rs. "+sum+"/-");
			}


		}


	

	}


