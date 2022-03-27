import javax.swing.*;
import java.awt.event.*;

public class log implements ActionListener {
    JFrame frame;
    String emri = "ergi";
    String ergi = "123";
    // Labels
    JLabel UserName = new JLabel("UserName");
    JLabel Pass = new JLabel("Password");
    // Text Field
    JTextField UserName1 = new JTextField();
    // Password Field
    JPasswordField Pass1 = new JPasswordField();
    // Buttons
    JButton Login = new JButton("Log IN");
    JButton Registration = new JButton("Registration");
    //Converted TextField
    String UserNameText = UserName1.getText();
    //Converted PassField
    char[] PassText = Pass1.getPassword();

    log() {
        window();
        setLocation();
        addComponents();
        actionEvent();
    }

    public void window() {
        frame = new JFrame();
        frame.setTitle("Log IN");
        frame.setBounds(40, 60, 380, 250);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void setLocation() {
        // Labels
        UserName.setBounds(20, 20, 80, 70);
        Pass.setBounds(20, 70, 80, 70);
        // Fields
        UserName1.setBounds(180, 43, 165, 23);
        Pass1.setBounds(180, 93, 165, 23);
        // Buttons
        Login.setBounds(70, 150, 75, 25);
        Registration.setBounds(190, 150, 120, 25);
    }

    public void addComponents() {
        // Labels
        frame.add(UserName);
        frame.add(Pass);
        // Fields
        frame.add(UserName1);
        frame.add(Pass1);
        // Buttons
        frame.add(Login);
        frame.add(Registration);
    }

    public void actionEvent() {
        Login.addActionListener(this);
        Registration.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Login) {
             
        }    

        else if (e.getSource() == Registration) {
            new registration();
        }

    }

    public static void main(String[] args) {
        new log();
    }
}
