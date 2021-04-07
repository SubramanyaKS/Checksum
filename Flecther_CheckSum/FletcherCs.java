//Implementation of Algorithm to
//calculate 8-bit Fletcher checksum
import java.util.*;
import java.lang.*;
import java.io.*;

public class FlectherCs
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		String b[];
		int r=0,l=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		System.out.println("Enter the data");	//data to be sent
		for(int i=0;i<n;i++)
		{//data is read in decimal and sent in binary format
			a[i]=in.nextInt();		
		}
		b=new String[n];
		System.out.println("The Binary Format is :");
		for(int i=0;i<n;i++)
		{
			b[i]=Integer.toBinaryString(a[i]);
			
			if(b[i].length()!=4)
			{
				b[i] = "0"+b[i];
			}
			System.out.println(a[i]+":"+b[i]);			
		}
		for(int i=0;i<b.length;i++)
		{
			r=(r+a[i])% 256;
			l=(l+r)% 256;
		}
		System.out.println("r:"+r);
		System.out.println("l:"+l);
		//checksum in decimal format
		int checksum=(l*256)+r;
		System.out.println("checksum:"+checksum);
		//checksum in binary format
		String cs=Integer.toBinaryString(checksum);
		System.out.println("checksum:"+cs);
		
	}
}
