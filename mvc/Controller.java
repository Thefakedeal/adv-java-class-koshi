import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller {
    
   
    View view;
    DefaultTableModel model;
    Controller(){
   
       
    }

    public void initializeView(){
        view = new View();
        view.setFirstNameLabel(new JLabel("First Name"));
        view.setLastNameLabel(new JLabel("Last Name"));
        view.setFirstNameText(new JTextField(20));
        view.setLastNameText(new JTextField(20));
        view.setButton(new JButton("Save"));

        view.getButton().addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ae){
                try{
                    DataBaseClass db = new DataBaseClass();
                    UserModel user = new UserModel();
                    user.setFirstName(view.getFirstNameText().getText());
                    user.setLastName(view.getLastNameText().getText());
                    db.insert(user);
                    view.getFirstNameText().setText("");
                    view.getLastNameText().setText("");
                    model.addRow(new Object[]{user.getFirstName(), user.getLastName()});
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
        });
        try{
            this.loadTable();
            view.initializeView();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void loadTable(){
        try{
            String[] rows = {
                "First Name",
                "Last Name"
            };
            model = new DefaultTableModel(rows,0);

            DataBaseClass db = new DataBaseClass();
            UserModel[] users = db.getAll();
            view.setTable(new JTable(model));

            // ArrayList<String[]> cols = new ArrayList<String[]>();
            
            for(UserModel user: users){
                model.addRow(new Object[]{user.getFirstName(), user.getLastName()});
                // String[] usr = {user.getFirstName(), user.getLastName()};
                // cols.add(usr);
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

   
}
