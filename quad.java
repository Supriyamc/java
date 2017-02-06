import java.io.*;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class quad{
public static void main(String[]args){
double a,b,c,d,r1,r2;
Scanner read = new Scanner(System.in);
System.out.println("enter variables\n");
a=read.nextFloat();
b=read.nextFloat();
c=read.nextFloat();

if(a==0)
System.out.println("not quadratic");

d=(b*b)-(4*a*c);

if(d==0)
{
System.out.println("roots are real and equal");
r1=(-b)/(2*a);
System.out.println("root1= "+r1);
System.out.println("root2= "+r1);
}

else if(d>0)
{
System.out.println("roots are real and distinct");
r1=((-b)+sqrt(d))/(2*a);
r2=((-b)-sqrt(d))/(2*a);
System.out.println("root1="+r1);
System.out.println("root2="+r2);
}

else
{
System.out.println("roots are imaginary");
r1=(-b)/(2*a);
r2=sqrt(-d)/(2*a);
System.out.println("root1= "+r1+"+i"+r2);
System.out.println("root2= "+r1+"i"+(-r2));
}

}
}