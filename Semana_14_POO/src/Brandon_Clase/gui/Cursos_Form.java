package Brandon_Clase.gui;

import javax.swing.*;

public class Cursos_Form extends JFrame {
    JPanel Cursos_panel;
    JTable tabla_cursos;
    JButton cargarButton;

    public Cursos_Form() {
        setTitle("Cursos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Cursos_panel);
        setSize(300,500);
        setLocationRelativeTo(null);
    }

}
