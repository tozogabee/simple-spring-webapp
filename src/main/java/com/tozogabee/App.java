package com.tozogabee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 */

@SpringBootApplication
public class App {
    public static void main(String[] args)
    {
        SpringApplication.run(App.class,args);
    }

    @Bean
    public EmbeddedServletContainerFactory embeddedServletContainerFactory()
    {
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
        factory.setPort(1000);
        return factory;
    }


}
