import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ComboBox extends JFrame {
    private String[] list = {"Apple", "Banana", "Carrot", "Barror", "Sarrot", "marrot"};
    private JComboBox<String>  combo;
    ComboBox(){
       
        setLayout(new FlowLayout());
        combo = new JComboBox<String>(list);
        combo.addItemListener(
            new ItemListener(){
                public void itemStateChanged(ItemEvent ev){
                    if(ev.getStateChange()==ItemEvent.SELECTED){
                        System.out.println(combo.getSelectedItem());
                    }
                };
            }
        );
        getContentPane().add(combo);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,400);
    }
    public static void main(String[] args) {
        ComboBox c = new ComboBox();
    }
}
