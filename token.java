import java.io.*;
import java.util.StringTokenizer;

public class token{
 public static void main(String[]args) throws Exception{
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
int count=0;
System.out.println("enter some text");
String text=obj.readLine();
System.out.println("enter word whose frequency is reqd");
String word=obj.readLine();
StringTokenizer st=new StringTokenizer(text);
while(st.hasMoreTokens())
{ 
  if(st.nextToken().equals(word))
  count++;
}

System.out.println("count="+count);
}
}
  