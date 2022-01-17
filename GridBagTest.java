import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GridBagTest extends JFrame {
    GridBagTest() {
        setLayout(new GridBagLayout());

        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");
        JButton b6 = new JButton("b6");

        getContentPane().add(b1, new GridBagConstraints(0, 0, 1, 1, 0.33, 0.33, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
        getContentPane().add(b2, new GridBagConstraints(1, 0, 1, 1, 0.33, 0.33, GridBagConstraints.CENTER,
            GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0)); 
        getContentPane().add(b3, new GridBagConstraints(2, 0, 1, 1, 0.33, 0.33, GridBagConstraints.CENTER,
            GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0)); 
        getContentPane().add(b4, new GridBagConstraints(2, 1, 1, 1, 0.33, 0.33, GridBagConstraints.CENTER,
            GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
        getContentPane().add(b5, new GridBagConstraints(2, 2, 1, 1, 0.33, 0.33, GridBagConstraints.CENTER,
            GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));   
        getContentPane().add(b6, new GridBagConstraints(0, 1, 2, 2, 0.66, 0.66, GridBagConstraints.CENTER,
            GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));                
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridBagTest();
    }

}
