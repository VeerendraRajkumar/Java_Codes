package main;

import main.products.*;
import main.products.interfaces.*;
import main.invoice.*;
import java.util.List;
import main.utility.Validator;
import java.util.ArrayList;
import java.util.Date;
import java.util.Collections;

public class InvoiceApp
{
	public static void main(String[] args)
	{
		Product p = null;
		String productCode = null;
		int quantity = 1;
		ProductOrder p1 ;
		List<ProductOrder> l = new ArrayList<ProductOrder>();
		
		while(true)
		{
			productCode = Validator.getString("\nEnter the product code:\t");
			if(productCode.equals("done"))
				break;
				
			else
				quantity = Validator.getInt("\nEnter quantity:");
			try
			{
			p1 = new ProductOrder(productCode,quantity);
			}
			catch (NullPointerException e)
			{
				System.out.println("No product matches this product code.");
				continue;
			}
			
			l.add(p1);
			Collections.sort(l);
		}//end of while loop
		
		Date d = new Date();
		String t = d.toString();
		t.concat(Integer.toString(ProductOrder.orderObjectCount));
		Invoice i1 = new Invoice(t,l);
		System.out.println(i1);
				
	}//end of main method
	 
}//end of Invoice app
