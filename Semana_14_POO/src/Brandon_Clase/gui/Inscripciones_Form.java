package Brandon_Clase.gui;

import javax.swing.*;

public class Inscripciones_Form extends JFrame{
    JTable tabla_inscripciones;
    JPanel Inscripciones_panel;
    JButton cargarButton;

    public Inscripciones_Form(){
        setTitle("Inscripciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Inscripciones_panel);
        setSize(300,500);
        setLocationRelativeTo(null);

    }
}
