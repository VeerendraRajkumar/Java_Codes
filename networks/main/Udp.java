package main;

import java.net.*;
import java.io.*;

public class Udp
{
	public static void main(String[] args)
	{
		DatagramSocket ds = null;
		FileInputStream fin = null;
		
		try
		{
		 ds = new DatagramSocket(9999);
		 fin = new FileInputStream("MyProductOrders");
		}
		catch (FileNotFoundException fne)
		{
		 System.out.println("FileNotFoundException" + fne);
		}
		catch (SecurityException see)
		{
		 System.out.println("SecurityException" + see);
		}
		catch ( SocketException soe)
		{
		 System.out.println("SocketException" + soe);
		}
		
		///////////////////////////////////////////////
		
		try 
		{ 
		 byte[] buf = fin.readAllBytes();
		 DatagramPacket dp = new DatagramPacket( buf,  buf.length, InetAddress.getByName("192.168.20.26"), 9999);
		 ds.send(dp);
		 byte[] buf2 = new byte[50];
		 dp = new DatagramPacket( buf2, 50, InetAddress.getByName("192.168.20.26"), 9999);
		 ds.receive(dp);
		 String ack = new String(dp.getData());
		 System.out.println("ack : " + ack );
		}
		catch (IOException ioe)
		{
		 System.out.println("IOException" + ioe);
		}
		
	}
}

