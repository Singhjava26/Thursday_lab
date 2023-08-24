package thursday_lab_24th_aug;
public class Nurse extends Surgeon
{
	String currentRotation;  	//declaring string variable
    Nurse(String name,String specialization,String surgeryType,String currentRotation)
    {
        super(name,specialization,surgeryType);
        this.currentRotation=currentRotation;
    }
    @Override					//overriding method
    void briefing()
    {
        System.out.println("Hi there, I'm "+name+", a nurse currently in rotation for "+currentRotation);
    }
    void assistInopration()
    {
        System.out.println("Assisting in "+surgeryType+" surgery...");
    }
}
