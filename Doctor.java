package thursday_lab_24th_aug;
public class Doctor  
{
	String name;							//declaring string variable

	String specialization;
	Doctor(String name,String specialization)
	{
		this.name = name;
		this.specialization=specialization;
	}
	void briefing()
	{
		System.out.println("Hello, I'm Dr. "+name+" and I'm a "+specialization);
	}

}
