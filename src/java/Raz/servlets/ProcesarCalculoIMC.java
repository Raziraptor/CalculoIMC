/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Raz.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/procesarCalculoIMC")
public class ProcesarCalculoIMC extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recopila los parámetros del formulario
        double peso = Double.parseDouble(request.getParameter("peso"));
        double estatura = Double.parseDouble(request.getParameter("estatura"));

        // Calcula el IMC
        double imc = peso / (estatura * estatura);

        // Puedes almacenar el IMC en un atributo de solicitud para mostrarlo en una página JSP
        request.setAttribute("imc", imc);

        // Redirige al usuario a una página para mostrar el resultado del cálculo
        request.getRequestDispatcher("resultadoIMC.jsp").forward(request, response);
    }
}

