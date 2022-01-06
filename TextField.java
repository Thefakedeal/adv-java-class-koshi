import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
public class TextField extends JFrame {
   
    TextField(){

        setLayout(new FlowLayout());
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField(10);
        JTextField tf3 = new JTextField("Hello");
        JTextField tf4 = new JTextField("Hello",10);
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
       TextField t = new TextField(); 
    }
}
