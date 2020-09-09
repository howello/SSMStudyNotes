package com.neusoft.ssm.Interceptor;

import com.neusoft.ssm.POJO.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        System.out.println("拦截URL：" + url);

        if (url.contains("/toLogin")) {
            System.out.println("toLogin");
            return true;
        }
        if (url.contains("/login")) {
            System.out.println("login");
            return true;
        }

        HttpSession session = request.getSession();
        System.out.println("Session:" + session);
        User user = (User) session.getAttribute("user_session");
        System.out.println("USER: " + user);
        if (user != null) {
            return true;
        }

        request.setAttribute("msg", "还没有登录，请先登录");
        request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
