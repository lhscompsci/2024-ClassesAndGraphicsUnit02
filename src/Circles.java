//graphics example for circles/ovals

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Circles extends Canvas
{
    public Circles()
    {
        setBackground(Color.WHITE);
    }

    public void paint( Graphics window )
    {
        window.setColor(Color.BLACK);
        window.drawString("Circles - Ovals", 50, 30);

        window.setColor(Color.BLUE);

        //drawOval(int x1, int y1, int width, int height)
        window.drawOval(100,50,40,40);

        window.setColor(Color.GREEN);
        window.drawOval(100,100,100,50);

        window.setColor(Color.YELLOW);
        window.fillOval(100,150,50,50);

        window.setColor(Color.RED);
        window.fillOval(100,200,50,50);

        window.setColor(Color.BLUE);
        window.fillOval(100,250,80,80);
    }
}