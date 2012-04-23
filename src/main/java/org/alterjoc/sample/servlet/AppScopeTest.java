package org.alterjoc.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AppScopeTest
 */
public class AppScopeTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppScopeTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("It works!");
		out.println("-- -- --");

		out.println("local address: " + request.getLocalAddr() + "(" + request.getLocalName() +  ")" + ":" + request.getLocalPort());

		out.println("TS:" + System.currentTimeMillis());
		out.println("-- -- --");
		//session
		HttpSession sess = request.getSession(true);
		Integer sessCount = (Integer)sess.getAttribute("count");
		if (sessCount == null) {
			out.println("initializing session variable ...");
			sessCount=0;
		}
		sessCount++;
		sess.setAttribute("count", sessCount);

		out.println("session count: " + sessCount);
		out.println("-- -- --");

		//app
		Integer appCount = (Integer)getServletContext().getAttribute("count");
		if (appCount == null) {
			out.println("initializing servlet context variable ...");
			appCount=0;
		}
		appCount++;
		getServletContext().setAttribute("count", appCount);

		out.println("servlet context count: " + appCount);

		out.println("-- -- --");
		out.println("EOF.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
