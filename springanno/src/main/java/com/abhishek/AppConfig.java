package com.abhishek;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.abhishek")
public class AppConfig {

    /*
     * @Bean // this is simialr to for xml <bean> tag
     * public Samsung getPhone() {
     * return new Samsung();
     * }
     * 
     * @Bean
     * public MobileProcessor getCPU() {
     * return new SnapDragon();
     * }
     * 
     */
}
