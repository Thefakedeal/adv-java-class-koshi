import javax.swing.JFrame;
import javax.swing.JTable;

public class TableTest extends JFrame {
 
    TableTest(){
        String[] cols = {
            "Roll No",
            "Name",
            "Age"
        };
        String[][] rows = {
            {
                "1",
                "Ravi",
                "12"
            },
            {
                "1",
                "Rave",
                "13"
            },
            {
                "1",
                "Rave",
                "11"
            },
        };

        JTable tb = new JTable(rows, cols);
        getContentPane().add(tb);
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TableTest();
    }
}
