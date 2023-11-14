package chap4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet(
		name = "RedirectServ",
		urlPatterns = { "/redirect" }
		)
public class RedirectServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
		//to.htmlにリダイレクト
		response.sendRedirect("chap4/to.html");
	}

}
