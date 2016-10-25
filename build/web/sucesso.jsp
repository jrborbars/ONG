<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="pt">
<head>
<title>Página de Sucesso</title>
</head>
<body>
<H1>	<c:out value="${mensagem}" /></H1>	
<jsp:include page="Doador.jsp"/>

</body>
</html>