import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.awt.FlowLayout;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class ListComponent extends JFrame{
    
    ListComponent(){
        String[] list = {"Apple", "Banana", "Carrot", "Barror", "Sarrot", "marrot"};
        JList<String> l = new JList<String>(list);
        l.setVisibleRowCount(4);
        l.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JList l1 = new JList();
        l1.setVisibleRowCount(4);
        l1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        getContentPane().add(new JScrollPane(l));
        getContentPane().add(new JScrollPane(l1));

        l.addListSelectionListener(
            new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent e) {

                    if(e.getValueIsAdjusting()) return;
                    l1.setListData(l.getSelectedValuesList().toArray());
                };
            }
        );

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ListComponent();
    }
}
