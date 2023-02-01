package com.example.demo.dao;

// import com.example.demo.model.Book;
import com.example.demo.model.Monitor;
import org.springframework.stereotype.Repository;

// import java.util.List;
// import java.util.Optional;
// import java.util.ArrayList;
// import java.util.UUID;

@Repository("fakeDao")
public class FakeBookDataAccessService implements BookDao {
    // private static List<Book> DB = new ArrayList<>();

    // @Override
    // public int insertBook(UUID id, Book book) {
    //     DB.add(new Book(id, book.getName()));
    //     return 1;
    // }

    // @Override
    // public List<Book> selectAllBooks() {
    //     return DB;
    // }

    // @Override
    // public Optional<Book> getBookById(UUID id) {
    //     return DB.stream()
    //             .filter(book -> book.getId().equals(id))
    //             .findFirst();
    // }

    // @Override
    // public int deleteBookById(UUID id) {
    //     Optional<Book> bookMaybe = getBookById(id);
    //     if (bookMaybe.equals(null)) {
    //         return 0;
    //     }
    //     DB.remove(bookMaybe.get());
    //     return 1;
    // }

    // @Override
    // public int updateBookById(UUID id, Book updateBook) {
    //     return getBookById(id)
    //             .map(book -> {
    //                 int indexOfBookToUpdate = DB.indexOf(book);
    //                 if (indexOfBookToUpdate >= 0) {
    //                     DB.set(indexOfBookToUpdate, new Book(id, updateBook.getName()));
    //                     return 1;
    //                 }
    //                 return 0;
    //             }).orElse(0);
    // }

    @Override
    public Monitor monitoring() {
        return null;
    }
}
