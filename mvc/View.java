import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class View extends JFrame{

    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JTextField firstNameText;
    private JTextField lastNameText;
    private JTable table;
    private JButton button;
    // private String[] columns;
    // private String[][] rows;

    View(){

    }

    public void initializeView(){

        setLayout(new GridBagLayout());
        
        // firstNameLabel = new JLabel("First Name");
        // lastNameLabel = new JLabel("Last Name");
        // firstNameText = new JTextField(20);
        // lastNameText = new JTextField(20);

        getContentPane().add(firstNameLabel,
        new GridBagConstraints(0,0, 1, 1, 0.25,0.1, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0,0,0,0), 1,1));
        getContentPane().add(lastNameLabel,
        new GridBagConstraints(0,1, 1, 1, 0.25,0.1, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0,0,0,0), 1,1));
        
        getContentPane().add(firstNameText,
        new GridBagConstraints(1,0, 3, 1, 0.75,0.1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 1,1));
        getContentPane().add(lastNameText,
        new GridBagConstraints(1,1, 3, 1, 0.75,0.1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 1,1));

        getContentPane().add(button,
        new GridBagConstraints(0,2,4,1,1,0.1, GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 1,1));
        JScrollPane sp = new JScrollPane(table);
        
        getContentPane().add(sp,
        new GridBagConstraints(0,3, 4, 8,1,0.7, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 1,1));


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
    }

    // public String getColumns(int index){
    //     return this.columns[index];
    // }

    // public String[] getColumns(){
    //     return this.columns;
    // }

    // public void setColumns(int index, String column){
    //     this.columns[index] = column;
    // }

    // public void setColumns(String[] columns){
    //     this.columns = columns;
    // }
    

    // public String[] getRows(int index){
    //     return this.rows[index];
    // }

    // public String[][] getRows(){
    //     return this.rows;
    // }

    // public void setRows(int index, String[] row){
    //     this.rows[index] = row;
    // }

    // public void setRows(String[][] rows){
    //     this.rows = rows;
    // }

    public JButton getButton(){
        return this.button;
    }

    public void setButton(JButton button){
        this.button = button;
    }
    public JTable getTable(){
        return this.table;
    }

    public void setTable(JTable table){
        this.table = table;
    }

    public JLabel getFirstNameLabel(){
        return firstNameLabel;
    }

    public void setFirstNameLabel( JLabel firstNameLabel ){
        this.firstNameLabel = firstNameLabel;
    }

    public JLabel getLastNameLabel(){
        return lastNameLabel;
    }

    public void setLastNameLabel( JLabel lastNameLabel ){
        this.lastNameLabel = lastNameLabel;
    }

    public JTextField getFirstNameText(){
        return firstNameText;
    }

    public void setFirstNameText( JTextField firstNameText ){
        this.firstNameText = firstNameText;
    }

    public JTextField getLastNameText(){
        return lastNameText;
    }

    public void setLastNameText( JTextField lastNameText ){
        this.lastNameText = lastNameText;
    }
}
