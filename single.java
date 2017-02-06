import java.io.*;
import java.util.Scanner;

class student
{
 	String name,reg_no;
	int m1,m2,m3;

void get_data()
{
  Scanner read=new Scanner (System.in);
  System.out.println("enter name");
  name=read.next();
  System.out.println("enter reg_no");
  reg_no=read.next();
  System.out.println("enter marks1");
  m1=read.nextInt();
  System.out.println("enter marks2");
  m2=read.nextInt();
  System.out.println("enter marks3");
  m3=read.nextInt();
}

void put_data()
{
  System.out.println("Student details\n");
   System.out.println("name="+name);
   System.out.println("reg_no="+reg_no);
   System.out.println("marks1="+m1);
   System.out.println("marks2= "+m2);
   System.out.println("marks3="+m3);
}
}

class inherit extends student{

void total_marks()
{
System.out.println("total="+(m1+m2+m3));
}
}

public class single{
  public static void main(String[]args){

inherit obj=new inherit();
obj.get_data();
obj.put_data();
obj.total_marks();
}
}
