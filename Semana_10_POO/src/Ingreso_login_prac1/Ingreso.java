package Ingreso_login_prac1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ingreso extends JFrame {
    private JPanel principal;
    private JTextField text_nombre;
    private JButton button_aceptar;

    public Ingreso(){
        setTitle("Ingreso (Form 1)");
        setVisible(true);
        setSize(400,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para poder salir (a veces no aparece asi que no lo ignores)
        setContentPane(principal);

        button_aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola " + text_nombre.getText());
            }
        });


    }
}
