package com.example.demo.api;

import java.util.List;
import java.util.UUID;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/book")
@RestController
public class BookController {
    
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping(path = "{id}")
    public Book getBookById(@PathVariable("id") UUID id) {
        return bookService.getBookById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteBookById(@PathVariable("id") UUID id) {
        bookService.deleteBookById(id);
    }

    @PutMapping
    public void updateBookById(@RequestBody Book updateBook) {
        bookService.updateBookById(updateBook.getId(), updateBook);
    }
}
