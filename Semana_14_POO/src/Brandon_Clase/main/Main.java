package Brandon_Clase.main;

import Brandon_Clase.gui.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el marco principal
            JFrame frame = new JFrame("Sistema Universitario - MongoDB");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            // Crear el panel con pestañas
            JTabbedPane tabbedPane = new JTabbedPane();

            // Pestaña 1: Estudiantes
            Estudiantes_Form estudiantesForm = new Estudiantes_Form();
            new Estudiantes_Controller(estudiantesForm); // Adjuntar el controlador
            tabbedPane.addTab("Estudiantes", estudiantesForm.getContentPane());

            // Pestaña 2: Cursos
            Cursos_Form cursosForm = new Cursos_Form();
            new Cursos_Controller(cursosForm);
            tabbedPane.addTab("Cursos", cursosForm.getContentPane());

            // Pestaña 3: Inscripciones
            Inscripciones_Form inscripcionesForm = new Inscripciones_Form();
            new Inscripciones_Controller(inscripcionesForm);
            tabbedPane.addTab("Inscripciones", inscripcionesForm.getContentPane());

            // Añadir el panel con pestañas al marco
            frame.add(tabbedPane);

            // Hacer visible el marco
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}