import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Combo extends JFrame {
    private JComboBox<String> cb;
    private String[] list = {"Apple", "Mango", "Litchi", "Pineapple", "Banana"};
    Combo(){
        setTitle("Combo Box");
        setLayout(new FlowLayout());
        cb = new JComboBox<String>(list);
        cb.addItemListener(
            new ItemListener(){
                public void itemStateChanged(ItemEvent ev){
                    System.out.println(cb.getSelectedItem());
                }
            }
        );
        getContentPane().add(cb);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Combo c = new Combo();
    }

}
