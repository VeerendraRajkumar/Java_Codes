import java.io.*;
public class test
{
	public static void main(String[] args)
	{
	try
	{
	String fileName = "orderFile";
	String l = null;
	File f = new File(fileName);
	
	FileReader fr = new FileReader(f);//"orderFile");//;
	BufferedReader order = new BufferedReader(fr);
	try
	{
	while((l = order.readLine()) != null)
	System.out.println("l : " + l + ".\n" );
	}
	catch(IOException ioe)
	{System.out.println("ioe");}
	System.out.println("Done.");
	}
	catch(FileNotFoundException fne)
	{
		System.out.println("FileNotFoundException.");
		return;
	}
		

	//fr = new FileReader("orderFile");
	//order = new BufferedReader(fr);	

	}
}
