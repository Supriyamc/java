import java.io.*;
import java.util.Scanner;

public class matrix{
 public static void main(String []args){

int i,j,k,m,n,p,q;
Scanner read=new Scanner(System.in);

System.out.println("enter order of matrix A");
m=read.nextInt();
n=read.nextInt();
int a[][]=new int[m][n];

System.out.println("enter order of matrix B");
p=read.nextInt();
q=read.nextInt();
int b[][]=new int[p][q];

int c[][]=new int[m][q];

if(n==p)
{
  System.out.println("enter elements of matrix A");
  for(i=0;i<m;i++)
  for(j=0;j<n;j++)
  a[i][j]=read.nextInt();

  System.out.println("enter elements of matrix B");
  for(i=0;i<p;i++)
  for(j=0;j<q;j++)
  b[i][j]=read.nextInt();

//System.out.println("product of 2 matrices is");
//c[i][j]=0;
for(i=0;i<m;i++)
{
 for(j=0;j<q;j++)
  {
   c[i][j]=0;
   for(k=0;k<p;k++)
   c[i][j]=c[i][j]+a[i][k]*b[k][j]; 
  }
}

System.out.println("product of 2 matrices is");
for(i=0;i<m;i++)
{
   System.out.println();
  for(j=0;j<q;j++)
  {
     System.out.print(c[i][j]+" ");
   }
}
}

else
System.out.println("matrices cannot be multiplied");

}
}