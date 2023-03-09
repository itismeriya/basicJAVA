import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args) 
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	int r,sum=0,temp=num;

	while(num>0)
	{
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
	}
	if(temp==sum)
	System.out.println("The entered number "+temp+" is a Palindrome number");
	else
	System.out.println("The entered number "+temp+" is not a Palindrome number");
      }
}