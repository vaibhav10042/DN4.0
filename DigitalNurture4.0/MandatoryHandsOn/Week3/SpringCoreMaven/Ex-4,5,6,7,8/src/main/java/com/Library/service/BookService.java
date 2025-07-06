package com.Library.service;

import com.Library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class BookService {
    private BookRepository bookRepository;
    private String welcomeMessage;
    //setter for spring
    //to inject dependency inject
    @Autowired
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    ArrayList<String> list = new ArrayList<>();
    public void addBook(String title){
        System.out.println("Adding Book.");
        bookRepository.save(title);
        list.add(title);
    }
    public void displayallbooks(){
        for (String s : list) {
            System.out.println(s);
        }
    }
    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
        System.out.println("BookService: Welcome message '" + welcomeMessage + "' injected via setter (XML).");
    }
}
