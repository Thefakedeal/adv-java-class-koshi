import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Adapter extends JFrame{
    
    Adapter(){
        JButton b = new JButton("btn");
        b.addMouseListener(new HandleMouse());
        getContentPane().add(b);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Adapter();
    }

    class HandleMouse extends MouseAdapter{
        
        public void mouseClicked(MouseEvent me){
            System.out.println("Mouse Clicked");
        }
    
    }

}


