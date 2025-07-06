package com.Library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void save(String title){
        System.out.println("BookRepository: Saving book titled "+ title);
    }
}
