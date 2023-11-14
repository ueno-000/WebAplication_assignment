package chap5;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter(
		urlPatterns = { "/*" },
		initParams = {
				@WebInitParam(name = "contentType", value = "text/html;charset=UTF-8")
		})
public class MyFilter implements Filter {
	//コンテンツタイプを格納するフィールド
	private String contentType;

    public MyFilter() {}

	public void destroy() {}

	public void doFilter(ServletRequest request,ServletResponse response,
						FilterChain chain) throws IOException, ServletException {
		// pass the request along the filter chain
		chain.doFilter(request, response);
		//レスポンスオブジェクトにコンテンツタイプを設定
		response.setContentType(this.contentType);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		//初期化パラメータの取得
		this.contentType = fConfig.getInitParameter("contentType");
	}

}
