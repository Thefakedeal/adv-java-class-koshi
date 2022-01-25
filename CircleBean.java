import java.io.Serializable;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;

public class CircleBean extends Canvas implements Serializable{
    private int x;
    private int y;
    private int radius;
    private Color color;

    CircleBean(){
        this.x= 0;
        this.y= 0;
        this.radius= 100;
        this.color = Color.RED;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }
    
    public void setColor(Color color){
        this.color = color;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getRadius(){
        return this.radius;
    }

    public Color getColor(){
        return this.color;
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(this.color);
        g.fillArc(this.x, this.y, this.radius, this.radius, 0, 360);
    }

}
