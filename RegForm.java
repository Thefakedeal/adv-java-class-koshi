import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegForm extends JFrame {

    JTextField name;
    JTextField email;
    JPasswordField password;
    JTextArea ta;

    RegForm(){
        JLabel nameLabel = new JLabel("Name");
        JLabel emailLabel = new JLabel("Email");
        JLabel passwordLabel = new JLabel("Password");
        name = new JTextField(20);
        email = new JTextField(20);
        password = new JPasswordField(20);
        JButton btn = new JButton("Submit");

        btn.addActionListener(new HandleClick(this));

        JPanel namePanel = new JPanel();
        namePanel.setLayout(new FlowLayout());
        namePanel.add(nameLabel);
        namePanel.add(name);


        JPanel emailPanel = new JPanel();
        emailPanel.setLayout(new FlowLayout());
        emailPanel.add(emailLabel);
        emailPanel.add(email);

        JPanel passwordPanel = new JPanel();
        passwordPanel.setLayout(new FlowLayout());
        passwordPanel.add(passwordLabel);
        passwordPanel.add(password);

        ta = new JTextArea(20,20);

        setLayout(new GridLayout(5,1,1,1));
        getContentPane().add(namePanel);
        getContentPane().add(emailPanel);
        getContentPane().add(passwordPanel);
        getContentPane().add(ta);
        getContentPane().add(btn);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,400);
    }

    public static void main(String[] args) {
        new RegForm();
    }

}

class HandleClick implements ActionListener{
    RegForm rf;

    HandleClick(RegForm rf){
        this.rf = rf;
    }
    public void actionPerformed(ActionEvent ae){
        String name = this.rf.name.getText();
        String email = this.rf.email.getText();
        String password = String.copyValueOf(this.rf.password.getPassword());
        this.rf.ta.setText("name: "+name+"Password: "+password+"Email: "+ email);
    }
}