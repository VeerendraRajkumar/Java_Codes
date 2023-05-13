package main;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import main.products.*;
import main.products.interfaces.Tagable;
import main.invoice.*;
import java.util.ArrayList;

public class SalesReport
{
	void report (List<Invoice> l)
	{
		Map < String,ProductOrder> sale = new HashMap< String,ProductOrder>();
		double grandTotal = 0;
		Iterator i = l.iterator();//Invoice list iterator
		Invoice in = null;//Invoice 
		List pol = null;//ProductOrder list
		ProductOrder npo = null,po = null;//npo = new productorder
		Product p1 = null;	
		
		while(i.hasNext())
		{
			in = (Invoice) i.next();
			
			pol = in.getList();
			Iterator li = pol.iterator();//ProductOrder list iterator
			
			while(li.hasNext())
			{
			 po = (ProductOrder)li.next();
			 p1 = (Product) po.getProduct();
			 if(sale.containsKey(p1.getCode()))
			 {	
			 	npo = new ProductOrder( p1.getCode() , sale.get(p1.getCode()).getQuantity() + po.getQuantity()); 
			 	sale.put(p1.getCode(),npo);
			 }
			 else
			 	sale.put(p1.getCode(),po);
			
			}//end of second while loop
			 
		 }//end of first while loop
		 
		 System.out.println("-----------------------------------------------------");
		 System.out.println("\n\nProductCode\tQnty_Sold\tPrice\t\tTotal\n");
		 for(Map.Entry< String,ProductOrder > item : sale.entrySet())
		 {
		 	po = (ProductOrder)item.getValue();
		 	p1 = (Product) po.getProduct();
		 	grandTotal += po.getTotal();
		 	System.out.println(p1.getCode()+ "\t\t" + po.getQuantity() + "\t\t" + p1.getPrice() + "\t\t" + po.getTotal());	
		 }
		 
		 System.out.println("\n\n\t\t Today you have sold GrandTotal : " + grandTotal);
		 
	}//end of method report
	
}//end of class SalesReport	
