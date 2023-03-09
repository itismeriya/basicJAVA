public class Overriding 
{
	public static void main(String args[])
	{
		Human human1=new Human();
		human1.displayInfo();
		Girl human2=new Girl();
		human2.displayInfo();
	}
}
class Human
{
	public void displayInfo()
	{
		System.out.println("I AM HUMAN");
	}
}
class Girl extends Human
{
	public void displayInfo()
	{
		System.out.println("I AM GIRL");
	}
}