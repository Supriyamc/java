import java.io.*;

class str
{
String s1,s2;

int strig(String s1)
{
return (s1.length());
}

void strig(String s1,int a)
{
System.out.println("char at pos "+a+" is "+(s1.charAt(a)));
}


boolean strig()
{
return (s1.equals(s2));
}


void strig(String s1,String s2,String s3)
{
s2=s2.concat(s3);
System.out.println("concatenated string is "+(s1.concat(s2)));
}

void strig(String s1,String s2)
{
System.out.println("before copy s1= "+s1+" s2= "+s2);
s2=s1;
System.out.println("after copy s1= "+s1+" s2= "+s2);
}

}


class op{
  public static void main(String[]args){

BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
str s=new str();
String s1=new String();
String s2=new String();
String s3=new String();

int a,choice,ch=1;
while(ch==1)
 {
    try
   {
   System.out.println("string operations\n");
   System.out.println("1.String length\n2.String charAt\n3.String compare\n4.String concat\n5.String copy\n6.exit\n");
   System.out.println("enter choice");
   choice=Integer.parseInt(obj.readLine());

switch(choice)
{
	case 1:System.out.println("enter string");
	       s1=obj.readLine();
		System.out.println("length of string is "+s.strig(s1));
		break;
	
	case 2:System.out.println("enter string and pos of char");
		s1=obj.readLine();
		a=Integer.parseInt(obj.readLine());
		s.strig(s1,a);
		break;

	case 3:System.out.println("enter 2 strings to be compared");
		s.s1=obj.readLine();
		s.s2=obj.readLine();
		System.out.println("s1 equals s2 is "+s.strig());
		break;

	case 4:System.out.println("enter 3 strings");
		s1=obj.readLine();
		s2=obj.readLine();
		s3=obj.readLine();
		s.strig(s1,s2,s3);
		break;

	case 5:System.out.println("enter string");
		s1=obj.readLine();
		s2="java";
 		s.strig(s1,s2);
		break;

	case 6:return;

	default:ch=2;
}
}
catch(IOException e)
{
System.out.println();
}
}
}
}