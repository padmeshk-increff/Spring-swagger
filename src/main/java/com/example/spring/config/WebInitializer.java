package com.example.spring.config;

import jakarta.servlet.ServletRegistration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    // Root application context (services, repositories, beans shared across servlets)
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{}; // can add AppRootConfig.class if you have one
    }

    // Servlet application context (Spring MVC beans: controllers, view resolvers)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    // DispatcherServlet mapping
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; // map all requests
    }

}
