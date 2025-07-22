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

public class Cursos_Controller {
    private final Cursos_Form form;

    public Cursos_Controller(Cursos_Form form) {
        this.form = form;
        // CORRECCIÓN 1: Usar getter para el botón
        this.form.cargarButton.addActionListener(new CargarDatosListener());
    }

    class CargarDatosListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String[] columnas = {"Código", "Nombre", "Créditos", "Profesor"};
            DefaultTableModel model = new DefaultTableModel(columnas, 0);

            MongoDatabase database = Conexion_Atlas.getDatabase();
            if (database != null) {
                MongoCollection<Document> collection = database.getCollection("cursos");

                List<Document> cursos = collection.find().into(new ArrayList<>());

                for (Document curso : cursos) {
                    Object[] fila = new Object[]{
                            curso.getString("codigo"),
                            curso.getString("nombre_curso"),
                            curso.getInteger("creditos"),
                            curso.getString("profesor")
                    };
                    model.addRow(fila);
                }
            } else {
                System.err.println("No se pudo obtener la base de datos.");
            }

            form.tabla_cursos.setModel(model);
        }
    }
}