package com.example.demo.api;

// import java.util.List;
// import java.util.UUID;

// import com.example.demo.model.Book;
import com.example.demo.model.Monitor;
import com.example.demo.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RequestMapping("api/v1")
@RestController
public class BookController {
    
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // @PostMapping
    // public void addBook(@RequestBody Book book) {
    //     bookService.addBook(book);
    // }

    // @GetMapping
    // public List<Book> getAllBooks() {
    //     return bookService.getAllBooks();
    // }

    @GetMapping(path = "greeting")
    public String greeting() {
        return "Hello from " + System.getenv("USERNAME");
    }

    // @GetMapping(path = "{id}")
    // public Book getBookById(@PathVariable("id") UUID id) {
    //     return bookService.getBookById(id).orElse(null);
    // }

    // @DeleteMapping(path = "{id}")
    // public void deleteBookById(@PathVariable("id") UUID id) {
    //     bookService.deleteBookById(id);
    // }

    // @PutMapping
    // public void updateBookById(@RequestBody Book updateBook) {
    //     bookService.updateBookById(updateBook.getId(), updateBook);
    // }

    @GetMapping(path = "monitoring.json")
    public Monitor monitoring() {
        HashMap<String, String> envAbbreviate = new HashMap<String, String>();
        envAbbreviate.put("p", "PROD");
        envAbbreviate.put("u", "UAT");
        envAbbreviate.put("t", "SIT");
        envAbbreviate.put("d", "DEV");
        String hostname = "sgld1234567";
        Monitor data = new Monitor(envAbbreviate.get(hostname.substring(3,4)),hostname,"Green");
        return data;
    }
}
