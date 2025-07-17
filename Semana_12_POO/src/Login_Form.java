import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Form extends JFrame {
    private JPanel login_panel;

    private JLabel user_lab;
    private JLabel password_lab;
    private JLabel perfil_lab;

    private JTextField usuario_txtfld;
    private JPasswordField password_passfld;

    private JButton accesoButton;
    private JComboBox perfil_combox;

    public Login_Form(){
        setTitle("Login");
        setContentPane(login_panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(350,200);
        setVisible(true);
        //pack(); // El orden de los comandos si tiene sentido

        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuario_txtfld.getText();
                String contraseña = new String(password_passfld.getPassword());
                String perfil = perfil_combox.getSelectedItem().toString();

                try {
                    if (usuario.equals("admin") && contraseña.equals("123") && perfil.equals("Administrador")) {
                        setVisible(false);
                        new  Admin_deportes_Form();
                    }
                    else if (usuario.equals("jugar") && contraseña.equals("123") && perfil.equals("Jugador")){
                        setVisible(false);
                        new Datos_jugador_deportes_Form();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Datos son erroneos");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error en los datos");
                }
            }
        });
    }
}
