package library.controller;

import library.bussines.BookService;
import library.infra.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        return ResponseEntity.ok(bookService.saveBook(book));
    }

    @DeleteMapping
    public ResponseEntity<Book>deleteBook(@RequestBody Book book){
        bookService.deleteBook(book);
        return ResponseEntity.noContent().build();

    }
}
