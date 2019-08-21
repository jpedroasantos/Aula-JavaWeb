package br.com.fiap.javaweb.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/exer05")
public class Exer05 extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); 
		String desc = req.getParameter("desc"); 
		String quant = req.getParameter("quant");
		PrintWriter out = resp.getWriter(); 
		out.println("<html><body>"); 
		out.println("<h1>Supermercado</h1>"); 
		out.println("<table border=\"1\">");
		out.println("<tr><td>Descrição</td><td>Quantidade no estoque</td></tr>"); 
		out.println("<tr><td>" + desc +"</td>"+"<td>"+ quant +"</td></tr>");
		out.println("</table>");
		out.println("</body></html>");
		out.flush();
		out.close();
	}
}
