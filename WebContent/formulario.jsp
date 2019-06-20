<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="model.Festa"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Formulário</title>
</head>

<body>


	<h1>Cadastro de Festa</h1>

	<%	Festa festa = (Festa)request.getAttribute("festa");
		boolean falha = false; 
	%>

	<form method="post" action="Cadastrar">
		<fieldset>
			<legend>Dados da festa para ser cadastrada</legend>

			<%
				if (festa != null) 
					falha = true;
				else if(festa == null)
					festa = new Festa("", "", "", "", "", "");
				%>
			<p>
				<label for="cliente">Cliente: </label> <input
					type="text" id="cliente" name="cliente" value="<%=festa.getCliente() %>">
			</p>
			<p>
				<label for="aniversariante">Aniversariante: </label> <input
					type="text" id="aniversariante" name="aniversariante" value="<%=festa.getAniversariante() %>">
			</p>

			<p>
				<label for="tema">Tema: </label> <input type="text" id="tema"
					list="temas" name="tema" value="<%=festa.getTema() %>">
			</p>

			<datalist id="temas">
				<option value="A Bela e a Fera"></option>
				<option value="Cinderela"></option>
				<option value="Harry Potter"></option>
			</datalist>

			<p>
				<label for="data">Data: </label> <input type="date" id="data"
					name="data" value="<%=festa.getData() %>">
			</p>
			<%if(falha == true) {%>
				<p style="background-color: red;"><font color="white"><b>A hora de término não pode ser menor que a hora de início!!</b></font></p>
				<%} %>
			<p>
				<label for="horaInicio">Hora Início: </label> <input type="time"
					id="horaInicio" name="horaInicio" value="<%=festa.getHoraInicio() %>">
			</p>

			<p>
				<label for="horaTermino">Hora Término: </label> <input type="time"
					id="horaTermino" name="horaTermino" value="<%=festa.getHoraTermino() %>">
			</p>

			<p>
				<input type="submit" value="Cadastrar Festa">
			</p>
		</fieldset>
	</form>
</body>

</html>