package thursday_lab_24th_aug;

public class Multilevel_inheritance 
{
	public static void main(String[] args) 
	{
		//Creating the object of Surgeon class and passing the values in parameter for parameterized constructor
        Surgeon surgeon=new Surgeon("David","Surgeon","Neuro");
        //Creating the object of Nurse class and passing the values in parameter for parameterized constructor
        Nurse nurse=new Nurse("Maya","Intern","Ortho","Orthopedics");
        //calling the methods
        surgeon.briefing();
        surgeon.performopration();
        nurse.briefing();
        nurse.assistInopration();
	}

}
