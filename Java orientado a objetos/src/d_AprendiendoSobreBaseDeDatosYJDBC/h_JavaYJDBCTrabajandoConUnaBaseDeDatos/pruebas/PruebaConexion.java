package d_AprendiendoSobreBaseDeDatosYJDBC.h_JavaYJDBCTrabajandoConUnaBaseDeDatos.pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306control_stock?useTimeZone=true&serverTimeZone=UTC",
                "root",
                "123456789");

        System.out.println("Cerrando la conexión");

        con.close();
    }

}
