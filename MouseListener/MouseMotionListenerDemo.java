//WAP to display the mouse motion listener
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseMotionListenerDemo extends Applet implements MouseMotionListener
{
	String txt="", msg="";
	int x=100,y=50,cx=0,cy=0;
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent m)
	{
		txt="Mouse Dragged";
		repaint();
	}
	public void mouseMoved(MouseEvent m)
	{
		cx=m.getX();
		cy=m.getY();
		msg="("+cx+","+cy+")";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.setFont(new Font("name",1,20));
		g.drawString(msg,cx,cy);
		g.drawString(txt,x,y);
		
	}
}

