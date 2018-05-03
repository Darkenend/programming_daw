package ex1;

import java.awt.*;
import java.applet.*;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class DrawShapes extends Applet {
    Font font;
    Color redColor, blueColor, backgroundColor;
    @Override
    public void init() {
        font = new Font("Arial", Font.ITALIC,18);
        redColor = Color.red;
        blueColor = new Color(0, 0, 122);
        backgroundColor = Color.orange;
        setBackgroundColor(backgroundColor);
    }

    public void stop() {}

    public void paint(Graphics graph) {
        graph.setFont(font);
        graph.drawString("Draw Shapes", 90, 20);
        graph.setColor(Color.black);
        graph.drawRect(120,120,120,120);
        graph.fillRect(115,115,90,90);
        graph.setColor(Color.white);
        graph.fillArc(110,110,50,50,0,360);
        graph.setColor(new Color(55,55,55));
        graph.drawRect(50,50,50,50);
        graph.fillRect(50,50,60,60);
    }

    //Getters and Setters
    public Color getBackgroundColor() {
        return backgroundColor;
    }
    public Color getBlueColor() {
        return blueColor;
    }
    public Color getRedColor() {
        return redColor;
    }
    @Override
    public Font getFont() {
        return font;
    }
    public void setBlueColor(Color blueColor) {
        this.blueColor = blueColor;
    }
    @Override
    public void setFont(Font font) {
        this.font = font;
    }
    public void setRedColor(Color redColor) {
        this.redColor = redColor;
    }
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
