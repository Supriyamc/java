import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;




interface person{


    void setdata(String name, int age);

}



class student implements person{

 
   private String name;
   
 private int age;

 
   public void setdata(String name, int age){
      
  this.name = name;

        this.age = age;

   
     System.out.println("Student Details\n");
       
 System.out.println("Name = " + name);
      
  System.out.println("Age = " + age);
   
 }


}



class teacher implements person{

  
  private String name;

    private int age;

  
  public void setdata(String name, int age)
{

        this.name = name;
      
  this.age = age;

     
   System.out.println("Teacher Details\n");
        
System.out.println("Name = " + name);
  
      System.out.println("Age = " + age);
   
 }


}





public class interf {

    
public static void main(String[] args) throws IOException {


        student s = new student();
        
teacher t = new teacher();
      
  person p;
   
     BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
 
       String n;
     
   int a;

    
    p = s;

   
     System.out.println("Enter name: ");
  
      n = obj.readLine();

  
      System.out.println("Enter age: ");
      
  a = Integer.parseInt(obj.readLine());

  
      p.setdata(n,a);

  
      p = t;

   
     System.out.println("Enter name: ");
       
 n = obj.readLine();

    
    System.out.println("Enter age: ");
       
 a = Integer.parseInt(obj.readLine());

      
  p.setdata(n,a);


 

   }
}
