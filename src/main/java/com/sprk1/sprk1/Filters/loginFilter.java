package com.sprk1.sprk1.Filters;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
//@Component
public class loginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("hello from login filter");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
