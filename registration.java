import javax.swing.*;
import java.awt.event.*;

public class registration implements ActionListener {
    JFrame frame;
    // Labels
    JLabel registrationForm = new JLabel("RegistrationForm");
    JLabel emri = new JLabel("Emri");
    JLabel mbiemri = new JLabel("Mbiemri");
    JLabel username = new JLabel("Username");
    JLabel dtl = new JLabel("Datelindja");
    JLabel password = new JLabel("Password");
    JLabel passwordConf = new JLabel("Confirm Pass");
    // Fields
    JTextField emri1 = new JTextField();
    JTextField mbiemri1 = new JTextField();
    JTextField username1 = new JTextField();
    JTextField dtl1 = new JTextField();
    // PasswordFields
    JPasswordField password1 = new JPasswordField();
    JPasswordField passwordConf1 = new JPasswordField();
    // Button
    JButton registration = new JButton("Confirm");
    //Converted TextFields
    String emriText = emri1.getText();
    String mbiemriText = mbiemri1.getText();
    String usernameText = username1.getText();
    String dtlText = dtl1.getText();
    //Converted PasswordField
    char[] passwordText = password1.getPassword();
    char[] passwordConfText = passwordConf1.getPassword();

    registration() {
        window();
        setLocation();
        addComponents();
        actionEvent();
    }

    public void window() {
        frame = new JFrame();
        frame.setTitle("Registration");
        frame.setBounds(40, 40, 380, 470);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public void setLocation() {
        // Labels
        registrationForm.setBounds(135,10,100,20);
        emri.setBounds(20, 20, 40, 70);
        mbiemri.setBounds(20, 70, 80, 70);
        username.setBounds(20, 120, 100, 70);
        dtl.setBounds(20, 170, 100, 70);
        password.setBounds(20, 220, 140, 70);
        passwordConf.setBounds(20, 270, 100, 70);
        // Fields
        emri1.setBounds(180, 43, 165, 23);
        mbiemri1.setBounds(180, 93, 165, 23);
        username1.setBounds(180, 143, 165, 23);
        dtl1.setBounds(180,193,165,23);
        password1.setBounds(180, 243, 165, 23);
        passwordConf1.setBounds(180, 293, 165, 23);
        // Button
        registration.setBounds(130, 350, 100, 25);

    }

    public void addComponents() {
        // Labels
        frame.add(registrationForm);
        frame.add(emri);
        frame.add(mbiemri);
        frame.add(username);
        frame.add(dtl);
        frame.add(password);
        frame.add(passwordConf);
        // Fields
        frame.add(emri1);
        frame.add(mbiemri1);
        frame.add(username1);
        frame.add(dtl1);
        frame.add(password1);
        frame.add(passwordConf1);
        // Button
        frame.add(registration);
    }

    public void actionEvent() {
        registration.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registration) {
            if(passwordText != passwordConfText){
                JOptionPane.showMessageDialog(null, "Passwordet nuk jane te njejta");
            }
        }
    }

}
