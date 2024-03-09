<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Iniciar Sesi�n</title>
    <!-- Incluye los estilos de Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1>Iniciar Sesi�n</h1>
        <form action="procesarInicioSesion" method="post">
            <div class="form-group">
                <label for="nombreUsuario">Nombre de Usuario</label>
                <input type="text" class="form-control" id="nombreUsuario" name="nombreUsuario" required>
            </div>
            <div class="form-group">
                <label for="contrasena">Contrase�a</label>
                <input type="password" class="form-control" id="contrasena" name="contrasena" required>
            </div>
            
        </form>
        <a href="calculateIMC2.jsp"class="btn btn-primary">Iniciar Sesi�n</a>
        <!-- Bot�n para redirigir al usuario a la p�gina de registro -->
        <a href="register3.jsp" class="btn btn-secondary mt-3">Registrarse</a>
    </div>
</body>
</html>

