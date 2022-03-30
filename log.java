import javax.swing.*;
import java.awt.event.*;

public class log implements ActionListener {
    JFrame frame;
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
        if (e.getSource() == Registration) {
            new registration();
            frame.setVisible(false);
        }

        String User1 = "Ergis.h", User2 = "Devis.M";
        String pass = "12345678";
        // Converted TextField
        String UserNameText = UserName1.getText();
        // Converted PassField
        String PassText = Pass1.getText();
        if (UserNameText.equals(User1) && PassText.equals(pass)) {
            new popup();
            frame.setVisible(false);
        }
        if (UserNameText.equals(User2)) {
            new popup2();
            frame.setVisible(false);
        }

        else if (!UserNameText.equals(User1) || !PassText.equals(User1) || UserNameText.isEmpty()
                || PassText.isEmpty()) {
            if (UserNameText.isEmpty() || PassText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Passwordi ose UserName eshte bosh");
            } else if (UserNameText != User1 || PassText != pass) {
                JOptionPane.showMessageDialog(null, "Passwordi ose UserName nuk eshte i sakte");
            }

        }
    }

    public static void main(String[] args) {
        new log();
    }
}