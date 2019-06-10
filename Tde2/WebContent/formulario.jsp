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



	<form method="post" action="CadastrarFesta">
		<fieldset>
			<legend>Dados da festa para ser cadastrada</legend>

			<p>
				<label for="cliente">Cliente: </label> <input type="text"
					id="cliente" name="cliente" value="">
			</p>

			<p>
				<label for="aniversariante">Aniversariante: </label> <input
					type="aniversariante" id="aniversariante" name="aniversariante">
			</p>

			<p>
				<label for="tema">Tema: </label> <input type="tema" id="tema"
					list="temas" name="tema">
			</p>

			<datalist id="temas">
				<option value="A Bela e a Fera"></option>
				<option value="Cinderela"></option>
				<option value="Harry Potter"></option>
			</datalist>

			<p>
				<label for="data">Data: </label> <input type="date" id="data"
					name="data">
			</p>
			
			<p>
				<label for="horaInicio">Hora Início: </label> <input type="time"
					id="horaInicio" name="horaInicio">
			</p>

			<p>
				<label for="horaTermino">Hora Término: </label> <input type="time"
					id="horaTermino" name="horaTermino">
			</p>

			<p>
				<input type="submit" value="Cadastrar Festa">
			</p>
		</fieldset>
	</form>
</body>

</html>