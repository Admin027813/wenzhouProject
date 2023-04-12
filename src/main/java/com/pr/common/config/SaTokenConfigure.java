package com.pr.common.config;


import com.google.common.collect.Lists;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import cn.dev33.satoken.interceptor.SaRouteInterceptor;

import java.util.List;

/**
 * @program: springboot
 * @description:
 * @author: ljc
 * @create: 2023-04-12 16:57
 **/
@SpringBootConfiguration
public class SaTokenConfigure implements WebMvcConfigurer {
    // 注册拦截器,去掉swagger的拦截
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        List<String> urls = Lists.newArrayList();
//        urls.add("/*.html");
//        urls.add("/favicon.ico");
//        urls.add("/**/*.html");
//        urls.add("/**/*.css");
//        urls.add("/**/*.js");
//        urls.add("/swagger-resources/**");
//        urls.add("/v2/api-docs/**");
//        urls.add("/actuator/**");
//        urls.add("/webjars/**");
//        urls.add();
        // 注册Sa-Token的路由拦截器
        registry.addInterceptor(new SaRouteInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login/login");
    }
}
