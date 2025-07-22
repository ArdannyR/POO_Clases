package Brandon_Clase.gui;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import Brandon_Clase.database.Conexion_Atlas;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Inscripciones_Controller {
    private final Inscripciones_Form form;

    public Inscripciones_Controller(Inscripciones_Form form) {
        this.form = form;
        this.form.cargarButton.addActionListener(new CargarDatosListener());
    }

    class CargarDatosListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String[] columnas = {"Cédula", "Código Curso", "Semestre", "Fecha de Inscripción"};
            DefaultTableModel model = new DefaultTableModel(columnas, 0);

            MongoDatabase database = Conexion_Atlas.getDatabase();
            if (database != null) {
                MongoCollection<Document> collection = database.getCollection("inscripciones");

                List<Document> inscripciones = collection.find().into(new ArrayList<>());

                // Para darle un formato legible a la fecha
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                for (Document inscripcion : inscripciones) {

                    Date fecha = inscripcion.getDate("fecha_inscripcion");
                    String fechaFormateada = (fecha != null) ? dateFormat.format(fecha) : "N/A";

                    Object[] fila = new Object[]{
                            inscripcion.getString("cedula_estudiante"),
                            inscripcion.getString("codigo_curso"),
                            inscripcion.getString("semestre"),
                            fechaFormateada
                    };
                    model.addRow(fila);
                }
            } else {
                System.err.println("No se pudo obtener la base de datos.");
            }

            form.tabla_inscripciones.setModel(model);
        }
    }
}