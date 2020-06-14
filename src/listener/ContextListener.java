package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("web 应用初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("web 应用销毁");
    }
}
