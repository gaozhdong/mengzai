package com.reformer.wt_census.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootConfiguration
public class LogSpringMVCConfig implements WebMvcConfigurer {
    @Autowired
    LogInterceptor logInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor).addPathPatterns("/**").excludePathPatterns( "/errors", "/welcome", "/log", "/css/**", "/images/**","/tablees", "/index/**", "/script/**", "/xing/**");//排除这些请求
    }
}
