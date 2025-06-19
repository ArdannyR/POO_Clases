package Inicios_de_un_login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Form {
    private JPanel panel;
    private JTextField text_user;
    private JPasswordField text_password;
    private JButton button_accept;

    public Login_Form() {
        button_accept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = text_user.getText();
                String password = new String(text_password.getPassword());

                if(user.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Welcome Admin");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Wrong Username or Password","Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login_Form().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
