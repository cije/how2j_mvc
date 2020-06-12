package servlet;

import bean.Hero;
import dao.HeroDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HeroAddServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name=req.getParameter("name");
        float hp=Float.parseFloat(req.getParameter("hp"));
        int damage=Integer.parseInt(req.getParameter("damage"));
        Hero newHero=new Hero(name,hp,damage);
        new HeroDAO().add(newHero);
        resp.sendRedirect("listHero");
    }
}
