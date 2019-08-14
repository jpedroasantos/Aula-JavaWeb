package br.com.fiap.javaweb.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/exer02")
public class Exer02 extends HttpServlet{

	private static final long serialVersionUID = 5593677696377216026L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		
		String nome = req.getParameter("nome"); 
		String sobrenome = req.getParameter("sobrenome");
		
		out.println("<html><body>");
		out.println("<h3>"+nome+"</h3>");
		out.println("<p>"+sobrenome+"</p");
		out.println("</body></html>");
		out.flush();
		out.close();
	}
}
