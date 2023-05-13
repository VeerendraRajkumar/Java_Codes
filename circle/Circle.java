import java.text.NumberFormat;
import java.lang.Math;

public class Circle
{
		private double radius;
		private double circumference;
		private double area;
		public static int count;
		
		public Circle(double radius)
		{
			this.radius=radius;
			this.circumference = getCircumference();
			this.area = getArea();
			count ++;
		}
		
		public double getCircumference()
		{
			return 2 * Math.PI * radius ;
		}
		
		public String getFormattedCircumference()
		{
			String out = " ";
			NumberFormat n1 = NumberFormat.getInstance();
			n1.setMaximumFractionDigits(2);
			out += n1.format(this.circumference);
			return out;
		}
		
		public double getArea()
		{
			return Math.PI * radius * radius ;
		}
		
		public String getFormattedArea()
		{
			String out = " ";
			NumberFormat n1 = NumberFormat.getInstance();
			n1.setMaximumFractionDigits(2);
			out += n1.format(this.area);
			return out;	
		}
		
		public static int getObjectCount()
		{
			return count;
		}
		
		public String toString()
		{
			return "Circumference : " + getFormattedCircumference() + " .\n"
				+ "Area 	: " + getFormattedArea() + " .\n";
		}
			
	public static void main(String [] args)
	{ 
		double radius=0.0;
		char choice = 'y';
		
		System.out.println("Welcome to the Circle Tester.");
		
		while(choice == 'y')
		{
			radius = Validator.getDouble("\nEnter radius : ",-1,100000000);
			Circle c1 = new Circle(radius);
			System.out.print(c1);
			choice = Validator.getChar("\nContinue (y/n) ? "); 
		} 
		System.out.println("\nYou have created " + Circle.getObjectCount() + " object(s).");
		System.out.println("GoodBye.");
	}
}
