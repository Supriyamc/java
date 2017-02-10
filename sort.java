import java.io.*;
import java.util.Scanner;

public class sort{
 public static void main(String[]args){

Scanner read=new Scanner(System.in);
int i,j,temp,n;
System.out.println("enter size of array");
n=read.nextInt();
int a[]=new int[n];

System.out.println("enter elements of array");
for(i=0;i<n;i++)
a[i]=read.nextInt();

for(i=0;i<n;i++)
{
  for(j=0;j<n-1;j++)
   {
     if(a[j]>a[j+1])
	{
	  temp=a[j];
	   a[j]=a[j+1];
	   a[j+1]=temp;
	}
   }
}

System.out.println("sorted array is ");
for(i=0;i<n;i++)
System.out.println(" "+a[i]);
}
}