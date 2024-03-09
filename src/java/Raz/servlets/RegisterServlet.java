/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Raz.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/procesarRegistro")
public class RegisterServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/imc";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "2853083";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreCompleto = request.getParameter("nombreCompleto");
        String nombreUsuario = request.getParameter("nombreUsuario");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String sexo = request.getParameter("sexo");
        double estatura = Double.parseDouble(request.getParameter("estatura"));
        String contrasena = request.getParameter("contrasena");

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String consulta = "INSERT INTO usuarios (nombre_completo, nombre_usuario, edad, sexo, estatura, contrasena) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(consulta);
            preparedStatement.setString(1, nombreCompleto);
            preparedStatement.setString(2, nombreUsuario);
            preparedStatement.setInt(3, edad);
            preparedStatement.setString(4, sexo);
            preparedStatement.setDouble(5, estatura);
            preparedStatement.setString(6, contrasena);

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                // Registro exitoso, puedes redirigir al usuario a una página de inicio de sesión
                response.sendRedirect("redirect.jsp");
            } else {
                // Maneja el caso en el que no se pudo realizar el registro
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Maneja cualquier error de la base de datos
        }
    }
}
