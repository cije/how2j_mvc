package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        if("admin".equals(name)&&"admin".equals(password)){
            req.getSession().setAttribute("userName",name);
            resp.sendRedirect("listHero");
        }else {
            resp.sendRedirect("./");
        }
    }
}
