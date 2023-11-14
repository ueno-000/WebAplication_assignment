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
 * Servlet implementation class GetParamServlet
 */
@WebServlet(
		name = "GetParamServ",
		urlPatterns = { "/getParam" },
		initParams = {
				@WebInitParam(name = "contentType", value = "text/html;charset=UTF-8")
		})
public class GetParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//コンテンツタイプを格納するフィールド
	private String contentType;

	@Override
	public void init() throws ServletException {
		//ServletConfigオブジェクトの取得
		ServletConfig sc = getServletConfig();
		//サーブレット初期化パラメータの値を取得し、フィールドに代入
		this.contentType = sc.getInitParameter("contentType");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
		//リクエストパラメータの値を取得
		String value = request.getParameter("no");
		//コンテンツタイプを設定
		response.setContentType(this.contentType);
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>入力値："+value+"</h1>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
