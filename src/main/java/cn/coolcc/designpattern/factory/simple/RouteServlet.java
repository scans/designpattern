package cn.coolcc.designPatterns.factory.simple;

import cn.coolcc.designPatterns.factory.simple.action.IAction;
import cn.coolcc.designPatterns.factory.simple.action.ActionFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * web.xml 配置:
 * <servlet>
 * <servlet-name>route</servlet-name>
 * <servlet-class>RouteServlet</servlet-class>
 * </servlet>
 * <servlet-mapping>
 * <servlet-name>route</servlet-name>
 * <url-pattern>/route/*</url-pattern>
 * </servlet-mapping>
 */
public class RouteServlet extends HttpServlet {
    private static final String PREFIX = "route/";


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        Matcher matcher = Pattern.compile("(?<=" + PREFIX + ").*").matcher(uri);
        String actionStr = "register";
        if (matcher.find()) {
            actionStr = matcher.group();
        }
        try {
            IAction IAction = ActionFactory.createAction(actionStr);
            IAction.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
