/*Html code
<html>
<body>
<applet code="applet4.class" width="1000" height="500">
</applet>
</body>
</html>
*/

//applet4.java
import java.io.*;
import java.awt.*;
import java.lang.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class applet4 extends JApplet implements ActionListener
{
   JPanel p1,p2,p3;
   JLabel l1,l2,l3;
   JTextField input,result;
   JButton comp;

public void init()
{

  Container c=getContentPane();
  c.setLayout(new BorderLayout());
  l1=new JLabel("Enter a number"); 
  l2=new JLabel("factorial");
  l3=new JLabel("Applet program to compute factorial");
 
  input=new JTextField("",10);
  result=new JTextField(" ",10);
  comp=new JButton("Compute");
  comp.addActionListener(this);
  p1=new JPanel();
   p2=new JPanel();
   p3=new JPanel();

p1.add(l1);
p1.add(input);
p1.add(l2);
p1.add(result);

p2.add(comp);

p3.add(l3);


p1.setBackground(Color.cyan);
p2.setBackground(Color.blue);
p3.setBackground(Color.orange);
c.add(p3,BorderLayout.NORTH);
c.add(p1,BorderLayout.CENTER);
c.add(p2,BorderLayout.SOUTH);
  
}




public void actionPerformed(ActionEvent actionEvent)
{

int f=1;
int n=Integer.parseInt(input.getText());
for(int i=2;i<=n;i++)
f*=i;
result.setText(""+f);
}

}