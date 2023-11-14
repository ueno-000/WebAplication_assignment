package chap10;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DuplicateKeyServlet
 */
@WebServlet(name = "DuplicateKeyServ", urlPatterns = { "/duplicate"})
public class DuplicateKeyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String key = "result";
		String path = "/chap10/duplicatKey.jsp";
		HttpSession session = request.getSession(true);
		request.setAttribute(key, "リクエストオブジェクトに登録");
		session.setAttribute(key, "セッションオブジェクトに登録");
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}
}
