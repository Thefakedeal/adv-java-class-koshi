import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Listener extends JFrame{
    
    Listener(){
        JButton b = new JButton("btn");
        b.addMouseListener(new HandleMouse());
        getContentPane().add(b);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Listener();
    }

    class HandleMouse implements MouseListener{
        
        public void mouseClicked(MouseEvent me){
            System.out.println("Mouse Clicked");
        }
    
        public void mousePressed(MouseEvent me){
            // System.out.println("Mouse Pressed");
    
        }
        public void mouseEntered(MouseEvent me){
            // System.out.println("Mouse Entered");
    
        }
        public void mouseReleased(MouseEvent me){
            // System.out.println("Mouse Released");
    
        }
        public void mouseExited(MouseEvent me){
            // System.out.println("Mouse Existed");
        }
    }

}


