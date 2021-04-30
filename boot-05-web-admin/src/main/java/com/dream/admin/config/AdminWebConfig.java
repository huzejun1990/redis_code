package com.dream.admin.config;

import com.dream.admin.interceptor.LoginInterceptor;
import com.dream.admin.interceptor.RedisUrlCountInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @Author: huzejun
 * @Date: 2021/4/5 17:50
 */

/**
 * 1、编写一个拦截器实现HandlerInterceptor接口
 * 2、拦截器注册到容器中（实现WebMvcConfigurer的addInterceptors）
 * 3、指定拦截规则【如果是拦截所有，静态资源也会被拦截】
 *
 * @EnableWebMvc:全面接管
 *        1、静态资源？视图解析器？欢迎页面。。。。全部失效
 *
 */
//@EnableWebMvc
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    /**
     * Filter、Interceptor 几乎拥有相同的功能？
     * Filter是Servlet原生的组件，好处，脱离了spring也能用
     * Interceptor是Spring定义的接口，可以Spring的自动装配功能
     */
//    @Autowired //排除 redis服务
    RedisUrlCountInterceptor redisUrlCountInterceptor;

    /**
     * 定义静态资源行为
     * @param registry
     */
/*    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        *//**
         * 访问 /aa/** 所有请求都去 classpath:/static/ 下面进行匹配
         *//*
        registry.addResourceHandler("/aa/**")
                .addResourceLocations("classpath:/static/**");

        WebMvcConfigurer.super.addResourceHandlers(registry);
    }*/

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**") //所有请求都被拦截包括所有请求
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**",
                        "/js/**","/aa/**"); ///login    //放行的请求

/*        registry.addInterceptor(redisUrlCountInterceptor)
//                .addPathPatterns("/**")
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**",
                        "/js/**","/templates/**","/table/*","/aa/**","/redisUrlCountInterceptor/**");
    }*/
        //禁用redis服务
/*                registry.addInterceptor(redisUrlCountInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**",
                        "/js/**","/aa/**");*/
    }


    //排除 redis服务
/*    @Bean
    public WebMvcRegistrations webMvcRegistrations(){
        return new WebMvcRegistrations(){
            @Override
            public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
                return null;
            }
        };
    }*/


}
