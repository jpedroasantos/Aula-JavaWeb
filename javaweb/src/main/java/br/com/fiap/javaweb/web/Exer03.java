package br.com.fiap.javaweb.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/exer03")
public class Exer03 extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String data = req.getParameter("data"); 
		Date agora = new Date();
		PrintWriter out = resp.getWriter(); 
		
		out.println("<html><body>");
		out.println("<h1>Data de hoje: "+df.format(agora)+"</h1>");
		try {
			Date informada = df.parse(data);
			out.println("<h1>"+informada+"</h1>"); 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		out.println("</body></html>");
		out.flush();
		out.close();
	}
}
