package com.valtech.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
        Integer count = (Integer)session.getAttribute("count");
        if (count==null) {
        session.setAttribute("count",1);
        count =1;
    }else {
        session.setAttribute("count",count+1);
    }
        ServletContext ctx= session.getServletContext();
        Integer globalCount = (Integer)ctx.getAttribute("count");
        if(globalCount==null) {
            ctx.setAttribute("count",1);
            globalCount=1;
        }else {
            ctx.setAttribute("count",globalCount+1);
        }
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("Counter with http session");
        out.println("</title>");
        out.println("<body>");
        out.println("<h2>");
        out.println("First servlet <br/>");
        out.println(request.getAttribute("info"));
        out.println("You Have visited this page "+count+" times </br>");
        out.println("This site was visited "+globalCount+" times");
        out.println("</h2>");
        out.println("</head>");
        out.println("</html>");
	
	}

	
}
