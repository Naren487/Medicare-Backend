package com.example.Medicare.Backend;

import java.util.Arrays;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class DefaultAuthConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry myCorsRegistry){
             myCorsRegistry.addMapping("/**")
            .allowedOrigins("http://18.204.215.152:80")  //frontend's link
            .allowedHeaders("*")
            .allowedMethods("GET","PUT")
            .allowCredentials(true)
            .maxAge(4800);
     }

}
