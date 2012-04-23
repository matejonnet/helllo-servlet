package org.alterjoc.sample.servlet.ejb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.alterjoc.sample.servlet.ServerData;

/**
 * Servlet implementation class SfsbTest
 */
public class SfsbTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SfsbTest() {
        super();
        // TODO Auto-generated constructor stub
    }


    SfsbCounter sfsbCounter;



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println(new ServerData().getData(request));

		out.println("Current SFSB value: " + sfsbCounter.increment(1));

		System.out.println("requested@" + System.currentTimeMillis() + " " + request.getRequestURI() + "?" + request.getQueryString() + " sesId:" + request.getRequestedSessionId());

	}


	@Inject
	public void setSfsbCounter(SfsbCounter sfsbCounter) {
		this.sfsbCounter = sfsbCounter;
	}


}
