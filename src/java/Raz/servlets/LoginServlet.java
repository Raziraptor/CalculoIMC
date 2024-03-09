/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Raz.servlets;

/**
 *
 * @author razpi
 */
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/procesarInicioSesion")
public class LoginServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/imc";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "2853083";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreUsuario = request.getParameter("nombreUsuario");
        String contrasena = request.getParameter("contrasena");

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String consulta = "SELECT id, contrasena FROM Usuarios WHERE nombre_usuario = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(consulta);
            preparedStatement.setString(1, nombreUsuario);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int idUsuario = resultSet.getInt("id");
                String contrasenaAlmacenada = resultSet.getString("contrasena");

                if (contrasena.equals(contrasenaAlmacenada)) {
                    // La contraseña coincide, el usuario puede iniciar sesión
                    // Aquí puedes redirigir al usuario a la página de inicio o realizar otras acciones según tus necesidades
                    response.sendRedirect("calculateIMC2.jsp");
                } else {
                    // La contraseña no coincide
                    // Puedes mostrar un mensaje de error o redirigir de nuevo a la página de inicio de sesión
                    response.sendRedirect("index.jsp?error=1");
                }
            } else {
                // El usuario no existe
                // Puedes mostrar un mensaje de error o redirigir de nuevo a la página de inicio de sesión
                response.sendRedirect("index.jsp?error=2");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

