import java.io.*;

public class exception{
 public static void main(String[]args){

BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
int a,b,result;
  try
   {
      System.out.println("enter values of a and b");
       a=Integer.parseInt(obj.readLine());
       b=Integer.parseInt(obj.readLine());
      result=a/b;
      System.out.println("result= "+result);
    }

catch(IOException e)
{
System.out.println("error in reading");
}

catch(ArithmeticException e)
{
System.out.println("error: number cannot be divided by zero");
}

catch(NumberFormatException e)
{
System.out.println("error :invalid integer");
}
}
}