package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
@WebListener
public class MyServlet extends HttpServlet {

	@Inject
	MyService myservice;
	//private static final long serialVersionUID = 1861227452784320290L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
		
		
		
		response.getWriter().append(myservice.doStuff());
		
		
		
	}
}
