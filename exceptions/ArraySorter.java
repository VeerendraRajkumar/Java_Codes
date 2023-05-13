package exceptions;

import java.util.*;
import java.lang.*;

public class ArraySorter
{	
	int[] array = new int[20];
	
	public ArraySorter() throws IllegalArgumentException
	{
	  Random rand = new Random(); 
          int i;
          for(i=0;i<20;i++)
           array[i] = rand.nextInt(200); 
        }
	
	public ArraySorter(int maxRange)throws IllegalArgumentException
	{
	  Random rand = new Random(); 
          int i;
          for(i=0;i<20;i++)
           array[i] = rand.nextInt(maxRange); 		
	}
	
	public void getSorted() throws MyOwnException, ArrayIndexOutOfBoundsException
	{
		Arrays.sort(this.array,0,10);
	}
	
	public String toString()
	{
		return "Line 1 : " + array[0] + " " + array[1] + " " + 
			array[2] + " " + array[3] + " " + array[4] + " " +
			array[5] + " " + array[6] + " " + array[7] + " " +
			array[8] + " " + array[9] + " " + "\nLine 2 : " +
			array[10] + " " + array[11] + " " + array[12] + " " +
			array[13] + " " + array[14] + " " + array[15] + " " +
			array[16] + " " + array[17] + " " + array[18] + " " + array[19] + " \n";
	}
}
