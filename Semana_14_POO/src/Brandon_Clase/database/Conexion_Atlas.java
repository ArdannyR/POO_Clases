package Brandon_Clase.database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoException;

public class Conexion_Atlas {

    private static MongoClient mongoClient = null;
    private static final String CONNECTION_STRING = "mongodb+srv://brandonhuera:brandon.2.0@cluster0.g2mprd3.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String DATABASE_NAME = "universidad_db";

    private Conexion_Atlas() {}

    public static MongoClient getMongoClient() {
        if (mongoClient == null) {
            try {
                mongoClient = MongoClients.create(CONNECTION_STRING);
                System.out.println("\nConexión a MongoDB Atlas establecida con éxito.");
            } catch (MongoException e) {
                System.err.println("\nError al conectar con MongoDB Atlas: " + e.getMessage());
            }
        }
        return mongoClient;
    }

    public static MongoDatabase getDatabase() {
        if (getMongoClient() != null) {
            return getMongoClient().getDatabase(DATABASE_NAME);
        }
        return null;
    }

    public static void closeConnection() {
        if (mongoClient != null) {
            mongoClient.close();
            mongoClient = null;
            System.out.println("Conexión a MongoDB cerrada.");
        }
    }
}
