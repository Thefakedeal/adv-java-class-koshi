import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

public class Calc extends JFrame {
    
    JTextField num1, num2, num3;

    Calc(){

        num1 = new JTextField("0",10);
        num2 = new JTextField("0",10);
        num3 = new JTextField(10);

        setLayout(new FlowLayout());
        getContentPane().add(num1);
        getContentPane().add(num2);
        getContentPane().add(num3);

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.addMouseListener(new HandleClick(this));
    }
    public static void main(String[] args) {
        new Calc();
    }

}

class HandleClick extends MouseAdapter{

    Calc c;

    HandleClick(Calc c){
        this.c = c;
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
        int num1 = Integer.parseInt(this.c.num1.getText());
        int num2 = Integer.parseInt(this.c.num2.getText());
        int num3 = num1 + num2;
        this.c.num3.setText(Integer.toString(num3)); 
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        int num1 = Integer.parseInt(this.c.num1.getText());
        int num2 = Integer.parseInt(this.c.num2.getText());
        int num3 = num1 - num2;
        this.c.num3.setText(Integer.toString(num3)); 
    }
}
