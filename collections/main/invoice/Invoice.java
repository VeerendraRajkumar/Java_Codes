package main.invoice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Date;

public class Invoice
{
	private String invoiceNumber = null;
	private Date date = null;
	private List<ProductOrder> l = new ArrayList<ProductOrder> ();
	private double total=0;
	
	public Invoice(String invoiceNumber, List<ProductOrder> l)
	{	
		this.date = new Date();
		this.invoiceNumber = invoiceNumber;
		this.l = l;
		Iterator poit = l.iterator();
		ProductOrder p = null;
		while(poit.hasNext())
		{
		 p = (ProductOrder)poit.next();
		 this.total += p.getTotal();
		}
	} 

	public String toString()
	{
		return "\n\nInvoice Number:" + invoiceNumber +
			"\n\nDate:         " + date +
			"\n\nList of items:\n" + l + 
			"\n\nTotal:        " + total ;
	}
}

