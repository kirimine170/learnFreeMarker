package com.kirimine170.learn.freemarker.config;

import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer
{

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry)
    {
        registry.freeMarker();
    }

    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer()
    {
        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
        //configurer.setTemplateLoaderPath("/WEB-INF/freemarker"); 
        // NOTE WebappやWEB-INFはjarでまとめる場合には使用できない
        configurer.setTemplateLoaderPath("classpath:templates");
        return configurer;
    }

    // NOTE 以下の設定はしなくても動くっぽい？(自動で設定されるのかも)
    // @Bean
    // public FreeMarkerViewResolver freemarkerViewResolver()
    // {
    //     FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
    //     resolver.setCache(true);
    //     resolver.setPrefix("");
    //     resolver.setSuffix(".ftl");
    //     return resolver;
    // }
}
