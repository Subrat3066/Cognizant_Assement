package com.Library.Service;

import com.Library.Repository.BookRepository;

public class BookService {

    private BookRepository repository;

    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void service() {
        System.out.println("Book Service is Working...");
        repository.display();
    }


}