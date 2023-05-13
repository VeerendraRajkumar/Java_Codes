package main;

import main.products.*;
import main.products.interfaces.*;
import main.invoice.*;
import java.util.List;
import main.utility.Validator;
import java.util.ArrayList;
import java.util.Date;
import java.util.Collections;

public class SalesReportApp
{
	public static void main(String[] args)
	{
		Product p = null;
		String productCode = null;
		int quantity = 1;
		ProductOrder p1 ;
		
		char option = 'y';
		List<Invoice> li = new ArrayList<Invoice>();
		
		System.out.println("\n\nHello User, \n\t\"GOOD MORNING\"\n This is your SalesReportApp.");
		while(option == 'y')
		{
			List<ProductOrder> l = new ArrayList<ProductOrder>();
			while(true)
			{
				productCode = Validator.getString("\nEnter the product code:\t");
				if(productCode.equals("done"))
					break;
					
				else
					quantity = Validator.getInt("\nEnter quantity:",0);
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
			}//end of while loop2
			
			Date d = new Date();
			String t = d.toString();
			t.concat(Integer.toString(ProductOrder.orderObjectCount));
			Invoice i1 = new Invoice(t,l);
			li.add(i1);
			System.out.println(i1);
			option = Validator.getChar("\n\nContinue(y/n)?\t");
			}//end of while loop1
			
			SalesReport sp = new SalesReport();
			sp.report(li);
			System.out.println("\nThankYou for using SalesReportApp.\n");
			System.out.println("Hope you had a buzzling sales day.");
			System.out.println("Bye :) See you Soon.\n\n");
			System.out.println("| . . | . . | . . | . . | . . | . . | . . |");
			System.out.println("|  v  |  v  |  v  |  v  |  v  |  v  |  v  |\n");
				
	}//end of main method
	 
}//end of Invoice app
