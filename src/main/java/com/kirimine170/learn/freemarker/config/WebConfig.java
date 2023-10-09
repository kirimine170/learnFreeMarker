package com.kirimine170.learn.freemarker.config;

import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer
{

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry)
    {
        registry.freeMarker();
    }

    // Configure FreeMarker...

    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer()
    {
        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
        //configurer.setTemplateLoaderPath("/WEB-INF/freemarker"); 
        // NOTE WebappやWEB-INFはjarでまとめる場合には使用できない
        configurer.setTemplateLoaderPath("/src/main/resources/templates");
        return configurer;
    }
}
