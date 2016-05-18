package com.hello.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello.beans.User;

public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7211099350685653358L;
	private int counter = 0;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		User user = new User("Bob");
		counter++;
		req.setAttribute("message", "Hello World!");
		req.setAttribute("user", user);
		req.setAttribute("counter",  new Integer(counter));
		this.getServletContext().getRequestDispatcher( "/WEB-INF/jsp/Hello.jsp" ).forward( req, resp );
	}

}
