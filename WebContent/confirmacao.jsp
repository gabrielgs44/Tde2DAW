<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
	<html lang="pt-br">
		<head>
		<meta charset="utf-8">
		<title>Formulário</title>
		</head>
	<body>
		<%
			String cliente = request.getParameter("cliente");
			String aniversariante = request.getParameter("aniversariante");
			String tema = request.getParameter("tema");
			String data = request.getParameter("data");
			String horaInicio = request.getParameter("horaInicio");
			String horaTermino = request.getParameter("horaTermino");
		%>
		<h2>Cadastro de Festa</h2>
		<fieldset>
			<legend>Dados da Festa</legend>
			<p>A seguinte festa foi cadastrada com sucesso!</p>
			<p>
				Cliente: <%=cliente %><br />
				Aniversariante: <%=aniversariante %><br />
				Tema: <%=tema %><br />
				Data: <%=data %><br />
				Hora de Início: <%=horaInicio %><br />
				Hora de Término: <%=horaTermino %><br />
			</p>
			
		</fieldset>
	</body>
</html>