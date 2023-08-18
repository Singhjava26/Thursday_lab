//Q.4 Write a Java program which creates only one object. If user attempts to create second object, he should not be able to create it. (Using user defined Exception).
//Files are User_define_exception.java, User_defined.java, Main_class.java

package Thursday_lab_17_aug;
public class User_define_exception extends Exception
{

	 public User_define_exception(String message)		//Creating constructor who will throw the message in parameter
	    {
	        super(message);
	    }
}
