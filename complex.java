//complex numbers


import java.io.*;
import static java.lang.Math.pow;

class complex_demo
{
  double real,img;
	
void add(int a,int b,int c,int d)
{
	real=a+c;
	img=b+d;
	System.out.println("addition of 2 complex nos= "+real+" "+img+"i");
}

void sub(int a,int b,int c,int d)
{
	real=a-c;
	img=b-d;
	System.out.println("subtraction of 2 comples nos: "+real+" "+img+"i");
}

void mul(int a,int b,int c,int d)
{
	//(a+ib)*(c+id)=(ac+ibc+aid-bd)
	real=a*c-b*d;
	img=b*c+a*d;
	System.out.println("product of 2 complex nos: "+real+" "+img+"i");
}

void div(int a,int b,int c,int d)
{
	//(a+ib)/(c+id)=(a+ib)*(c-id)/(c pow 2+d pow 2);
	real=(a*c+b*d)/(pow(c,2)+pow(d,2));
	img=(b*c-a*d)/(pow(c,2)+pow(d,2));
	System.out.println("divison of 2 complex nos: "+real+" "+img+"i");
}
}


public class complex
{
	public static void main(String[]args) throws Exception
	{

		complex_demo abc=new complex_demo();
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		int m,n,o,p;
		System.out.println("Enter complex no1: ");
		System.out.println("real= ");
		m=Integer.parseInt(obj.readLine());
		System.out.println("img= ");
		n=Integer.parseInt(obj.readLine());
		
		System.out.println("Enter complex no2: ");
		System.out.println("real= ");
		o=Integer.parseInt(obj.readLine());
		System.out.println("img= ");
		p=Integer.parseInt(obj.readLine());
		

		System.out.println("entered complex nos are");
		System.out.println("complex no1: "+m+" "+n+"i");
		System.out.println("complex no2: "+o+" "+p+"i");

		abc.add(m,n,o,p);
		abc.sub(m,n,o,p);
		abc.mul(m,n,o,p);
		abc.div(m,n,o,p);
	}
}	