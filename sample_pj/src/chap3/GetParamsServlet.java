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
 * Servlet implementation class GetParamsServlet
 */
@WebServlet(
		name = "GetParamsServ",
		urlPatterns = { "/getParams" },
		initParams = {
				@WebInitParam(name = "contentType", value = "text/html;charset=UTF-8")
		})
public class GetParamsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String contentType;

	@Override
	public void init() throws ServletException {
		ServletConfig sc = getServletConfig();
		this.contentType = sc.getInitParameter("contentType");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
		//リクエストパラメータの値を取得
		String[] colors = request.getParameterValues("color");
		//コンテンツタイプを設定
		response.setContentType(this.contentType);
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<p>選択した値</p>");
		for(String color : colors){
			pw.println(color+"<br>");
		}
		pw.println("</body>");
		pw.println("</html>");
	}

}
