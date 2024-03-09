<%-- 
    Document   : calculateIMC
    Created on : 3 nov. 2023, 17:28:42
    Author     : razpi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cálculo de IMC</title>
    <!-- Incluye los estilos de Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1>Cálculo de IMC</h1>
        <form action="procesarCalculoIMC" method="post">
            <div class="form-group">
                <label for="peso">Peso (kg)</label>
                <input type="number" step="0.1" class="form-control" id="peso" name="peso" required min="0.1">
            </div>
            <button type="submit" class="btn btn-primary">Calcular IMC</button>
        </form>
        <!-- Aquí puedes mostrar el resultado del cálculo del IMC -->
        <div class="mt-3">
            <h2>Resultado del IMC:</h2>
            <p>Su IMC es: XX.XX</p>
        </div>
    </div>
</body>
</html>
