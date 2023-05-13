package main;

import main.products.*;
import main.products.db.*;
import main.utility.*;

public class ProductApp
{
	/**
		This is a main class for inheritance assignment.
		This program takes productCode from the user and displays the appropriate
		product from the database ProductDB , if the entered input doesnot match
		any code in the database 
					"No product matches this product code." 
		is displayed.
	*/
	
	public static void main(String[] args)
	{
	
		char choice='y';
		
		while(choice=='y')
		{
		String productCode = Validator.getString("\nEnter the product code.");
		
		Product p=ProductDB.getProduct(productCode);
		if(p==null)
			System.out.println("No product matches this product code.");
		else
			System.out.println(p);
			
		System.out.println("\nProduct Count : " + p.getCount() + " .");

		choice=Validator.getChar("Continue (y/n)?");
		}
	}
}
