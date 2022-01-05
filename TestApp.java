import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.event.*;
/**
 * TestApp
 */
public class TestApp extends JFrame {
  
    TestApp(){
       setVisible(true);
       setLayout(new FlowLayout());

       JButton b = new JButton("b1");
       b.addActionListener(new HandleClick());
       ButtonGroup bg = new ButtonGroup();
       JRadioButton r1 = new JRadioButton("Male", false);
       JRadioButton r2 =  new JRadioButton("Female", true);
       
       bg.add(r1);
       bg.add(r2);

       getContentPane().add(r1);
       getContentPane().add(r2);
       getContentPane().add(b);
       
       setSize(600,400);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        TestApp t = new TestApp();
        // t.setTitle("Code");
       
    }

    class HandleClick implements ActionListener{
        public void actionPerformed(ActionEvent ae){
           JOptionPane.showMessageDialog(null, String.format("%s", ae.getActionCommand()));
        }
    }
}