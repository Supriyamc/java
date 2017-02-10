//polynomial

import java.io.*;
import static java.lang.Math.pow;
import java.util.Scanner;
public class poly
{
   int deg;
   float c[]=new float[100];
   
	float nrm(float x)
	{
	  x=x-f(x)/fd(x);
	  return x;
	}

	
	float f(float a)
	{
	  int k=0;
	   for(int i=0;i<deg+1;i++)
	   k+=c[i]*pow(a,deg-i);
	   return k;
	}

	float fd(float a)
	{
	  int k=0;
	  for(int i=0;i<deg;i++)
	  k+=c[i]*(deg-i)*pow(a,deg-i-1);
	  return k;
	}

public static void main(String[]args)
{
 Scanner read=new Scanner(System.in);
 poly p=new poly();

System.out.println("enter deg of polynomial");
p.deg=read.nextInt();

System.out.println("enter coefficients ");
for(int i=0;i<p.deg+1;i++)
p.c[i]=read.nextFloat();

System.out.println("enter assumned root");
float result=read.nextFloat();

System.out.println("enter no of iterations");
int iterations=read.nextInt();

while(iterations-->0){

result=p.nrm(result);
}
System.out.println("result= "+result);
}
}