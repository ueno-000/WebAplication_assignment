package enshu04;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "name04_1", urlPatterns = { "/url04_1" })
public class MenuServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        response.getWriter().println(
        		"<html>"
        		+ "<body>"
        			+ "<h1>メニュー</h1>"
        			+ "<h3>ようこそ" + name + "さん</h3>"
        		+ "</body>"
				+ "</html>");
    }
}
