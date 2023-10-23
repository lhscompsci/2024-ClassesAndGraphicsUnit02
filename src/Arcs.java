//graphics example for arcs

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Arcs extends Canvas
{
    public Arcs()
    {
        setBackground(Color.WHITE);
    }

    public void paint( Graphics window )
    {
        window.setColor(Color.BLACK);
        window.drawString("Arcs ", 50, 50);

        window.setColor(Color.BLUE);

        //drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        window.drawArc(100,100,40,40,90,90);

        window.setColor(Color.GREEN);
        window.drawArc(100,175,50,50,0,-180);

        window.setColor(Color.RED);
        window.drawArc(100,250,50,50,0,270);

        window.setColor(Color.ORANGE);
        window.drawArc(100,325,50,50,180,-180);
    }
}