import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Checkbox extends JFrame {
    Checkbox(){
        JCheckBox ck1 = new JCheckBox();
        getContentPane().add(ck1);

        JCheckBox ck2 = new JCheckBox("Tick Me");
        getContentPane().add(ck2);

        JCheckBox ck3 = new JCheckBox("Tick Me",true);
        getContentPane().add(ck3);

        ImageIcon img = new ImageIcon("codeit.png");
        Image image = img.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(image);

        JCheckBox ck4 = new JCheckBox("Tick",img2,true);
        getContentPane().add(ck4);
        
        JButton btn = new JButton("Click");
        btn.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    System.out.println(ck3.isSelected());
                }
            }
        );
        
        getContentPane().add(btn);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Checkbox c = new Checkbox();
    }
}





