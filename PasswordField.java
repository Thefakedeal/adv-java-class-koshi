import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.*;
public class PasswordField extends JFrame {
   
    PasswordField(){

        setLayout(new FlowLayout());
        JPasswordField tf1 = new JPasswordField();
        JPasswordField tf2 = new JPasswordField(10);
        JPasswordField tf3 = new JPasswordField("Hello");
        JPasswordField tf4 = new JPasswordField("Hello",10);
        getContentPane().add(tf1);
        getContentPane().add(tf2);
        getContentPane().add(tf3);
        getContentPane().add(tf4);
        getContentPane().setBackground(Color.BLACK);

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
       PasswordField t = new PasswordField(); 
    }
}
