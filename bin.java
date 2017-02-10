//binary search

import java.io.*;

class binary
{

	void search(int a[],int n,int low,int high,int key)
	{
	  int mid=0,found=0;
	     while(low<=high)
		{
		  mid=(low+high)/2;
		  if(key==a[mid])
		    {
			found=1;
			break;
		    }
		else if(key<a[mid])
		 high=mid-1;
		else  low=mid+1;
		}
		
		if(found==1)
		System.out.println("element is found at pos "+(mid+1));
		else
		System.out.println("element not found");
	}


void search(double b[],int n,int low,int high,double k)
{
	
	int mid=0,found=0;
	     while(low<=high)
		{
		  mid=(low+high)/2;
		  if(k==b[mid])
		    {
			found=1;
			break;
		    }
		else if(k<b[mid]) high=mid-1;
		else  low=mid+1;
		}
		
		if(found==1)
		System.out.println("element is found at pos "+(mid+1));
		else
		System.out.println("element not found");
	}

}


public class bin
{
	public static void main(String[]args) throws Exception
	{
	int n,i,key;
	double k;
	BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
	binary abc=new binary();
	
	System.out.println("enter size of integer array");
	n=Integer.parseInt(obj.readLine());
	System.out.println("enter elements");
	int a[]=new int[n];
	for(i=0;i<n;i++)
	a[i]=Integer.parseInt(obj.readLine());
	System.out.println("enter element to be searched");
	key=Integer.parseInt(obj.readLine());
	abc.search(a,n,0,n-1,key);

	System.out.println("enter size of double array");
	n=Integer.parseInt(obj.readLine());
	System.out.println("enter elements");
	double b[]=new double[n];
	for(i=0;i<n;i++)
	b[i]=Double.parseDouble(obj.readLine());
	System.out.println("enter element to be searched");
	k=Double.parseDouble(obj.readLine());
	abc.search(b,n,0,n-1,k);
	}
}
			