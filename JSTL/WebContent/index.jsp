<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
	<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EXERCICIOS ANDREY</title>
</head>
<body>
	<form action="index.jsp" method="post">
		<label>Velocidade por hora: </label>
		<input type="text" name="conversao" placeholder="Digite a velocidade em km/h"> 
		<button>Enviar</button>
	</form>   
</body>
</html>