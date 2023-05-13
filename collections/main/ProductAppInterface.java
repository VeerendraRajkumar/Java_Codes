package main;

import main.utility.*;
import main.products.*;
import main.products.db.*;
import main.products.interfaces.*;
import java.util.Arrays;

public class ProductAppInterface
{
	/**
		This is main class for interface.
	*/
	
	public static void main(String[] args)
	{
		
		int i=0;
		int index=0;
		char choice='y',tagChoice = 'y';
		String tag;
		Product[] array=new Product[10];
		
		while(choice == 'y')
		{
			String productCode = Validator.getString("\nEnter the product code.");
		
			Product temporary;
		
			temporary = ProductDB.getProduct(productCode);
			if(temporary == null)
				System.out.println("No product matches this product code.");
			else
			{	tagChoice = Validator.getChar("\nDo you want to enter a tag (y/n)?");
				 while(tagChoice == 'y')
				 {	
				 	tag = Validator.getLine("Enter tag :	");
				 	temporary.setTags(tag);
				 	
				 	tagChoice = Validator.getChar("\nDo you want continue entering a new tag (y/n)?");
				 }
				 array[index++]=temporary;
			}
				
			System.out.println("\nProduct Count : " + temporary.count + " .");

			choice = Validator.getChar("Continue (y/n)?");
		}
		
		System.out.println("\n\nProducts you have asked for are : \n");
		Arrays.sort(array,0,index);
		for(i = 0 ;i < index ; i++)
			System.out.println(array[i]);
	}
}
