import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
public class ListApp extends JFrame {
    ListApp(){
        setLayout(new FlowLayout());
        String[] list = {"Apple", "Banana", "Carrot", "Barror", "Sarrot", "marrot"};
        JList l = new JList(list);
        l.setVisibleRowCount(3);
        l.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        l.addListSelectionListener(
            new ListSelectionListener() {
                public void valueChanged(javax.swing.event.ListSelectionEvent e) {
                    if(e.getValueIsAdjusting()) return;
                    System.out.println(l.getSelectedValue());
                };
            }
        );
        getContentPane().add(new JScrollPane(l));
       setVisible(true);
       setSize(600,400);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        ListApp la = new ListApp();
    }
}
