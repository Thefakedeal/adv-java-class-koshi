import java.awt.Color;

import javax.swing.JFrame;

public class BeanFrame extends JFrame{
    BeanFrame(){
        CircleBean cb = new CircleBean();
        cb.setX(100);
        cb.setY(100);
        cb.setColor(Color.GREEN);
        cb.setRadius(5);
        getContentPane().add(cb);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
    }
    public static void main(String[] args) {
        new BeanFrame();
    }
}
