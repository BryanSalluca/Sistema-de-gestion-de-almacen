<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Sistema de Almacen</title>
</head>
<body>
    <h1>Sistema de Almacen</h1>
    <table id="almacen">
        <thead>
            <tr>
                <th>Nombre</th>
                <th>Cantidad</th>
            </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <h2>Requerimiento</h2>
    <form id="formulario">
        <label for="nombre">Producto:</label>
        <input type="text" id="nombre" required>
        <br>
        <label for="cantidad">Cantidad:</label>
        <input type="text" id="cantidad" required>
        <br>
        <button type="submit">Generar Pedido</button>
    </form>
</body>
</html>
