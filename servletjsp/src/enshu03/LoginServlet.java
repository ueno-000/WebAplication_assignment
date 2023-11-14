package enshu03;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "name03_1", urlPatterns = { "/url03_1" })
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(
        		"<html>"
    				+ "<body>"
	        			+ "<h1>ログイン画面</h1>"
	        			+ "<form action=\"/servletjsp/url03_2\" method=\"post\">"
	        			+ "<input type=\"submit\" value=\"メニュー画面へ\"></form>"
        			+ "</body>"
        		+"</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
