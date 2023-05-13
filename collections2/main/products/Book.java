package main.products;

public class Book extends Product
{

	/**
		This is a subclass of Product class.
		
	*/
	private String author;
	
	public Book()
	{
		author="";
	}
	
	public Book(String code,String descrip,double price,String author)
	{
		super(code,descrip,price);
		this.author=author;
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String toString()
	{	
		return super.toString() + "Author     : "+ author + "\n";
	}
}
