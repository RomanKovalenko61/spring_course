package com.romankovalenko.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.romankovalenko.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
