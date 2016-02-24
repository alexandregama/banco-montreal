package br.com.bancomontreal;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/minha-servlet")
public class MinhaServlet extends HttpServlet {

	private static final long serialVersionUID = -7422006951287550625L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Its Working!");
	}
	
}
