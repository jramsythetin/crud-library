package library.bussines;

import library.infra.entity.Book;
import library.infra.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Book SaveBook(Book book){
        return bookRepository.save(book);
    }




}
