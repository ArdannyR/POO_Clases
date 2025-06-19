package Actividad_en_clase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practica_1 extends JFrame {
    private JPanel panel_pract1;

    private JTextField estatura;
    private JTextField año_nacimiento;
    private JTextField telefono;
    private JTextField direccion;
    private JTextField apellido;
    private JTextField nombre;

    private JLabel direction_lab;
    private JLabel name_label;
    private JLabel lastname_lab;
    private JLabel phone_lab;
    private JLabel year_lab;
    private JLabel hight_lab;

    private JButton mostrar_plane;
    private JButton mostrar_lab;
    private JTextArea textArea1;

    public Practica_1() {
        setTitle("Practica 1");
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel_pract1);
        textArea1.setVisible(false);

        mostrar_lab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "\nNombre: \t\t" + nombre.getText() + "\nApellido: \t\t" + apellido.getText() + "\nDireccion: \t\t" + direccion.getText() + "\nTelefono: \t\t" + telefono.getText() + "\nAño de nacimiento: \t" + año_nacimiento.getText() + "\nEstatura: \t\t" + estatura.getText() + "\nTelefono: \t\t" + estatura.getText();
                textArea1.setText(text);
                textArea1.setVisible(true);
            }
        });

        mostrar_plane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "\nNombre: \t" + nombre.getText() + "\nApellido: \t" + apellido.getText() + "\nDireccion: \t" + direccion.getText() + "\nTelefono: \t" + telefono.getText() + "\nAño de nacimiento: " + año_nacimiento.getText() + "\nEstatura: \t" + estatura.getText() + "\nTelefono: \t" + estatura.getText());
            }
        });

    }
}
