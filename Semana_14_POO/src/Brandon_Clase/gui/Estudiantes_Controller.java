package Brandon_Clase.gui;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import Brandon_Clase.database.Conexion_Atlas;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Estudiantes_Controller {
    private final Estudiantes_Form form;

    public Estudiantes_Controller(Estudiantes_Form form) {
        this.form = form;
        // Asignar el listener al botón
        this.form.cargarButton.addActionListener(new CargarDatosListener());
    }

    class CargarDatosListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Definir columnas para la tabla
            String[] columnas = {"Cédula", "Nombre", "Apellido", "Carrera"};
            DefaultTableModel model = new DefaultTableModel(columnas, 0);

            MongoDatabase database = Conexion_Atlas.getDatabase();
            if (database != null) {
                MongoCollection<Document> collection = database.getCollection("estudiantes");

                // Usamos un ArrayList para guardar los documentos
                List<Document> estudiantes = collection.find().into(new ArrayList<>());

                for (Document estudiante : estudiantes) {
                    Object[] fila = new Object[]{
                            estudiante.getString("cedula"),
                            estudiante.getString("nombre"),
                            estudiante.getString("apellido"),
                            estudiante.getString("carrera")
                    };
                    model.addRow(fila);
                }
            } else {
                System.err.println("No se pudo obtener la base de datos.");
            }

            form.tabla_estudiantes.setModel(model);
        }
    }
}
