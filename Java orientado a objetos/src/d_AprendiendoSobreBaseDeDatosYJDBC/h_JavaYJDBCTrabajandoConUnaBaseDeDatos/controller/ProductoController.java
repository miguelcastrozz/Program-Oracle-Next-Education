package d_AprendiendoSobreBaseDeDatosYJDBC.h_JavaYJDBCTrabajandoConUnaBaseDeDatos.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoController {

	public void modificar(String nombre, String descripcion, Integer id) {
	}

	public void eliminar(Integer id) {
	}

	public List<?> listar() throws SQLException {

		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/control_stock?useTimeZone=true&serverTimeZone=UTC",
				"root",
				"123456789");

		// CONSULTAS SQL

		Statement statement = connection.createStatement();
		boolean resultado = statement.execute("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO"); /*
		Listado = true, Modificar = false, Eliminar = false */
		System.out.println(resultado);

		connection.close();
		return new ArrayList<>();
	}

    public void guardar(Object producto) {
	}

}
