import java.util.Scanner;
public class Multable
{
    public static void main(String[] args) 
    {
	System.out.println("Enter a no:");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i;
	for(i=1;i<=10;i++)
	{
		int mul=n*i;
		System.out.println(n+"*"+i+"="+mul);
	}
      }
}