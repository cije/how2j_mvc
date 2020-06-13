package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 在用户是否登陆的验证中，我们可以通过在HeroListServlet中增加对session的判断代码来做到登陆验证。
 * <p>
 * 但是按照这样的做法，所有的Servlet都要加上一样的代码，就会显得比较累赘。
 * <p>
 * 与通过Filter处理中文问题一样，也可以通过Filter一次性解决所有的登陆验证问题
 */
public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String uri = request.getRequestURI();
        System.out.println();
        if(uri.endsWith(".js")||uri.endsWith(".css")||uri.endsWith(".png")){
            filterChain.doFilter(request,response);
        }
        if (uri.endsWith("mvc/") || uri.endsWith("index.jsp") || uri.endsWith("login")) {
            filterChain.doFilter(request, response);
            return;
        }

        String userName = (String) request.getSession().getAttribute("userName");
        if (null == userName) {
            response.sendRedirect("/mvc/");
            return;
        }
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
