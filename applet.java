
/*
 * <html>
 * <body>
 * <applet code="applet.class"  width="2000"  height="1000">
 * <param name= "sname" value="Montotype Corsiva">
 * <param name="fsize" value="38">
 * </applet>
 * </body>
 * </html>
 */

import java.io.*;
import java.awt.*;
import java.lang.*;

public class applet extends java.applet.Applet {
	String name,fsize,fstyle,code,document;
	int n;
	
	public void init()
	{
		name=getParameter("sname");
		fsize=getParameter("fsize");
		n=Integer.parseInt(fsize);
		code=getCodeBase().toString();
		document=getDocumentBase().toString();
	}
	
	public void paint(Graphics g)
	{
		Font f=new Font(name,Font.BOLD,n);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("Java lab",10, 100);
		
		g.setColor(Color.blue);
		g.drawString(code, 10, 150);
		
		g.setColor(Color.green);
		g.drawString(document, 10, 200);
	}

}
