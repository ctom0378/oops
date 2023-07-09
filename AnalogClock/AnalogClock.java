/*Java Program to Display a Clock using Applet*/
import java.applet.*;
import java.awt.*;
import java.util.*;
public class AnalogClock extends Applet implements Runnable
{
	Thread t;
	public void init()
	{
		setBackground(Color.cyan);
	}
	public void start()
	{
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
			try
			{
				repaint();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
	public void paint(Graphics g)
	{
		Calendar time = Calendar.getInstance();
		int hour = time.get(Calendar.HOUR_OF_DAY) % 12;
		int minute = time.get(Calendar.MINUTE);
		int second = time.get(Calendar.SECOND);
		double angle;
		int x,y;
		g.drawOval(100,100,300,300);
		String s="12";
		int i=0;
		while(i<12)
		{
			angle = Math.toRadians(30*(i-3));
			x = 250+(int)(Math.cos(angle)*135);
			y = 250+(int)(Math.sin(angle)*135);
			g.drawString(s,x,y);
			i++;
			s=String.valueOf(i);
		}
		g.setColor(Color.magenta);
		angle = Math.toRadians((30*hour)-90);
		x = 250+(int)(Math.cos(angle)*100);
		y = 250+(int)(Math.sin(angle)*100);
		g.drawLine(250,250,x,y);
		g.setColor(Color.red);
		angle = Math.toRadians((6*minute)-90);
		x = 250+(int)(Math.cos(angle)*115);
		y = 250+(int)(Math.sin(angle)*115);
		g.drawLine(250,250,x,y);
		g.setColor(Color.blue);
		angle = Math.toRadians((6*second)-90);
		x = 250+(int)(Math.cos(angle)*130);
		y = 250+(int)(Math.sin(angle)*130);
		g.drawLine(250,250,x,y);
	}
}

