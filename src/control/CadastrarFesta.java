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

        int inicio = Integer.parseInt(horaInicio.substring(0, 2));
        int termino = Integer.parseInt(horaTermino.substring(0, 2));
        
        if(inicio == 0 || inicio == 00)
            inicio = 24;
        
        if (termino < inicio) {
            if((termino > 0 || termino > 00 ) && termino <= 7) {
                if(inicio > 15 && inicio <= 24)
                    return resultado;
                else
                    resultado = false;
            }else
                resultado = false;
        }
        return resultado;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cliente = request.getParameter("cliente");
        String aniversariante = request.getParameter("aniversariante");
        String tema = request.getParameter("tema");
        String data = request.getParameter("data");
        String horaInicio = request.getParameter("horaInicio");
        String horaTermino = request.getParameter("horaTermino");

        Festa party = new Festa(cliente, aniversariante, tema, data, horaInicio, horaTermino);

        if (validarDados(horaInicio, horaTermino)) {
            RequestDispatcher desp = request.getRequestDispatcher("cadastrar.jsp");
            desp.forward(request, response);
        } else {
            request.setAttribute("festa", party);
            RequestDispatcher desp = request.getRequestDispatcher("formulario.jsp");
            desp.forward(request, response);
        }
    }

}
