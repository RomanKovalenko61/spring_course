package com.romankovalenko.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* com.romankovalenko.aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {
    }

    @Pointcut("execution(public void com.romankovalenko.aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {
    }

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {
    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
    }

//    @Pointcut("execution(* com.romankovalenko.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* com.romankovalenko.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromIniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromIniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromIniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу/журнал");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: Проверка прав на получение книги/журнала");
//    }

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

//    @Before("execution(public void getBook(com.romankovalenko.aop.Book, ..))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
//    }
//
//    @Before("execution(* *(..))")
//    public void anyMethodAdvice() {
//        System.out.println("anyMethodAdvice: любой метод с любым количеством параметров");
//    }

//    @Before("execution(public void get*())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
//    }

//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: Попытка вернуть книгу");
//    }
}
