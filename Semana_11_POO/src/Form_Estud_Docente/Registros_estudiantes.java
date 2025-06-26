package Form_Estud_Docente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registros_estudiantes {
    private JPanel panel_estudiante;

    private JLabel nombre_lab;
    private JLabel apellido_lab;
    private JLabel edad_lab;
    private JLabel carrera_lab;
    private JLabel nota1_lab;
    private JLabel nota2_lab;
    private JLabel nota3_lab;
    private JLabel result_lab;
    private JLabel promedio_notas_lab;
    private JLabel title_lab;

    private JTextField nombre_txtfld;
    private JTextField apellido_txtfld;
    private JTextField edad_txtfld;
    private JTextField carrera_txtfld;
    private JTextField nota1_txtfld;
    private JTextField nota2_txtfld;
    private JTextField nota3_txtfld;

    private JButton limpiarButton;
    private JButton calcularButton;
    private JButton verDocenteButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Registros Estudiantes");
        frame.setContentPane(new Registros_estudiantes().panel_estudiante);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public Registros_estudiantes() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nota1Str = nota1_txtfld.getText().trim();
                String nota2Str = nota2_txtfld.getText().trim();
                String nota3Str = nota3_txtfld.getText().trim();

                try {
                    if (nota1Str.isEmpty() || nota2Str.isEmpty() || nota3Str.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Las notas deben de ser llenas");
                    }
                    else {
                        double nota1, nota2, nota3, resultado;
                        nota1 = Double.parseDouble(nota1_txtfld.getText());
                        nota2 = Double.parseDouble(nota2_txtfld.getText());
                        nota3 = Double.parseDouble(nota3_txtfld.getText());

                        if (nota1 > 0 && nota2 > 0 && nota3 > 0) {
                            if (nota1 <= 20 && nota2 <= 20 && nota3 <= 20) {
                                resultado = (nota1 + nota2 + nota3)/3;
                                String resultado_str = String.format("%.2f", resultado);
                                promedio_notas_lab.setText(resultado_str);
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
                                nota1_txtfld.setText(""); nota2_txtfld.setText(""); nota3_txtfld.setText("");
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
                            nota1_txtfld.setText(""); nota2_txtfld.setText(""); nota3_txtfld.setText("");
                        }
                    }

                }
                catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
                }

                // promedio_notas_lab.setText(String.valueOf(resultado)); // Esto da con muchos decimales
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre_txtfld.setText("");
                apellido_txtfld.setText("");
                edad_txtfld.setText("");
                carrera_txtfld.setText("");
                nota1_txtfld.setText("");
                nota2_txtfld.setText("");
                nota3_txtfld.setText("");
                promedio_notas_lab.setText("");
            }
        });
        verDocenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Registros Docente");
                frame.setContentPane(new Registros_docente().getPanel_docente());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public JPanel getPanel_estudiante() {
        return panel_estudiante;
    }

    public void setPanel_estudiante(JPanel panel_estudiante) {
        this.panel_estudiante = panel_estudiante;
    }
}
