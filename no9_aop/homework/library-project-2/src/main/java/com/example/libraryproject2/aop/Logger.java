package com.example.libraryproject2.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    private static int webVisitsCount = 0;
    private static int libraryChangesCount = 0;

    //  Count the number of website visits
    @After("execution(* com.example.libraryproject2.controller.LibraryController.*(..))")
    public void count(JoinPoint joinPoint) {
        webVisitsCount++;
        System.out.println("Number of web visits: " + webVisitsCount);
    }

    //Count number of library changes
    @After("execution(* com.example.libraryproject2.controller.LibraryController.borrowBook(..)) ||" +
            "execution(* com.example.libraryproject2.controller.LibraryController.returnBook(..))")
    public void countChange(JoinPoint joinPoint) {
        libraryChangesCount++;
        System.out.println("Number of library changes: " + libraryChangesCount);
    }
}
