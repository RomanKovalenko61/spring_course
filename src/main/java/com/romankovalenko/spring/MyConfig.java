package com.romankovalenko.spring;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("com.romankovalenko.spring")
public class MyConfig {

    @Bean
    @Scope("singleton") // default
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
