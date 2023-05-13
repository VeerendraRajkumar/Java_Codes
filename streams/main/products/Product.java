package main.products;

import main.products.interfaces.*;
import java.text.NumberFormat;
import java.lang.Comparable;
import java.io.*;

public class Product implements Comparable<Product>, Tagable, Serializable
{
    private String code;
    private String description;
    private double price;
    private String tag;
    public static int count = 0;

    public Product()
    {
        code = "";
        description = "";
        price = 0;
        tag = "";
    }

    public Product(String code,String descrip,double price)
    {
    	this.code = code;
    	this.description=descrip;
    	this.price=price;
    	this.tag="";
    	count++;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public String getFormattedPrice()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString()
    {	
    	if(tag.length() == 0)
    		return "Code:        " + code + "\n" +
               	"Description: " + description + "\n" +
               	"Price:       " + this.getFormattedPrice() + "\n";
	else
       		return "Code:        " + code + "\n" +
               	"Description: " + description + "\n" +
               	"Price:       " + this.getFormattedPrice() + "\n" +
               	"Tag(s):	" + tag + "\n";
    }

    public static int getCount()
    {
        return count;
    }
    
    public int compareTo(Product p)
    {
    	return this.getCode().compareTo(p.getCode());
    }
 
    public void setTags(String s)
    {
    	if(this.tag.length() == 0)
    		this.tag=s;
    	else
    		this.tag+=" , " + s;
    }
       
    public String getTags()
    {
    	return this.tag;
    }
    
}
