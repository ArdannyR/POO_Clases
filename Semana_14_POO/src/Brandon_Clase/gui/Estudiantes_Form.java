package Brandon_Clase.gui;

import javax.swing.*;

public class Estudiantes_Form extends JFrame {
    JPanel Estud_panel;
    JButton cargarButton;
    JTable tabla_estudiantes;

    public Estudiantes_Form() {
        setTitle("Cargar Estudiantes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Estud_panel);
        setSize(300,500);
        setLocationRelativeTo(null);

    }
}
