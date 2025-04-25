package library.bussines;

import library.infra.entity.Book;
import library.infra.exceptions.ConflictException;
import library.infra.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Book saveBook(Book book) {
        try {
            String name = book.getName();
            if (existsByName(name)) {
                throw new ConflictException("This book already exists: " + name);
            }
            return bookRepository.save(book);
        } catch (ConflictException ce) {
            throw new ConflictException("Error while trying to save book: " + book.getName(), ce);
        }
    }


    public boolean existsByName(String name) {
        return bookRepository.existsByName(name);
    }


}
