package chap9;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CounterServlet
 */
@WebServlet(name = "CounterServ", urlPatterns = { "/counter" })
public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//
		String keyName = "mycounter";
		String path = "chap9/counter.jsp";

		HttpSession session = request.getSession(true);
		Integer count = (Integer)session.getAttribute(keyName);
		if(count != null) {
			count += 1;
		}else {
			count = new Integer(1);
		}
		session.setAttribute(keyName, count);
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//
		HttpSession session = request.getSession(true);
		session.invalidate();
		doGet(request, response);
	}
}
