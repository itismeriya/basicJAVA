import java.util.*;

class Vehicle
{
	
int wheel,speed;
	
public Vehicle(int w,int s)
	{
		
wheel=w;
		
speed=s;
	
}
}

class Car extends Vehicle
{	
	
int passenger;
	
public Car(int w,int s,int p)
	{
		
super(w,s);
		
passenger=p;
	
}
}

class Truck extends Vehicle
{
	
int load;
	
public Truck (int w,int s,int l)
	{
		
super(w,s);
		
load=l;

	}
}

class Checkvehicle
{
	public static void main(String argv[])
	{
		
Car c=new Car(4,160,3);
		
Truck t=new Truck(8,120,2000);
		
System.out.println("No of wheels of the car is:" +c.wheel);
		
System.out.println("speed of the car is:" +c.speed);
		
System.out.println("No of passengers in the car is:" +c.passenger);
		
System.out.println("No of wheels of the truck is:" +t.wheel);
		
System.out.println("speed of the truck is:" +t.speed);

		System.out.println("Load of the truck is:" +t.load);

		
if(c.speed>t.speed)
			
System.out.println("Car is faster");
		
else
			
System.out.println("Car is slower");

	}
}