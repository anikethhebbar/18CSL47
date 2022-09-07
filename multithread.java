import java.util.*;
public class Multithread {

	public static void main(String[] args) {
		Num n= new Num();
		n.start();
	}

}
class Num extends Thread
{
	public void run()
	{
		int n =0;
		Random r= new Random();
		try {
			for(int i=0; i<5;i++)
			{
				n=r.nextInt(100);
				System.out.println("The generated Number is "+n);
				Thread t2=new Thread(new SNum(n));
				t2.start();
				
				Thread t3=new Thread(new CNum(n));
				t3.start();
				Thread.sleep(1000);
				
			}
		}
		catch(Exception e)
			{
				System.out.println("Exception"+e);
			}
		
		}
	}
	
class SNum implements Runnable 
	{
		public int x;
		public SNum (int x)
		{
			this.x=x;
		}
		public void run()
			{
				System.out.println("Second thread: Square of the number is: "+x*x);
			} 
	}
class CNum implements Runnable 
{
	public int x;
	public CNum (int x)
	{
		this.x=x;
	}
	public void run()
		{
			System.out.println("Second thread: Square of the number is: "+x*x);
		} 
}

