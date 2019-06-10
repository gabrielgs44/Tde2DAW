package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Festa;

@WebServlet("/CadastrarFesta")
public class CadastrarFesta extends HttpServlet {
	
	public boolean validarDados(String horaInicio, String horaTermino) {
		boolean resultado = true;
		
		float inicio = Float.parseFloat(horaInicio.substring(0,1) + '.' + horaInicio.substring(4,5) );
		float termino = Float.parseFloat(horaTermino.substring(0,1) + '.' + horaTermino.substring(4,5) );
		
		if(termino < inicio) {
			resultado = false;
		}
		
		return resultado;
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cliente = request.getParameter("cliente");
		String aniversariante = request.getParameter("aniversariante");
		String tema = request.getParameter("tema");
		String data = request.getParameter("data");
		String horaInicio = request.getParameter("horaInicio");
		String horaTermino = request.getParameter("horaTermino");
		
		Festa party = new Festa(cliente, aniversariante, tema, data, horaInicio, horaTermino);
		
		if(validarDados(horaInicio, horaTermino)) {
			RequestDispatcher desp = request.getRequestDispatcher("confirmacao.jsp");
			desp.forward(request, response);
		}else {
			request.setAttribute("festa", party);
			RequestDispatcher desp = request.getRequestDispatcher("formulario.jsp");
			desp.forward(request, response);
		}
	}

}
