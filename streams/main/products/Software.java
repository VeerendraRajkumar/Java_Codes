package main.products;

import java.io.*;

public class Software extends Product 
{
	/**
		This is a subclass of the Product class.
	*/
	
	private String version;
	
	public Software()
	{
		version="";
	}
	
	public Software(String code,String descrip,double price,String version)
	{
		super(code,descrip,price);
		this.version=version;
	}
	
	public void setVersion(String version)
	{
		this.version=version;
	}
	
	public String getVersion()
	{
		return version;
	}
	
	public String toString()
	{
		return super.toString() + "Version    : "+ version + "\n";
	}
}
