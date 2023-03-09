import java.util.*;
public class Initial
{
	public static void main(String args[])
	{
		String name=new String();
		System.out.println("Enter your name:");
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		System.out.println("You entered:"+name);
		String temp=new String(name.toUpperCase());
		System.out.println(temp);
		char c=name.charAt(0);
		System.out.print(c);
		for(int i=1;i<temp.length();i++)
		{
			char c1=temp.charAt(i);
			if(c1==' ')
			{
				System.out.print(temp.charAt(i+1));
			}
		}
	}
}