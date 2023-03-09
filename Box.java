import java.util.*;
public class Box
{
	public double length;
                 public double height;
                 public double width;
                 Box(Double length, Double width, Double height) 
	{
		this.length = length;
                                   this.width = width;
                                   this.height = height;
                  }
                 public double volume() 
	{
                                   return this.height * this.width * this.length;
                  }
                 public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
                 System.out.print("enter length: ");
                 double length = sc.nextInt();
                 System.out.print("enter width: ");
                 double width = sc.nextInt();
                 System.out.print("enter height: ");
                 double height = sc.nextInt();
                 sc.close();
                 Box box = new Box(length, width, height);
                double vol = box.volume();
                System.out.println("Volume of Box is " + vol);
}
}
