package Thursday_lab_17_aug;
//question no4
public class User_defined {

	public static void main(String[] args){
	}												// TODO Auto-generated method stub
		private static User_defined instance;
	    private User_defined() 
	    {
	        // Private constructor to prevent external instantiation
	    }

	    public static User_defined getInstance() throws User_define_exception 
	    {
	        if (instance == null)
	        {
	            instance = new User_defined();
	            return instance;
	        }
	        else
	        {
	            throw new User_define_exception("Another instance of User_defined class cannot be created.");
	        }
	}

}

