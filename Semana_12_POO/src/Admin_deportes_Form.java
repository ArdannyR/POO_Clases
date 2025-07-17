import javax.swing.*;
import java.net.URL; // Para imagenes

public class Admin_deportes_Form extends JFrame {
    private JLabel title_lab;
    private JPanel admin_panel;
    private JLabel imagenLabel;

    public Admin_deportes_Form(){
        setTitle("Administrador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(250,300);
        setContentPane(admin_panel);

        URL imageUrl = getClass().getResource("/imagenes/cat.png"); // Para imagenes (IA ayudo solo aqui)
        ImageIcon iconoGato = new ImageIcon(imageUrl);
        imagenLabel.setIcon(iconoGato);
        imagenLabel.setText("");

        setVisible(true);
    }
}
