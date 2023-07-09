//WAP to draw the Asokachakra

import java.awt.*;
import java.applet.*;

public class Asokachakra extends Applet
{
	public void paint(Graphics g)
	{
		
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

/*
<applet code="Asokachakra.class" width="500" height="500">
</applet>
*/
