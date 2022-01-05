import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;

public class MyApp extends JFrame {
    MyApp(){

        setTitle("First Class"); 
        ImageIcon img = new ImageIcon("codeit.png");
        Image image = img.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(image);
        JLabel label = new JLabel("Logo",img2,JLabel.RIGHT);
        add(label);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(600,400);   
    }
  
    public static void main(String[] args) {
       MyApp app = new MyApp(); 
     
    }
}

// JLabel()
// JLabel("hello")
// JLabel("hello", JLabel.CENTER)
// JLabel(ImageIcon)
// JLabel(ImageIcon, alignment)
// JLabel(String,ImageIcon, alignment)
