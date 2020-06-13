package servlet;

import bean.Hero;
import dao.HeroDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class HeroListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=(String)req.getSession().getAttribute("userName");
        if (null==userName){
            resp.sendRedirect("./");
            return;
        }
        int start = 0, count = 5;
        try {
            start = Integer.parseInt(req.getParameter("start"));
        } catch (NumberFormatException e) {
        }
        int next = start + count;
        int pre = start - count;
        int total = new HeroDAO().getTotal();
        int last;
        if (0 == total % count) {
            last = total - count;
        } else {
            last = total - total % count;
        }
        pre = Math.max(pre, 0);
        next=next>last?last:next;
        List<Hero> heros = new HeroDAO().list(start, count);
        req.setAttribute("next", next);
        req.setAttribute("pre",pre);
        req.setAttribute("last",last);
        req.setAttribute("heros", heros);
        req.getRequestDispatcher("listHero.jsp").forward(req, resp);
    }
}
