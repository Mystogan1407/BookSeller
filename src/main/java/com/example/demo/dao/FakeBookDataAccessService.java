package com.example.demo.dao;

import com.example.demo.model.Book;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

@Repository("fakeDao")
public class FakeBookDataAccessService implements BookDao {
    private static List<Book> DB = new ArrayList<>();

    @Override
    public int insertBook(UUID id, Book book) {
        DB.add(new Book(id, book.getName()));
        return 1;
    }
}
