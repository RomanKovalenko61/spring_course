package com.romankovalenko.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(public void com.romankovalenko.aop.UniLibrary.getBook())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
//    }

//    @Before("execution(public void getBook(String))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
//    }

//    @Before("execution(public void *(*))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
//    }

//    @Before("execution(public void *(..))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
//    }

    @Before("execution(public void getBook(com.romankovalenko.aop.Book, ..))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
    }

    @Before("execution(* *(..))")
    public void anyMethodAdvice() {
        System.out.println("anyMethodAdvice: любой метод с любым количеством параметров");
    }

//    @Before("execution(public void get*())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
//    }

//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: Попытка вернуть книгу");
//    }
}
