import java.io.*;
class Volume
{
	void calvol(int x)
	{
		double vol;
		vol=x*x*x;
		System.out.println("The volume of Cube is: "+vol);
	}
	void calvol(float y)
	{
		double vol;
		vol=(4*(3.14*y*y*y))/3;
		System.out.println("The volume of Sphere is: "+vol);
	}
	void calvol(double z,double h)
	{
		double vol;
		vol=(3.14*z*z*h)/3;
		System.out.println("The volume of Cone is: "+vol);
	}
}
class NewVolume
{
	public static void main(String[] args)throws IOException
	{
		Volume obj=new Volume();
		obj.calvol(20);
		obj.calvol(30.00f);
		obj.calvol(5,10);
	}
}