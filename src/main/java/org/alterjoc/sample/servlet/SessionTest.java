package org.alterjoc.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest
 */
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println(new ServerData().getData(request));

		HttpSession sess = request.getSession(true);
		Integer count = (Integer)sess.getAttribute("count");
		if (count == null) {
			out.println("initializing session vacriable ...");
			count=0;
		}
		count++;
		sess.setAttribute("count", count);

		out.println("session count: " + count);


		out.println("EOF.");

		System.out.println("requested@" + System.currentTimeMillis() + " " + request.getRequestURI() + "?" + request.getQueryString() + " sesId:" + request.getRequestedSessionId());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
