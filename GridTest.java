import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class GridTest extends JFrame{
    GridTest(){
        getContentPane().setLayout(new GridLayout(3,2,2,2));

        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");
        JButton b6 = new JButton("b6");

        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        getContentPane().add(b6);

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    } 
    public static void main(String[] args) {
        new GridTest();
    } 
}
