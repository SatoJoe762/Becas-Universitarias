/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaBecasUniversitarias;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;


public class GestorBaseDatosBecas {

    // Atributos para la conexión a la base de datos
    private String url;        // URL de la base de datos
    private String usuario;    // Usuario de la base de datos
    private String contraseña; // Contraseña de la base de datos


    public GestorBaseDatosBecas(String url, String usuario, String contraseña) {
        this.url = url;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    // Método privado para establecer una conexión a la base de datos
    private Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(url, usuario, contraseña); // Retorna una conexión a la base de datos
    }

    // Método para verificar si una beca ya existe en la base de datos
    public boolean existeBeca(String nombreBeca) {
        String sql = "SELECT COUNT(*) FROM becas WHERE nombre_beca = ?"; // Consulta SQL para contar becas con el nombre dado
        try (Connection conn = obtenerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombreBeca); // Asigna el nombre de la beca al parámetro de la consulta
            ResultSet rs = pstmt.executeQuery(); // Ejecuta la consulta
            if (rs.next()) {
                return rs.getInt(1) > 0; // Retorna true si el conteo es mayor a 0 (la beca existe)
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de excepciones en caso de error
        }
        return false; // Retorna false si no se encuentra la beca
    }

    // Método para guardar una nueva beca en la base de datos
    public void guardarBeca(Beca beca) {
        if (existeBeca(beca.getNombreBeca())) { // Verifica si la beca ya existe
            System.out.println("La beca \"" + beca.getNombreBeca() + "\" ya existe en la base de datos.");
            return; // Sale del método si la beca ya existe
        }

        String sql = "INSERT INTO becas (nombre_beca, requisitos, promedio_requerido) VALUES (?, ?, ?)"; // Consulta SQL para insertar una nueva beca

        try (Connection conn = obtenerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Asigna los valores de la beca a los parámetros de la consulta
            pstmt.setString(1, beca.getNombreBeca());
            pstmt.setString(2, beca.getRequisitos());
            pstmt.setInt(3, beca.getPromedioRequerido());

            pstmt.executeUpdate(); // Ejecuta la inserción
            System.out.println("Beca \"" + beca.getNombreBeca() + "\" guardada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de excepciones en caso de error
        }
    }

    // Método para obtener todas las becas de la base de datos
    public List<Beca> obtenerTodasLasBecas() {
        List<Beca> becas = new ArrayList<>(); // Lista para almacenar las becas recuperadas
        String sql = "SELECT nombre_beca, requisitos, promedio_requerido FROM becas"; // Consulta SQL para obtener todas las becas

        try (Connection conn = obtenerConexion(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                // Crea un objeto Beca con los datos de la fila actual
                Beca beca = new Beca(
                        rs.getString("nombre_beca"),
                        rs.getString("requisitos"),
                        rs.getInt("promedio_requerido")
                );
                becas.add(beca); // Agrega la beca a la lista
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de excepciones en caso de error
        }

        return becas; // Retorna la lista de becas
    }

    // Método para actualizar una beca existente en la base de datos
    public void actualizarBeca(Beca beca) {
        String sql = "UPDATE becas SET requisitos = ?, promedio_requerido = ? WHERE nombre_beca = ?"; // Consulta SQL para actualizar una beca

        try (Connection conn = obtenerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Asigna los nuevos valores a los parámetros de la consulta
            pstmt.setString(1, beca.getRequisitos());
            pstmt.setInt(2, beca.getPromedioRequerido());
            pstmt.setString(3, beca.getNombreBeca());

            pstmt.executeUpdate(); // Ejecuta la actualización
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de excepciones en caso de error
        }
    }

    // Método para eliminar una beca de la base de datos
    public void eliminarBeca(String nombreBeca) {
        String sql = "DELETE FROM becas WHERE nombre_beca = ?"; // Consulta SQL para eliminar una beca

        try (Connection conn = obtenerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombreBeca); // Asigna el nombre de la beca al parámetro de la consulta
            pstmt.executeUpdate(); // Ejecuta la eliminación
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de excepciones en caso de error
        }
    }
}