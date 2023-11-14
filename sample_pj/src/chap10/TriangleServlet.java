package chap10;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TriangleServlet
 */
@WebServlet(name = "TriangleServ", urlPatterns = { "/triangle" })
public class TriangleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = "chap10/triangle.jsp";
		Triangle tri = new Triangle();
		tri.setBase(5);
		tri.setHeight(3);
		request.setAttribute("triangle", tri);
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}
}
