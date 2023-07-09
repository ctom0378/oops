//WAP to draw the indian flag

import java.awt.*;
import java.applet.*;

public class flag extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(150,50,10,500);
		
		g.setColor(Color.orange);
		g.fillRect(160,50,200,50);
		
		g.setColor(Color.white);
		g.fillRect(160,100,200,50);
		
		g.setColor(Color.green);
		g.fillRect(160,150,200,50);
		
		g.setColor(Color.blue);
		g.drawOval(240,100,50,50);
		
		g.drawLine(265,100,265,150);
		g.drawLine(240,125,290,125);
		
		g.drawLine(280,107,250,143);
		g.drawLine(250,107,280,145);
		
		g.drawLine(258,102,272,147);
		g.drawLine(273,102,258,147);
		
		g.drawLine(287,115,245,135);
		g.drawLine(245,115,287,135);
	}	
}
