/**
 * This files contains the desired operations on rationalnumbers.
 * Author @Rajkumar.
 */
 public class OperationsOnRationalNumbers
 {
 	public static void main(String[] args)
 	{
 		char choice = 'y';
 		int option = 0;
 		int num,den;
 		
 		System.out.println("\nEnter a rationalnumber.");
 		num = Validator.getInt("Enter the numerator.\t");
 		den = Validator.getInt("Enter the denominator.\t");
 		
 		RationalNumber n1 = new RationalNumber(num,den);
  		RationalNumber n2 = new RationalNumber(6,7);		
 		RationalNumber r = new RationalNumber();
 		
 		while(choice == 'y')
 		{
 			option = Validator.getInt("\nEnter :\n(1) GCD \n(2) ReducedFraction\n(3) DoubleValue\n(4) Add\n(5) Subtract\n(6) Multiply\n(7) Divide\n\t",0,8);
 			switch(option)
 			{
 				case 1:
 					System.out.println("Gcd		 : \t" + n1.getGcd() );
 					break;
 				case 2:
 					System.out.println("ReducedFraction :\t" + n1);
 					break;
 				case 3:
 					System.out.println("DoubleValue : \t" + n1.getDoubleValue());
 					break;
 				case 4: 
 					r = n1.add(n2);
 					System.out.println("Sum 	:" + r );
 					break;
 				case 5:
 					r = n1.subtract(n2);
 					System.out.println("Difference  :" + r);
 					break;
 
  				case 6:
 					r = n1.multiply(n2);
 					System.out.println("Product    :" + r);
 					break;
 		
  				case 7:
 					r = n1.divide(n2);
 					System.out.println("Quotient   :" + r);
 					break;
 					
 				default:
 					System.out.println("Enter proper input.");
 			}
 			choice = Validator.getChar("\nContinue (y/n)?");
 		}
 	}
 } 
