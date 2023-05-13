public class Bmi
{

	public static void main(String[] args)
	{
		double weight=0;
		double height=0;
		double bmi=0;
		char choice = 'y';
		int option=0;
		
		while(choice == 'y')
		{
			option = Validator.getInt("\nEnter <--I\n(1) kilogram/meter\n(2) pound/feet\n",0,3);
			switch(option)
			{
				case 1:
					weight = Validator.getDouble("\nEnter your weight(kg) :	");
					height = Validator.getDouble("Enter your height(m):	");
					bmi=weight/(height*2);
					break;
				case 2:
					weight = Validator.getDouble("Enter your weight(pound) :	");
					height = Validator.getDouble("Enter your height(feet):	");
					bmi = (weight*4.88)/(height*2);
					break;			
			}
			
			System.out.print("\n Your BMI is : " + bmi );
			
			if(bmi < 18.5 )
				System.out.println(" (Underweight).");
			else if(bmi >= 18.5 && bmi < 25)
				System.out.println(" (Normal).");
			else if(bmi >= 25 && bmi < 30)
				System.out.println(" (Overweight).");
			else if(bmi >= 30)
				System.out.println(" (Too Muscular / Obese).");
			
			choice = Validator.getChar("\nContinue (y/n)?	");
		}
	}
} 
