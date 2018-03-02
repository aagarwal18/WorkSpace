import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Ball extends JComponent
{
	private int dy=0, dx=2;
	public Ball(int x, int y)
	{
		setLocation(x,y);
		setSize(100,100);
	}
	public void paintComponent(Graphics  a)
	{
		Graphics2D a2= (Graphics2D) a;
		Ellipse2D.Double baller= new Ellipse2D.Double(10,10,10,10);
		a2.setColor(Color.BLUE);
		a2.fill(baller);
	}
	
	public void setDY(int y)
	{
		dy=y;
	}
	public void setDX(int x)
	{
		dx=x;
	}
	public void update()
	{
		setLocation(getX()+dx, getY()+dy);
	}
		
	

}
