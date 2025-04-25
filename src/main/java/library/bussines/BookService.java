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

    public Book saveBook(Book book){
       try {
           String name = book.getName();
           boolean exist = existsByName(name);
           if (exist){
               throw new ConflictException("This book exist" + name);
           }
           return bookRepository.save(book);
       } catch (ConflictException e){
           throw new ConflictException("This book exist", e.getCause());

       }
    }
    public boolean existsByName(String name){
        return bookRepository.existsByName(name);
    }





}
