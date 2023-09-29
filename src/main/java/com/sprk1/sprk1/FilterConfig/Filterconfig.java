package com.sprk1.sprk1.FilterConfig;

import com.sprk1.sprk1.Filters.loginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Filterconfig {
    @Bean
    public FilterRegistrationBean<loginFilter> registrationBean(){
        FilterRegistrationBean<loginFilter> registrationBean = new FilterRegistrationBean<loginFilter>();
        registrationBean.setFilter(new loginFilter());
        registrationBean.addUrlPatterns("/Dashboard");
        registrationBean.addUrlPatterns("/Dashboard/*");
        return registrationBean;
    }
}
