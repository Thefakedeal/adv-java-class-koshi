import javax.swing.JFrame;
import javax.swing.JTextArea;
// import java.awt.Color;
import java.awt.*;


public class TextArea extends JFrame {
    TextArea(){
        JTextArea ta1 = new JTextArea("Hellolajsdlajs",10,20);
        getContentPane().add(ta1);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        TextArea t = new TextArea();
    }
}
