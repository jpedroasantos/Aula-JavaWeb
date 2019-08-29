package br.com.fiap.hotel.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/aluno")
public class AlunoServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); 
		PrintWriter out = resp.getWriter(); 
		
		String nome = req.getParameter("nome");
		String nota1 = req.getParameter("nota1");
		String nota2 = req.getParameter("nota2");
	}

}
