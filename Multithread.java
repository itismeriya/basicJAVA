
class B extends Thread
{
	public void run()
 	{
		System.out.println("--------lets check---------------");
  		for(int j=0;j<=10;i++)
  		{
			if(j==4) 
			{
				yield();
			} 
				System.out.println("From Class B, j= "+j);
		}
		System.out.println("--------happy ending--------------");
	}
}
class C extends Thread
{
	public void run()
	{
		System.out.println("--------let's check --------------");
 		for(int k=0;k<=10;k++)
		{
			if(k==3)
			{ 
				try
				{
					sleep(1000); 
				}
				catch(Exception e)
				{}
			}
			System.out.println("From Class C, k ="+k);
		}
		System.out.println("--------happy ending------------");
	}
}
class A extends Thread
{
	public void run()
	{
		System.out.println("--------let's check---------------");
 		for(int i=0;i<=10;i++)
 		{
 			if(i==2) 
			{
				stop();
			} 
				System.out.println("From Class A, i ="+i);
 		}
		System.out.println("--------happy ending---------------");
	}
}
public class Multithread
{
	public static void main(String[] args)
	{
  		
		new B().start();
		new C().start();
		new A().start();
	}
 }