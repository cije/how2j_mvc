package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Filter一定会随着tomcat的启动自启动。
        System.out.println("First Filter init()");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;

        String ip=request.getRemoteAddr();
        String url=request.getRequestURL().toString();
        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String date=formatter.format(localDateTime);

        System.out.printf("%s %s访问了 %s%n",date,ip,url);
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
