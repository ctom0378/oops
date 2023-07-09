//Java Applet to Print Concentric Circles using Applet

import java.applet.*;
import java.awt.*;
import java.util.*;

public class ConcentricCircle extends Applet
{
    public void init()
    {
	setBackground(Color.white);
    }
    public void paint(Graphics g)
    {
	Random rg=new Random();
	int rad=25;
	int dia=50;
	for(int i=0;i<5;i++)
	{
	    int r=rg.nextInt(255);
	    int gr=rg.nextInt(255);
	    int b=rg.nextInt(255);
	    Color c=new Color(r,gr,b);
	    g.setColor(c);
	    g.drawOval(250-(i*rad),250-(i*rad),(i+1)*dia,(i+1)*dia);
	}
    }
}

