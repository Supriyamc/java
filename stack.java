import java.io.*;
import java.util.Scanner;

public class stack{
public static void main(String[]args)
{
int top=-1,n,i,item,choice;
Scanner read=new Scanner(System.in);
System.out.println("enter size of stack");
n=read.nextInt();
int st[]=new int[n];

for(;;)
{
  System.out.println("stack operation");
  System.out.println("1.push\n2.pop\n3.display\n4.return"); 
  System.out.println("enter choice");
  choice=read.nextInt();

switch(choice)
 {
 	case 1: if(top==n-1)
		System.out.println("stack overflow\n");
		System.out.println("enter element to be inserted\n");
		item=read.nextInt();
		st[++top]=item;
		break;
	
	case 2:if(top==-1)
		System.out.println("stack underflow\n");
		System.out.println("deleted element is "+st[top]);
		top--;
		break;

	case 3:if(top==-1)
		System.out.println("Stack overflow");
		System.out.println("elements of stack are\n");
		for(i=0;i<=top;i++)
		System.out.println(" "+st[i]);
		break;
	
	case 4:return;
	default:System.out.println("wrong choice");
}
}
}
}
