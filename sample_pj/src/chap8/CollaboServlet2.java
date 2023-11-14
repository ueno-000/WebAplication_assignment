package chap8;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CollaboServlet2
 */
@WebServlet(name = "CollaboServ2", urlPatterns = { "/collabo2" })
public class CollaboServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message ="Servletで処理したデータ";
		String path = "chap8/collabo2.jsp";
		//変数messageをHttpServletRequestオブジェクトに登録
		//キー：myMessage、値：変数messageの値
		request.setAttribute("myMessage", message);
		//pathを指定してRequestDispatcherオブジェクトの取得
		RequestDispatcher rd = request.getRequestDispatcher(path);
		//指定したpathにフォワード（転送）
		rd.forward(request, response);
	}
}
