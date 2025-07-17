import javax.swing.*;

public class Datos_jugador_deportes_Form extends JFrame {
    private JPanel datos_panel;

    private JLabel nombre_lab;
    private JLabel apellido_lab;
    private JLabel edad_lab;
    private JLabel estatura_lab;
    private JLabel nom_equipo_lab;

    private JTextField nombre_txtfld;
    private JTextField apellido_txtfld;
    private JTextField edad_txtfld;
    private JTextField estatura_txtfld;
    private JTextField nom_equipo_txtfld;

    private JButton limpiarButton;
    private JButton mostrarButton;
    private JButton agregarButton;
    private JTable tabla_jugadores;


    public Datos_jugador_deportes_Form(){
        setTitle("Datos de Jugadores");
        setContentPane(datos_panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,300);
        setVisible(true);
    }
}
