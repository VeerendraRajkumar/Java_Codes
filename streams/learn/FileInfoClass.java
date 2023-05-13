import java.io.*;

public class FileInfoClass 
{
	public static void main(String args[]) 
	{
	 String fileName = args[0];
	 File fn = new File(fileName);
	 System.out.println("Name: " + fn.getName());
	 if (!fn.exists()) 
	 {
	  System.out.println(fileName + " does not exists.");
	  /* Create a temporary directory instead. */
	  System.out.println("Creating temp directory...");
	 
	  fileName = "temp";
	  fn = new File(fileName);
	  fn.mkdir();
	  System.out.println(fileName + (fn.exists()? " exists": "does not exist"));
	 
	  System.out.println("Deleting temp directory...");
	  fn.delete();
	  System.out.println(fileName + " is a " +
(fn.isFile()? "file." :"directory."));
	}
	  if (fn.isDirectory()) 
	  {
	   String content[] = fn.list();
	   System.out.println("The content of this directory" + content );
	   for (int i = 0; i < content.length; i++) 
	   {
	    System.out.println(content[i]);
	   }
 	  }
 	  
 	  if (!fn.canRead()) 
 	  {
	   System.out.println(fileName + " is not readable.");
	   return;
	  }
	  
	  System.out.println(fileName + " is " + fn.length() + " bytes long.");
	  System.out.println(fileName + " is " + fn.lastModified() + " bytes long.");

	  if (!fn.canWrite()) 
	  {
	   System.out.println(fileName + " is not writable.");
	  }
	}
}
