package main;

import java.io.*;
import java.net.*;
import java.util.*;
import main.utility.*;

public class Client
{
	public static void main(String[] args)
	{
	 InetAddress server = null;
	 Socket s = null;
	 BufferedReader ifs = null;
	 PrintWriter ots = null;
	 String txt = null;
	 String line = null;
	 StringTokenizer st = null;
	 
	 try
	 {
	  server = InetAddress.getByName("192.168.20.26");
	  s = new Socket(server,9999);
	  ifs = new BufferedReader ( new InputStreamReader ( s.getInputStream() ) );
	  ots = new PrintWriter(s.getOutputStream());
	 while(true)
	 {
	  while(true)
	  {
	  	line = ifs.readLine(); 
	  	if(!line.equals("-EOF-"))
	  	System.out.println(line);
	  	else
	  	 break;
	  }
	  
	  txt = Validator.getString("INPUT : ");
	  if(txt.equals("bye"))
	  break;
	  else
	  ots.println(txt);
	  ots.flush();
	 }
	 }
	 catch ( UnknownHostException uhe)
	 {
	  System.out.println("UnknownHostException" + uhe );
	 }
	 catch (IOException ioe)
	 {
	  System.out.println("IOException" + ioe );
	 }
	 
	try
	{
	 s.close();
	}
	catch ( IOException ioe)
	{
	 System.out.println("IOException" + ioe );
	}
	}
}
