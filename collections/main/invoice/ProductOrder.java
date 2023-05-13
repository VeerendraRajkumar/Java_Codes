package main.invoice;

import main.products.*;
import main.products.db.*;
import main.products.interfaces.*;
import java.lang.*;

public class ProductOrder implements Comparable<ProductOrder>
{
	private Product p;
	private int quantity = 0;
	private double total = 0;
	public static int orderObjectCount;
	
	public ProductOrder(String productCode,int quantity) throws NullPointerException
	{
		p = ProductDB.getProduct(productCode);
		this.quantity = quantity;
		total = p.getPrice()*quantity;
		ProductOrder.orderObjectCount++;
	}
	
	public double getTotal()
	{
		return this.total;
	}
	
	public int compareTo(ProductOrder q)
	{
		if(this.total==q.total)
			return 0;
		else if(this.total > q.total)
			return 1;
			return -1; 
	}
	
	public String toString()
	{
		return  "\n" + p + 
		"\nQuantity: " + quantity +
		"\tTotal: " + total +
		"\torderObjCnt: " + ProductOrder.orderObjectCount + "\n";	
	}
	
}
