/*Q.3: Create a program in java to implement multilevel inheritance and hierarchical inheritance .
Take classes like : Doctor , Surgeon and Nurse
Create methods and show method overriding.
 */
package thursday_lab_24th_aug;
public class Surgeon extends Doctor
{
	String surgeryType;
	//Parameterized constructor
    Surgeon(String name,String specialization,String surgeryType)
    {
        super(name,specialization);
        this.surgeryType=surgeryType;
    }
    //overriding the introduce method from the parent class
    @Override
    void briefing()
    {
        System.out.println("Hello, I'm Dr. "+name+", a "+specialization+" surgeon specialized in "+surgeryType+" surgery");
    }
    void performopration() 
    {
        System.out.println("Performing "+surgeryType+" surgery...");
    }
}
