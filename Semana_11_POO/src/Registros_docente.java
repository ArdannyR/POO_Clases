import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registros_docente {
    private JLabel title_lab;
    private JLabel nombre_lab;
    private JLabel carrera_lab;
    private JLabel materia_lab;

    private JTextField nombre_textfld;
    private JTextField carrera_textfld;

    private JComboBox comboBox1;

    private JButton verEstudianteButton;
    private JButton limpiarButton;

    private JPanel panel_docente;

    public Registros_docente() {
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre_textfld.setText("");
                carrera_textfld.setText("");
            }
        });
        verEstudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Registros Estudiantes");
                frame.setContentPane(new Registros_estudiantes().getPanel_estudiante());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Registros Docente");
        frame.setContentPane(new Registros_docente().panel_docente);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JPanel getPanel_docente() {
        return panel_docente;
    }

    public void setPanel_docente(JPanel panel_docente) {
        this.panel_docente = panel_docente;
    }
}
