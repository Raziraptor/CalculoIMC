<%-- 
    Document   : register
    Created on : 3 nov. 2023, 17:32:25
    Author     : razpi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registro de Usuario</title>
    <!-- Incluye los estilos de Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1>Registro de Usuario</h1>
        <form action="procesarRegistro" method="post">
            <div class="form-group">
                <label for="nombreCompleto">Nombre Completo</label>
                <input type="text" class="form-control" id="nombreCompleto" name="nombreCompleto" required>
            </div>
            <div class="form-group">
                <label for="nombreUsuario">Nombre de Usuario</label>
                <input type="text" class="form-control" id="nombreUsuario" name="nombreUsuario" required>
            </div>
            <div class="form-group">
                <label for="edad">Edad</label>
                <input type="number" class="form-control" id="edad" name="edad" required min="15">
            </div>
            <div class="form-group">
                <label for="sexo">Sexo</label>
                <select class="form-control" id="sexo" name="sexo">
                    <option value="Masculino">Masculino</option>
                    <option value="Femenino">Femenino</option>
                    <option value="Otro">Otro</option>
                </select>
            </div>
            <div class="form-group">
                <label for="estatura">Estatura (m)</label>
                <input type="number" step="0.01" class="form-control" id="estatura" name="estatura" required min="1" max="2.5">
            </div>
            <div class="form-group">
                <label for="contrasena">Contraseña</label>
                <input type="password" class="form-control" id="contrasena" name="contrasena" required>
            </div>
            <button type="submit" class="btn btn-primary">Registrarse</button>
        </form>
    </div>
</body>
</html>
