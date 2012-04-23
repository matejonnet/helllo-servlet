/**
 *
 */
package org.alterjoc.sample.servlet.domain.ejb;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author <a href="mailto:matejonnet@gmail.com">Matej Lazar</a>
 */
public class DbSelectTest extends HttpServlet
{

	private static final long serialVersionUID = 133681861074267501L;

	@Inject
	DbSelect dbSelect;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.getWriter().print(dbSelect.getFromDb());
	}

}
