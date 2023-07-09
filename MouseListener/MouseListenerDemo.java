import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseListenerDemo extends Applet implements MouseListener
{
	String txt="", msg="";
	int x=100,y=50,cx=0,cy=0;
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent m)
	{
		txt="Mouse clicked";
		repaint();
	}
	public void mouseEntered(MouseEvent m)
	{
		txt="Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent m)
	{
		txt="Mouse Exited";
		repaint();
	}
	public void mousePressed(MouseEvent m)
	{
		
		txt="Mouse Pressed";		
		setForeground(Color.blue);
		repaint();
	}
	public void mouseReleased(MouseEvent m)
	{
		txt="Mouse Released";
		setForeground(Color.red);
		repaint();
	}
	public void paint(Graphics g)
	{
		g.setFont(new Font("name",1,20));
		//g.drawString(msg,cx,cy);
		g.drawString(txt,x,y);
		
	}
}

/*
<applet code="MouseListenerDemo.class" width="500" height="500">
</applet>
*/

