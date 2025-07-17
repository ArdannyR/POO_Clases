import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import javax.swing.JOptionPane;

public class MongoDB_Conexion_Espanol {
    public static void main(String[] args) {
        // Cadena de conexión a MongoDB Atlas
        final String connectionString = "mongodb+srv://arda:1234@cluster0.zc2sh8g.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        MongoClient mongoClient = null;

        try {
            mongoClient = MongoClients.create(connectionString);
            // Acceder a la base de datos
            MongoDatabase database = mongoClient.getDatabase("clientes");
            // Acceder a la colección
            MongoCollection<Document> collection = database.getCollection("clientes");

            JOptionPane.showMessageDialog(null, "Conectado a MongoDB Atlas exitosamente.");
            System.out.println("Documentos encontrados:");
            for (Document doc : collection.find()) {
                System.out.println(doc.toJson());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a MongoDB Atlas: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
