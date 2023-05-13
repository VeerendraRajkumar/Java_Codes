package main;

import main.products.*;
import main.utility.*;
import main.products.db.*;

public class ProductAppArray
{
	/**
		This is a main class for inheritance assignment.
	*/
	
	public static void main(String[] args)
	{
		
		int i=0;
		int index=0;
		char choice='y';
		Product[] array=new Product[10];
		
		while(choice=='y')
		{
			String productCode = Validator.getString("\nEnter the product code.    ");
		
			Product temporary;
		
			temporary = ProductDB.getProduct(productCode);
			if(temporary==null)
				System.out.println("No product matches this product code.");
			else
				array[index++]=temporary;
				
			System.out.println("\nProduct Count : " + temporary.count + " .");

			choice = Validator.getChar("\nContinue (y/n)?");
		}
		
		System.out.println("\n\nProducts you have asked for are : \n");
		for(i=0;i<index;i++)
			System.out.println(array[i]);
	}
}
