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
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	 System.out.println(getInitParameter("driverClassName"));
    	 System.out.println(getInitParameter("dbUrl"));
    	 System.out.println(getInitParameter("dbUsername"));
    	 System.out.println(getInitParameter("dbPassword"));
    	 System.out.println("Init method of Hello Servlet");
    }
    
    @Override
    public void destroy() {
    System.out.println("Destroy Method of Hello Servelet");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
		 Integer count = (Integer)session.getAttribute("count");
		 if(count == null)
		 {
			 
		 
		 session.setAttribute("count",1 );
		 count=1;
		 }
		 else {
			 session.setAttribute("count", count+1);
		 }
		 ServletContext ctx =session.getServletContext();
		 Integer globalCount = (Integer)ctx.getAttribute("count");
		 if(globalCount == null) {
			 ctx.setAttribute("count", 1);
			 globalCount =1;
		 }
		 else {
			 ctx.setAttribute("count", globalCount+1);
		 }
		 PrintWriter out = response.getWriter();
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<tittle>");
		 out.println("Hello");
		 out.println("</tittle>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<h2>");
		
		 out.println("You have visited this page" +count+" Times</br>");
		 out.println("This site was visited "+globalCount+" times");
		 out.println("</h2>");
		 out.println("</body>");
		 out.println("</html>");
		 request.setAttribute("info", "This works only for forward");
//       request.getRequestDispatcher("/Firstt").forward(request, response);
         response.sendRedirect("First");
		 
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		PrintWriter out = response.getWriter();
//		response.getWriter().append("Server at:").append(request.getContextPath());
//		
//	}

}
