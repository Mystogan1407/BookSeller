package com.example.demo.dao;

import com.example.demo.model.Book;
import java.util.UUID;
import java.util.List;

public interface BookDao {
    int insertBook(UUID id, Book book);

    default int insertBook(Book book) {
        UUID id = UUID.randomUUID();
        return insertBook(id, book);
    }

    List<Book> selectAllBooks();
}
