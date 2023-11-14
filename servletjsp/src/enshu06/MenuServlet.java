package enshu06;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "name06_1", urlPatterns = { "/url06_1" })
public class MenuServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String password = request.getParameter("password");

        if ("password".equals(password)) {
            // 一致する場合、メニュー画面を表示する
            String name = request.getParameter("name");
            //response.setContentType("text/html; charset=UTF-8");
            response.getWriter().println(
	        		"<html>"
	        		+ "<body>"
	        			+ "<h1>メニュー</h1>"
	        			+ "<h3>ようこそ" + name + "さん</h3>"
	        		+ "</body>"
					+ "</html>");
        } 
        else {
            // 一致しない場合、エラー画面にリダイレクトする
            response.sendRedirect("enshu06/error.html");
        }
    }
}
