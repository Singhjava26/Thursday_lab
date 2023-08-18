package Thursday_lab_17_aug;
// question no2
public class Fibonacci_series_thread extends Thread {

	public static void main(String[] args) {
		
	}																// TODO Auto-generated method stub
		 private int n;
		    public Fibonacci_series_thread(int n) {
		        this.n = n;
		    }
		    @Override
		    public void run()
		    {
		        int prev=0,curr=1;									//initial values of fibonacci series
		        System.out.println("Fibonacci Series:");
		        for(int i=0;i<n;i++)
		        {
		            System.out.print(prev+ " ");
		            int next=prev+curr;
		            prev=curr;
		            curr=next;
		        }
	}

}
