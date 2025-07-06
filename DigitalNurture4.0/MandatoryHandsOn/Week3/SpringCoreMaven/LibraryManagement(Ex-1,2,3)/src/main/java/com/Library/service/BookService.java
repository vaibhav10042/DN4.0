package com.Library.service;

import com.Library.repository.BookRepository;

import java.util.ArrayList;

public class BookService {
    private BookRepository bookRepository;
    //setter for spring
    //to inject dependency inject
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
}
