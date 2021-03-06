package wukong.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by chenxinyue on 2016/4/5.
 */
public class HelloWorldInterceptor implements HandlerInterceptor{
    @Override public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
            Object o) throws Exception {
        System.out.println("Hello world!");
        return true;
    }

    @Override public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
            Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override public void afterCompletion(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
