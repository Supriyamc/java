import java.io.*;
import java.util.Scanner;

class A extends threads
{
	void run()
{
	System.out.println("thread A started");
	for(int i=0;i<5;i++)
	System.out.println("thread A:value of i="+i);
	System.out.println("thread A terminated");
}
}

class B extends threads
{
	void run()
{
	System.out.println("thread B started");
	for(int j=0;j<5;j++)
	System.out.println("thread B:value of j="+j);
	System.out.println("thread B terminated");
}
}

class C extends threads
{
	void run()
{
	System.out.println("thread C started");
	for(int k=0;k<5;k++)
	System.out.println("thread C:value of k="+k);
	System.out.println("thread C terminated");
}
}

public class threads
{
	public static void main(String[]args)
	{

		A a=new A();
		B b=new B();
		C c=new C();
		a.run();
		b.run();
		c.run();
	}
}