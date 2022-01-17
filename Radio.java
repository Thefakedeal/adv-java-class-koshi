import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Radio extends JFrame {
    Radio(){
        ButtonGroup btng = new ButtonGroup();


        JRadioButton rd1 = new JRadioButton();
        JRadioButton rd2 = new JRadioButton("Radio 2");
        JRadioButton rd3 = new JRadioButton("Radio 3", true);

        rd1.addActionListener(new HandleClick("Radio 1 is clicked"));
        rd2.addActionListener(new HandleClick("Radio 2 is clicked"));
        rd3.addActionListener(new HandleClick("Radio 3 is clicked"));

        btng.add(rd1);
        btng.add(rd2);
        btng.add(rd3);

        getContentPane().add(rd1);
        getContentPane().add(rd2);
        getContentPane().add(rd3);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Radio r = new Radio();
    }  


}



class HandleClick implements ActionListener{
    String text;
    HandleClick(String text){
        this.text = text;
    }
    public void actionPerformed(ActionEvent ae){
        System.out.println(this.text);
    }
} 