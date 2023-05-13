package main;

import java.io.*;
import java.util.*;
import main.products.*;
import main.products.interfaces.*;
import main.invoice.*;
import java.util.List;
import main.utility.Validator;
import java.util.ArrayList;
import java.util.Collections;
import main.products.db.*;
import java.util.Date;

public class ReadMyFile
{

   public String getFile()
   {
   	return "orderFile.txt";
   }
   
   public Invoice getInvoice (BufferedReader in) throws IOException
   {
   	String line = null;
   	List<ProductOrder> l = new ArrayList<ProductOrder>();
   	StringTokenizer st = null;
   	ProductOrder po  = null;
   	
	while((line = in.readLine()) != null)
	{
 	 st = new StringTokenizer(line);
 	 try
	 {
		po = new ProductOrder(st.nextToken(),Integer.parseInt(st.nextToken()));
	 }
	 catch (NullPointerException e)
	 {
	  System.out.println("No product matches this product code.");
	  continue;
	 }
	 catch(NumberFormatException nfe)
	 {
	  System.out.println("Error in the contents of orderFile.\n");
	  continue;
	 }
	 l.add(po);
	 	
	}//end of while loop through file.
	
	Date d = new Date();
	Invoice i = new Invoice(d.toString(),l);
	return i;
   }
} 
