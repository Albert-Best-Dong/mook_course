package com.course.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "EncodeFilter", urlPatterns = "/*", initParams = {@WebInitParam(name = "charset", value = "utf-8")})
public class EncodeFilter implements Filter {
    String charset = null;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        charset = filterConfig.getInitParameter("charset");
        System.out.println("字符集："+charset);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        request.setCharacterEncoding(charset);
        response.setCharacterEncoding(charset);
        response.setContentType("text/html; charset=UTF-8");
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
