<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultados de búsqueda de Pacientes</title>
</head>
<body>
    <h1>Resultados de búsqueda de Pacientes</h1>
    
    
    <form action="detalle">
    <input type="text" name="nombre" placeholder="Ingrese el nombre">
    <button type="submit">Buscar</button>
	</form>
    
    
    
    <c:if test="${not empty pacientes}">
        <table>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>fechaNacimiento</th>
                <!-- Agrega más columnas según los atributos de tu entidad Paciente -->
            </tr>
            <c:forEach var="paciente" items="${pacientes}">
                <tr>
                    <td>${paciente.id}</td>
                    <td>${paciente.nombre}</td>
                    <td>${paciente.fechaNacimiento}</td>
                    <!-- Agrega más columnas según los atributos de tu entidad Paciente -->
                </tr>
            </c:forEach>
        </table>
    </c:if>
    
    <c:if test="${empty pacientes}">
        <p>No se encontraron pacientes con ese nombre.</p>
    </c:if>
</body>
</html>
