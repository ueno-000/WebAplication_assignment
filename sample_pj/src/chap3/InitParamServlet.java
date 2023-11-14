package chap3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParamServlet
 */
@WebServlet(
		name = "InitParamServ",
		urlPatterns = { "/initparam" },
		initParams = {
				@WebInitParam(name = "contentType", value = "text/html;charset=UTF-8")
		})
public class InitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//コンテンツタイプを格納するフィールド
	private String contentType;

	@Override
	public void init() throws ServletException {
		//ServletConfigオブジェクトの取得
		ServletConfig sc = getServletConfig();
		//サーブレット初期化パラメータの取得
		this.contentType = sc.getInitParameter("contentType");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
		response.setContentType(this.contentType);
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>Hello World!</h1>");
		pw.println("<h1>こんにちは</h1>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
