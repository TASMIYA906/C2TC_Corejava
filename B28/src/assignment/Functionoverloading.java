package assignment;

public class Functionoverloading 
{
 public static void Volume(int s) 
	{
		 int volume = (s*s*s);
		 System.out.println("The volume of Cube is " + volume);
	}
 public static void Volume(int l,int b,int h)
	{
		 int volume = (l*b*h);
		 System.out.println("The volume of Cuboid is " + volume);
	}
 public static void Volume(double pi,int r) 
	{
		 double volume = ((4/3)*pi*r*r);
		 System.out.println("The volume of Sphere is " + volume);
	}
 public static void main(String[] args) 
		  {
	            Volume (8);
				Volume(7,8,9);
				Volume(3.14,2);
			}
}

