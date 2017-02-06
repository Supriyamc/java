import java.io.*;
import java.util.Scanner;

class student
{
String name,reg_no;

void get_data()
{
Scanner read=new Scanner(System.in);
System.out.println("enter name");
name=read.next();
System.out.println("enter reg_no");
reg_no=read.next();
}

void put_data()
{
System.out.println("student details are");
System.out.println("name="+name);
System.out.println("reg_no="+reg_no);
}

}


class marks extends student
{
int m1,m2,m3;
void get_marks()
{
Scanner read=new Scanner(System.in);
System.out.println("enter marks1");
m1=read.nextInt();
System.out.println("enter marks2");
m2=read.nextInt();
System.out.println("enter marks3");
m3=read.nextInt();
}

void put_marks()
{
System.out.println("marks1= "+m1);
System.out.println("marks2= "+m2);
System.out.println("marks3= "+m3);
}
}

class inherit extends marks
{
void total_marks()
{
System.out.println("total="+(m1+m2+m3));
}
}


public class multi{
public static void main(String[]args)
{
inherit obj=new inherit();
obj.get_data();
obj.get_marks();
obj.put_data();
obj.put_marks();
obj.total_marks();
}
}
