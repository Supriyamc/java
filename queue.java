import java.io.*;
import java.util.Scanner;

public class queue{
 public static void main(String[]args){

int front,rear,n,i,item,choice;
front=rear=-1;
Scanner read=new Scanner(System.in);
System.out.println("enter size of queue\n");
n=read.nextInt();
int q[]=new int[n];

for(;;)
{
  System.out.println("queue operations");
  System.out.println("1.insert\n2.delete\n3.display\n4.exit\n");
  System.out.println("enter choice");
  choice=read.nextInt();

switch(choice)
 {
   case 1:if(rear==n-1)
           System.out.println("queue overflow");
           System.out.println("enter element to be inserted");
           item=read.nextInt();
           q[++rear]=item;
           if(front==-1)
             front++;
           break;
  
  case 2:if(front==-1)
          System.out.println("queue underflow");
          System.out.println("deleted element is "+q[front]);
          front++;
          if (front==rear+1)
           front=rear=-1;
          break;
 
  case 3:if(front==-1)
         System.out.println("queue underflow");
         System.out.println("elements of queue are");
         for(i=front;i<=rear;i++)
         System.out.println(" "+q[i]);
         break;

  case 4:return;
  default:System.out.println("wrong choice");
}
}
}
}