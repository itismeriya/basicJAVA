import java.util.Scanner;
public class Areacircle
{
    public static void main(String[] args) 
    {
	int r;
	double pi=3.14,area;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter radius of  circle:");
	r=s.nextInt();
	area=pi*r*r;
	System.out.println("Area of a circle:"+area);
     }
}