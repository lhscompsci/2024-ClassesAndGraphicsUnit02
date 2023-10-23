import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Rectangles extends Canvas
{
    public Rectangles()
    {
        setBackground(Color.white);
    }

    public void paint( Graphics window )
    {
        window.setColor(Color.BLACK);
        window.drawString("Squares - Rectangles", 100, 50);

        window.setColor(Color.BLUE);
        //fillRect(int x1, int y1, int width, int height)
        window.fillRect(100, 100, 100, 20 );

        window.setColor(Color.GRAY);
        window.drawRect(100,150,50,40);

        window.setColor(Color.RED);
        window.fillRect(100,200,40,40);

        window.setColor(Color.BLUE);
        window.drawRect(100,250,20,40);

        window.setColor(Color.ORANGE);
        window.fillRect(100,300,90,20);
    }
}