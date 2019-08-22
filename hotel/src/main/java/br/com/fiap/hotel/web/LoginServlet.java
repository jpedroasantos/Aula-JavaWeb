package br.com.fiap.hotel.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.hotel.bussiness.UsuarioBO;
import br.com.fiap.hotel.dao.UsuarioDAO;
import br.com.fiap.hotel.model.entities.Usuario;

@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha"); 
		
		Usuario usuario = new Usuario(login, senha); 
		out.println("<html><body>");
		
		usuario = new UsuarioBO().autenticar(usuario); 
		
		if(usuario != null) {
			new UsuarioDAO().adicionar(usuario);
			out.println("<h2>Usuário "+usuario.getNome()+" criado com sucesso.</h2>");
		} else {
			out.println("<h2 style=\"color:red;\">Deu ruim</h2>");
		}
		
		out.println("<a href=\"index.html\">Voltar para a Home</a>");
		out.println("</body></html>"); 
		out.flush();
		out.close();
	}
}
