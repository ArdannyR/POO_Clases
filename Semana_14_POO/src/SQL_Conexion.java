import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SQL_Conexion {
    public static void main(String[] args) {
        final String url = "mongodb+srv://arda:1234@cluster0.abcde.mongodb.net/?retryWrites=true&w=majority";
        final String user = "arda"; //Aqui debedria se una conexion creada, por el momento usaremos root
        final String pass = "1234";

        try {
            Connection conecta = null;
            conecta = DriverManager.getConnection(url, user, pass);

            PreparedStatement pstmt = conecta.prepareStatement("SELECT * FROM clientes");
            ResultSet result_set = pstmt.executeQuery();
            JOptionPane.showMessageDialog(null, "Conectado");

            while (result_set.next()) {
                int id = result_set.getInt("codigo");
                String nombre = result_set.getString("nombre");
                String correo = result_set.getString("correo");
                String clave = result_set.getString("clave");
                System.out.printf("Id: %d \tNombre: %s \nCorreo: %s \tClave: %s\n\n", id, nombre, correo, clave);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}


