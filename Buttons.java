import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buttons extends JFrame {
    JTextField tf;
    Buttons(){

        tf = new JTextField(10);
        getContentPane().add(tf);

        JButton btn = new JButton("Button");
        
        btn.addActionListener(new HandleClick(this));
        getContentPane().add(btn);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Buttons b =  new Buttons();
    }

}


class HandleClick implements ActionListener{
    Buttons b;

    HandleClick(Buttons b1){
        this.b = b1;
    }
    public void actionPerformed(ActionEvent ae){
        System.out.println(b.tf.getText());
    }
}
