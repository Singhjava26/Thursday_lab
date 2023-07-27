
public class Array_oprations extends Initial_var
{

		public void greatest()										//Greatest Number
		{
			System.out.println("<<<<<<<<<<< The Greatest Number >>>>>>>>>>>");
			numb=accept();
			grt=numb[0];
			for(i=0;i<numb.length;i++)
			{
		 		if(grt<numb[i])
				{
					grt=numb[i];
				}
			}
			System.out.println("The greater no is ="+grt);
		}
		
		public void smallest()										//Smallest Number
		{
			System.out.println("<<<<<<<<< The Smallest Number >>>>>>>>>>>>>");
			numb=accept();
			sml=numb[0];
			for(i=0;i<numb.length;i++)
			{
				if(sml>numb[i])
				{
					sml=numb[i];
				}
			}
			System.out.println("The smallest no is ="+sml);
			
		}
		
		public void ascending()										//Ascending Number
		{
			System.out.println("<<<<<<<<<<<<< Ascending Number  >>>>>>>>>>>");
			int[] num=accept();
			temp=0;
			for(i=0;i<size;i++)
			{
				for(j=i+1;j<size;j++)
				{
					if(num[i]>num[j])
					{
						temp=num[i];
						num[i]=num[j];
						num[j]=temp;
					}
				}
			}
			System.out.println("The ascending order is=");
			for(i=0;i<size;i++)
			{
				System.out.println(num[i]);
			}
		}
		
		public void descending()									//Descending Number
		{
			System.out.println("<<<<<<<<< The Descending Number  >>>>>>>>>>>>>>");
			int[] num=accept();
			temp=0;
			for(i=0;i<size;i++)
			{
				for(j=i+1;j<size;j++)
				{
					if(num[i]<num[j])
					{
						temp=num[i];
						num[i]=num[j];
						num[j]=temp;
					}
				}
			}
			System.out.println("The descending order is=");
			for(i=0;i<size;i++)
			{
				System.out.println(num[i]);
			}
		}
	}


		






																	// TODO Auto-generated method stub

	


