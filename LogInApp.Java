
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginApp extends JFrame implements ActionListener {

    JLabel userLabel, passLabel;
    JTextField userField;
    JPasswordField passField;
    JButton loginButton;

    public LoginApp() {
        setTitle("Login System");
        setSize(300, 150);
        setLayout(new GridLayout(3, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userLabel = new JLabel("Username:");
        passLabel = new JLabel("Password:");

        userField = new JTextField();
        passField = new JPasswordField();

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(new JLabel());
        add(loginButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = new String(passField.getPassword());

        if (username.equals("WAINAINA") && password.equals("password123")) {
            JOptionPane.showMessageDialog(this, "Login Successful");
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect username or password");
        }
    }

    public static void main(String[] args) {
        new LoginApp();
    }
}
