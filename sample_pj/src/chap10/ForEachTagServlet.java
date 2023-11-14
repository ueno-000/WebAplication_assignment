package chap10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForEachTagServlet
 */
@WebServlet(name = "ForEachTagServ", urlPatterns = { "/forEachTag" })
public class ForEachTagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = "chap10/forEachTag.jsp";
		List<String> list = new ArrayList<String>();
		list.add("バナナ");
		list.add("リンゴ");
		list.add("イチゴ");
		request.setAttribute("myList", list);
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}
}
