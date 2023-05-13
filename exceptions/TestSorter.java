package exceptions;

import java.lang.*;

public class TestSorter
{
  public static void main(String[] argv)
   {
    	ArraySorter a=null;
    	int i;
    
   // try catch 1 
   		try
   		{
   			//System.out.println("In first try catch.");
   			//int val = Integer.parseInt(argv[0]);
   		 	a = new ArraySorter(Integer.parseInt(argv[0]));
   	 	}
   	 	catch(NumberFormatException e1)
   		{
  			System.out.println("!! Number Format Exception !!");
  			System.out.println("Incorrect maxRange format.");
  			e1.printStackTrace();
  			int maxRange = Validator.getInt("\nEnter appropriate maxRange : \t",-1);
  			a = new ArraySorter(maxRange);
   		}
   	  	catch(MyOwnException e1)
   		{
  			System.out.println("!! Illegal Argument Exception !!");
  			e1.printStackTrace();
  			int maxRange = Validator.getInt("\nEnter appropriate maxRange (>0) : \t",-1);
  			a = new ArraySorter(maxRange);
  			
   		}catch(ArrayIndexOutOfBoundsException e1)
   		 {
   		 	System.out.println("Array Index Out Of Bounds Exception");
   		 	System.out.println(" ");
   		 	e1.printStackTrace();
   		 	System.out.println("\nChoosing default settings.\n");
   		 	a=new ArraySorter();
   		 }
   
   //try catch 2		
   		 try
   		 {
   		 	//System.out.println("In second try catch.");
   	 		a.getSorted();
   	 		
   	 		//System.out.println("After sorting.");
   	 		System.out.print("Array :\n" + a);
   		 }
   		 catch(MyOwnException e1)
   		 {
   	 		System.out.println("!! Illegal Argument Exception (sub-class) !!");
   	 		e1.printStackTrace();
   		 }
   		 catch(ArrayIndexOutOfBoundsException e1)
   		 {
   		 	System.out.println("Array Index Out Of Bounds Exception");
   		 	System.out.println(" ");
   		 	e1.printStackTrace();
   		 }
   		 
   //dispose array
   
   		System.gc();   	
   }
}
