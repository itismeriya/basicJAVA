import java.util.*;
public class Sortarrten
{
	public static void main(String args[])
	{
		int n,temp,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Ascending order:");
		for(i=0;i<n-1;i++)
		{
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n-1]);
	}
}