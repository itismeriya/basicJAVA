import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args) 
    {
	int n,a=0,b=0,c=1,i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a no:");
	n=s.nextInt();
	System.out.println("Fibonacci series:");
	for(i=0;i<=n;i++)
	{
		a=b;
		b=c;
		c=a+b;
		System.out.println(a+" ");
	}
    }
}
