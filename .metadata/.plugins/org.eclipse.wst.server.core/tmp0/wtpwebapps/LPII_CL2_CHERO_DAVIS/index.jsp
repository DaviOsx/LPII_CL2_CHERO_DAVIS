<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>
</head>
<body bgcolor="#c5dec9" >

<h1  align="center" >
INGRESAR AL SISTEMA 
</h1>

<%-- CREAR FORMULARIO --%>
<%-- ACTION HACE QUE REGRESE A MI CONTROLADOR CLIENTE --%>

<form action="ControladorProducto" method="post">
<table align="center" >

<tr>
<td> Usuario</td>
<td> <input  type="text" name="usuario"> </td>		 
</tr>

<tr>
<td> Password</td>
<td> <input  type="text" name="password"> </td>		 
</tr>

<%-- AGREGAR BOTON  --%>
<tr>
<td colspan="2"> 
<input type="submit"  value="Registar">
</td>	 
</tr>


</table>
</form>
</body>
</html>