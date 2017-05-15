import java.applet. Applet;
import java.awt.*;
import java.awt.event.*;

public class ClickMe extends Applet implements MouseListener
{
	private Spot spot = null;
	private static final int RADIUS = 7;

	public void init()
	{
		addMouseListener(this);
	} // end init method

	public void paint(Graphics g)
	{
		// draw a black border and a white background
		g.setColor(Color.white);
		g.fillRect(0, 0, getSize().width - 1, getSize().height - 1);
		g.setColor(Color.black);
		g.drawRect(0, 0, getSize().width - 1, getSize().height - 1);

		// draw the spot
		g.setColor(Color.red);
		if (spot != null)
		{
			g.fillOval(spot.x - RADIUS, spot.y - RADIUS, RADIUS * 2, RADIUS *2);
		}
	} // end paint method

	public void mousePressed(MouseEvent event)
	{
		if (spot == null)
		{
			spot = new Spot(RADIUS);
		}

		spot.x = event.getX();
		spot.y = event.getY();
		repaint();

	} // end mousePressed method

	public void mouseClicked(MouseEvent event) {}
	public void mouseReleased(MouseEvent event) {}
	public void mouseEntered(MouseEvent event) {}
	public void mouseExited(MouseEvent event) {}
} // end ClickMe class



/*
To create a new applet in JCreator:
File -> New -> File -> Other folder -> HTML Applet.  Name the applet ClickMe.html
Change the line code

= ".class"   to      code

= "ClickMe.class"

Be sure to compile both the ClickMe.java and Spot.java files so object files are created.
Compile and run the ClickMe.html file.*/
