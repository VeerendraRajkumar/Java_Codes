package main;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import main.products.*;
import main.products.db.*;
import main.products.interfaces.*;
import main.utility.Validator;

public class ProductApp1
{
	public static void main(String[] args)
	{
		int i=0;
		int index=0;
		char choice='y';
		Product temporary = null;
		List<Product> l = new LinkedList<Product>();
		
		while(choice=='y')
		{
			String productCode = Validator.getString("\nEnter the product code.    ");
			
			temporary = ProductDB.getProduct(productCode);
			if(temporary == null)
				System.out.println("No product matches this product code.");
			else
				l.add(temporary);
								
			System.out.println("\nProduct Count : " + Product.count + " .");

			choice = Validator.getChar("\nContinue (y/n)?");
		}
		
		//
		Collections.sort(l,temporary.getPriceComparator());
		System.out.println( "\nSorting  using price comparator.\n\n" + l );
		
		Collections.sort(l,temporary.getCodeComparator());
		System.out.println( "\nSorting  using code comparator.\n\n" + l );
		
		Collections.sort(l,temporary.getPriceComparatorDescending());
		System.out.println( "\nSorting  using price comparator descending.\n\n" + l );	

	}
}
