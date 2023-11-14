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

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        
        if("password".equals(password))
        {
	        response.getWriter().println(
	        		"<html>"
	        		+ "<body>"
	        			+ "<h1>メニュー</h1>"
	        			+ "<h3>ようこそ" + name + "さん</h3>"
	        		+ "</body>"
					+ "</html>");
        }
        else
        {
        	response.sendRedirect("enshu06/error.html");	        	
        }
    }
}
