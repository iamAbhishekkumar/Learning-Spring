package com.abhishek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * We are not using XML based configuration but annotation based configuration
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung s = factory.getBean(Samsung.class);
        s.config();
    }
}
