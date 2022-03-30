import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class popup implements ActionListener {
    JFrame frame;
    // Labels
    JLabel Welcome = new JLabel("Pershendetje Ergis");
    JLabel Dialog = new JLabel("A doni te shikoni te dhenat tuaja?");
    // Buttons
    JButton button = new JButton("Po");
    JButton button1 = new JButton("Jo");

    popup() {
        window();
        setLocation();
        addComponents();
        actionEvent();
    }

    public void window() {
        frame = new JFrame();
        frame.setTitle("Profile");
        frame.setBounds(40, 60, 300, 170);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void setLocation() {
        Welcome.setBounds(100, 10, 200, 70);
        Dialog.setBounds(60, 40, 200, 70);
        button.setBounds(60, 100, 75, 25);
        button1.setBounds(150, 100, 75, 25);

    }

    public void addComponents() {
        frame.add(Welcome);
        frame.add(Dialog);
        frame.add(button);
        frame.add(button1);
    }

    public void actionEvent() {
        button.addActionListener(this);
        button1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == button) {
            frame.setVisible(false);
            JOptionPane.showMessageDialog(null, "Emri: Ergis" + "\nUserName: Ergis.h" + "\nPasswordi: 12345678");
            System.exit(0);
        }
        if (e.getSource() == button1) {
            System.exit(0);
        }
    }
}
