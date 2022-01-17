import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class BorderTest extends JFrame {
    BorderTest(){
        setLayout(new BorderLayout());

        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");

        getContentPane().add(b1, BorderLayout.CENTER);
        getContentPane().add(b2, BorderLayout.NORTH);
        getContentPane().add(b3, BorderLayout.SOUTH);
        getContentPane().add(b4, BorderLayout.EAST);
        getContentPane().add(b5, BorderLayout.WEST);
       
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        BorderTest b =  new BorderTest();
    }
}
