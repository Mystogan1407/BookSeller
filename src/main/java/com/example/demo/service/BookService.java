package com.example.demo.service;

// import java.util.List;
// import java.util.Optional;
// import java.util.UUID;

import com.example.demo.dao.BookDao;
// import com.example.demo.model.Book;
import com.example.demo.model.Monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    
    private final BookDao bookDao;

    @Autowired
    public BookService(@Qualifier("fakeDao") BookDao bookDao) {
        this.bookDao = bookDao;
    }

    // public int addBook(Book book) {
    //     return bookDao.insertBook(book);
    // }

    // public List<Book> getAllBooks() {
    //     return bookDao.selectAllBooks();
    // }

    // public Optional<Book> getBookById(UUID id) {
    //     return bookDao.getBookById(id);
    // }

    // public int deleteBookById(UUID id) {
    //     return bookDao.deleteBookById(id);
    // }

    // public int updateBookById(UUID id, Book updateBook) {
    //     return bookDao.updateBookById(id, updateBook);
    // }

    public Monitor monitoring() {
        return bookDao.monitoring();
    }
}
