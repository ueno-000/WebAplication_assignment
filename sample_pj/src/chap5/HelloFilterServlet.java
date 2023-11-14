package chap5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloFilterServlet
 */
@WebServlet(name = "HelloFilterSer", urlPatterns = { "/helloFilter" })
public class HelloFilterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>Hello World!</h1>");
		pw.println("<h1>初めてのフィルタ</h1>");
		pw.println("</body>");
		pw.println("</html>");

	}

}
