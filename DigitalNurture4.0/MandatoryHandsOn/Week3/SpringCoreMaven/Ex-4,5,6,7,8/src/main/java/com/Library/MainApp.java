package com.Library;

import com.Library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.addBook("JAVA Book");
        bookService.addBook("New Aspect Oriented Programming");
        bookService.addBook("Dependecy Injection ");
        bookService.displayallbooks();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
